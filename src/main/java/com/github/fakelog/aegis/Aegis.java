/*
 * Copyright (C) 2022 fakelog
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.github.fakelog.aegis;

import net.fabricmc.api.ModInitializer;
import software.bernie.geckolib3.GeckoLib;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Aegis implements ModInitializer {

	public static final String MOD_ID = "aegis";
	public static final Logger LOGGER = LogManager.getLogManager().getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		GeckoLib.initialize();
	}
}
