package com.github.fakelog.aegis.common.mixin;

import com.github.fakelog.aegis.common.mixin.tool.CauldronFix;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.AbstractCauldronBlock;
import net.minecraft.block.LeveledCauldronBlock;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.ItemDispenserBehavior;
import net.minecraft.item.FluidModificationItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPointer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemDispenserBehavior.class)
public class ItemDispenserBehaviorMixin {

    @Inject(at = @At("HEAD"), method = "dispenseSilently", cancellable = true)
    void dispenseMixin(BlockPointer pointer, ItemStack stack, CallbackInfoReturnable<ItemStack> cir) {

        boolean blockIsDespenser = pointer.getBlockState().getBlock() == Blocks.DISPENSER;
        boolean itemIsBucket = stack.getItem() instanceof FluidModificationItem;

        if (blockIsDespenser && itemIsBucket) {
            BlockPos targetPos = getTargetPos(pointer);
            BlockState targetBlock = pointer.getWorld().getBlockState(targetPos);

            if (targetBlock.getBlock() instanceof AbstractCauldronBlock cauldron) {

                // Отчищаем котел
                if (stack.getItem() == Items.BUCKET) {
                    if (CauldronFix.EMPTY_MAP.containsKey(cauldron) && cauldron.isFull(targetBlock)) {
                        Item filledBucketItem = CauldronFix.EMPTY_MAP.get(cauldron);
                        stack.decrement(1);
                        pointer.getWorld().setBlockState(targetPos, Blocks.CAULDRON.getDefaultState());
                        cir.setReturnValue(new ItemStack(filledBucketItem));
                    }
                }
                // Заполняем котёл
                else if (cauldron == Blocks.CAULDRON) {
                    if (CauldronFix.FILL_MAP.containsKey(stack.getItem())) {
                        Block filledCauldronBlock = CauldronFix.FILL_MAP.get(stack.getItem());
                        BlockState filledCauldronState = filledCauldronBlock.getDefaultState();
                        try {
                            filledCauldronState = filledCauldronState.with(LeveledCauldronBlock.LEVEL, 3);
                        } catch (Exception ignored) {}

                        stack.decrement(1);
                        pointer.getWorld().setBlockState(targetPos,filledCauldronState);
                        cir.setReturnValue(new ItemStack(Items.BUCKET));
                    }
                }
            }
        }
    }

    @Unique
    private BlockPos getTargetPos(BlockPointer pointer) {
        Direction offsetDir = pointer.getBlockState().get(DispenserBlock.FACING);
        return pointer.getPos().offset(offsetDir);
    }
}
