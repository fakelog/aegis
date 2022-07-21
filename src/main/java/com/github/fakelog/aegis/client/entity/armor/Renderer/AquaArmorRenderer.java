/*
 * Copyright (C) 2022 fakelog
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.github.fakelog.aegis.client.entity.armor.Renderer;

import com.github.fakelog.aegis.client.entity.armor.model.AquaArmorModel;
import com.github.fakelog.aegis.items.custom.AquaArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class AquaArmorRenderer extends GeoArmorRenderer<AquaArmorItem> {

    public AquaArmorRenderer() {

        super(new AquaArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}
