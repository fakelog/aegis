package com.github.fakelog.aegis.mixin;

import net.minecraft.entity.vehicle.BoatEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(BoatEntity.class)
public class BoatEntityMixin {

    @Redirect(method = "fall", at = @At(
            value = "FIELD",
            target = "Lnet/minecraft/entity/vehicle/BoatEntity;" +
                     "location:Lnet/minecraft/entity/vehicle/BoatEntity$Location;"
    ))

    private BoatEntity.Location getLocation(BoatEntity boat) {
        return BoatEntity.Location.ON_LAND;
    }
}
