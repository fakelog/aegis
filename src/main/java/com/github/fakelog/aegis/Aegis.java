/*
 * Copyright (C) 2022 fakelog
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.github.fakelog.aegis;

import com.github.fakelog.aegis.common.block.AegisBlocks;
import com.github.fakelog.aegis.common.item.AegisItems;
import com.github.fakelog.aegis.common.world.feature.AegisConfiguredFeatures;
import com.github.fakelog.aegis.common.world.gen.AegisWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;


public class Aegis implements ModInitializer {

	public static final String MOD_ID = "aegis";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		AegisConfiguredFeatures.registerConfiguredFeatures();

		AegisBlocks.registerAegisBlock();
		AegisItems.registerAegisItems();

		AegisWorldGen.generateAegisWorldGen();

		GeckoLib.initialize();
	}
}
