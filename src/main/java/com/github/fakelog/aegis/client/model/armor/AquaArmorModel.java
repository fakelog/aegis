/*
 * Copyright (C) 2022 fakelog
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.github.fakelog.aegis.client.model.armor;

import com.github.fakelog.aegis.Aegis;
import com.github.fakelog.aegis.common.item.armor.animation.AquaArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AquaArmorModel extends AnimatedGeoModel<AquaArmorItem> {

    @Override
    public Identifier getModelResource(AquaArmorItem object) {
        return new Identifier(Aegis.MOD_ID, "geo/models/armor/aqua_armor_model.geo.json");
    }

    @Override
    public Identifier getTextureResource(AquaArmorItem object) {
        return new Identifier(Aegis.MOD_ID, "textures/models/armor/aqua_armor_texture.png");
    }

    @Override
    public Identifier getAnimationResource(AquaArmorItem animatable) {
        return new Identifier(Aegis.MOD_ID, "animations/armor_animation.json");
    }
}
