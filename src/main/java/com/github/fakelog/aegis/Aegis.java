/*
 * Copyright (C) 2022 fakelog
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.github.fakelog.aegis;

import com.github.fakelog.aegis.block.AegisBlocks;
import com.github.fakelog.aegis.item.AegisItems;
import com.github.fakelog.aegis.world.gen.AegisWorldGen;
import net.fabricmc.api.ModInitializer;
import software.bernie.geckolib3.GeckoLib;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Aegis implements ModInitializer {

	public static final String MOD_ID = "aegis";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		AegisBlocks.registerAegisBlock();
		AegisItems.registerAegisItems();

		AegisWorldGen.generateAegisWorldGen();

		GeckoLib.initialize();
	}
}
