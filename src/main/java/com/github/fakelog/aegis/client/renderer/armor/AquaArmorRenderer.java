/*
 * Copyright (C) 2022 fakelog
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.github.fakelog.aegis.client.renderer.armor;

import com.github.fakelog.aegis.client.model.armor.AquaArmorModel;
import com.github.fakelog.aegis.common.item.armor.animation.AquaArmorItem;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class AquaArmorRenderer extends GeoArmorRenderer<AquaArmorItem> {

    public AquaArmorRenderer() {

        super(new AquaArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }

    @Override
    public RenderLayer getRenderType(AquaArmorItem animatable, float particleTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                     Identifier textureLocation) {

        return RenderLayer.getEntityTranslucent(getTextureResource(animatable));
    }
}
