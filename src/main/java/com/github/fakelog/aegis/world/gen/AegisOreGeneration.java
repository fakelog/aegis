package com.github.fakelog.aegis.world.gen;

import com.github.fakelog.aegis.world.feature.AegisPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class AegisOreGeneration {

    public static void generateOre() {

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, AegisPlacedFeatures.AQUA_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, AegisPlacedFeatures.END_AQUA_ORE_PLACED.getKey().get());
    }
}
