package com.github.fakelog.aegis.world.feature;

import com.github.fakelog.aegis.Aegis;
import com.github.fakelog.aegis.block.AegisBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class AegisConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_AQUA_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    AegisBlocks.AQUA_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    AegisBlocks.DEEPSLATE_AQUA_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> END_AQUA_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE),
                    AegisBlocks.END_AQUA_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> AQUA_ORE =
            ConfiguredFeatures.register("aqua_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_AQUA_ORES, 6));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_AQUA_ORE =
            ConfiguredFeatures.register("end_aqua_ore",Feature.ORE,
                    new OreFeatureConfig(END_AQUA_ORES, 12));

    public static void registerConfiguredFeatures() {
        Aegis.LOGGER.info("Registering ModConfiguredFeatures for " + Aegis.MOD_ID);
    }
}
