package com.github.fakelog.aegis.block;

import com.github.fakelog.aegis.Aegis;
import com.github.fakelog.aegis.AegisGroups;
import com.github.fakelog.aegis.register.AegisRegister;
import net.minecraft.block.*;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class AegisBlocks {

    public static final Block APPLE_BLOCK;
    public static final Block ATTACHED_APPLE_STEM;
    public static final Block APPLE_STEM;

    public static final Block AQUA_ORE;
    public static final Block DEEPSLATE_AQUA_ORE;
    public static final Block END_AQUA_ORE;

    public static void registerAegisBlock() {
        Aegis.LOGGER.info("Registering Mod Items for " + Aegis.MOD_ID);
    }

    static {
        APPLE_BLOCK = AegisRegister.registerBlock("apple_block",
                new AppleBlock(Settings.of(Material.GOURD).strength(1.0F).sounds(BlockSoundGroup.WOOD).nonOpaque()), AegisGroups.AEGIS_GROUP);
        ATTACHED_APPLE_STEM = AegisRegister.registerBlock("attached_apple_stem",
                new AttachedStemBlock((GourdBlock) APPLE_BLOCK, () -> Items.APPLE,
                        Settings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.WOOD)), AegisGroups.AEGIS_GROUP);
        APPLE_STEM = AegisRegister.registerBlock("apple_stem",
                new StemBlock((GourdBlock) APPLE_BLOCK, () -> Items.APPLE,
                        Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.STEM)), AegisGroups.AEGIS_GROUP);

        AQUA_ORE = AegisRegister.registerBlock("aqua_ore",
                new OreBlock(Settings.of(Material.STONE).strength(4.5F).requiresTool(),
                        UniformIntProvider.create(1, 2)), AegisGroups.AEGIS_GROUP_FIREPROOF);
        DEEPSLATE_AQUA_ORE = AegisRegister.registerBlock("deeplsate_aqua_ore",
                new OreBlock(Settings.of(Material.STONE).strength(4.5F).requiresTool(),
                        UniformIntProvider.create(2, 3)), AegisGroups.AEGIS_GROUP_FIREPROOF);
        END_AQUA_ORE = AegisRegister.registerBlock("end_aqua_ore",
                new OreBlock(Settings.of(Material.STONE).strength(4.5F).requiresTool(),
                        UniformIntProvider.create(3, 5)), AegisGroups.AEGIS_GROUP_FIREPROOF);
    }
}
