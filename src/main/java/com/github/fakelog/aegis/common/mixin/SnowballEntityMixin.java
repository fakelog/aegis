 /*
  * Copyright (C) 2022 fakelog
  *
  * SPDX-License-Identifier: Apache-2.0
  */

package com.github.fakelog.aegis.common.mixin;

import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.util.hit.EntityHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SnowballEntity.class)
public class SnowballEntityMixin {

    @Inject(method = "onEntityHit", at = @At("HEAD"))
    public void onEntityHit(EntityHitResult entityHitResult, CallbackInfo ci) {

        entityHitResult.getEntity().setFrozenTicks(64);
    }

}
