package com.github.fakelog.aegis.common.block;

import com.github.fakelog.aegis.Aegis;
import com.github.fakelog.aegis.common.AegisGroups;
import com.github.fakelog.aegis.common.registry.AegisRegister;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class AegisBlocks {

    public static final Block APPLE_BLOCK;
    public static final Block AQUA_BLOCK;

    public static final Block AQUA_ORE;
    public static final Block AQUA_DEEPSLATE_ORE;
    public static final Block AQUA_END_ORE;

    public static void registerAegisBlock() {
        Aegis.LOGGER.info("Registering Mod Items for " + Aegis.MOD_ID);
    }

    static {
        APPLE_BLOCK = AegisRegister.registerBlock("apple_block",
                new AppleBlock(Settings.of(Material.GOURD).strength(1.0F).sounds(BlockSoundGroup.WOOD).nonOpaque()), AegisGroups.AEGIS_GROUP);

        AQUA_ORE = AegisRegister.registerBlock("aqua_ore",
                new OreBlock(Settings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F),
                        UniformIntProvider.create(3, 5)), AegisGroups.AEGIS_GROUP_FIREPROOF);
        AQUA_DEEPSLATE_ORE = AegisRegister.registerBlock("aqua_deepslate_ore",
                new OreBlock(Settings.copy(AQUA_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5F, 3.0F),
                        UniformIntProvider.create(3, 5)), AegisGroups.AEGIS_GROUP_FIREPROOF);
        AQUA_END_ORE = AegisRegister.registerBlock("aqua_end_ore",
                new OreBlock(Settings.of(Material.STONE).strength(3.0F).requiresTool(),
                        UniformIntProvider.create(3, 5)), AegisGroups.AEGIS_GROUP_FIREPROOF);

        AQUA_BLOCK = AegisRegister.registerBlock("aqua_block",
                new Block(Settings.of(Material.METAL).strength(5.0F).requiresTool()),
                        AegisGroups.AEGIS_GROUP_FIREPROOF);
    }
}
