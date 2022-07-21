/*
 * Copyright (C) 2022 fakelog
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.github.fakelog.aegis;

import com.github.fakelog.aegis.items.AegisItems;
import net.fabricmc.api.ModInitializer;

public class Aegis implements ModInitializer {

	public static final String MOD_ID = "aegis";

	@Override
	public void onInitialize() {
		AegisItems.register();
	}
}
