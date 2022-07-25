package com.github.fakelog.aegis.common.registry;

import com.github.fakelog.aegis.Aegis;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AegisRegister {


    public static Block registerBlock(String name, Block block, Item.Settings group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Aegis.MOD_ID, name), block);
    }

    private static BlockItem registerBlockItem(String name, Block block, Item.Settings group) {
        return Registry.register(Registry.ITEM, new Identifier(Aegis.MOD_ID, name),
                new BlockItem(block, group));
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Aegis.MOD_ID, name), item);
    }
}
