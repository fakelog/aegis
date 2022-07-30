/*
 * Copyright (C) 2022 fakelog
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.github.fakelog.aegis;

import com.github.fakelog.aegis.client.renderer.armor.AquaArmorRenderer;
import com.github.fakelog.aegis.common.item.AegisItems;
import net.fabricmc.api.ClientModInitializer;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class AegisClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        GeoArmorRenderer.registerArmorRenderer(new AquaArmorRenderer(), AegisItems.AQUA_HELMET, AegisItems.AQUA_MANTLE,
                                                                        AegisItems.AQUA_SHORTS, AegisItems.AQUA_GETA);
    }
}
