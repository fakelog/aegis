package com.github.fakelog.aegis.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class AegisPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> AQUA_ORE_PLACED = PlacedFeatures.register("aqua_ore_placed",
            AegisConfiguredFeatures.AQUA_ORE, AegisOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static final RegistryEntry<PlacedFeature> END_AQUA_ORE_PLACED = PlacedFeatures.register("end_aqua_ore",
            AegisConfiguredFeatures.END_AQUA_ORE, AegisOreFeatures.modifiersWithCount(10,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
}
