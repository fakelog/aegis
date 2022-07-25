/*
 * Copyright (C) 2022 fakelog
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.github.fakelog.aegis.common.item.armor.animation;

import com.github.fakelog.aegis.common.item.AegisItems;
import com.github.fakelog.aegis.common.item.armor.AegisArmorItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.Arrays;
import java.util.HashSet;

public class AquaArmorItem extends AegisArmorItem implements IAnimatable {

    private final AnimationFactory factory = new AnimationFactory(this);

    public AquaArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {

        super(material, slot, settings);
    }

    private <P extends  IAnimatable>PlayState predicate(AnimationEvent<P> event) {

        LivingEntity livingEntity = event.getExtraDataOfType(LivingEntity.class).get(0);

        event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));

        if (livingEntity instanceof ArmorStandEntity) {
            return PlayState.CONTINUE;
        }

        HashSet<Item> armorSet = new HashSet<>(4);
        for (EquipmentSlot slot : EquipmentSlot.values()) {
            if (slot.getType() == EquipmentSlot.Type.ARMOR) {
                if (livingEntity.getEquippedStack(slot) != null) {
                    armorSet.add(livingEntity.getEquippedStack(slot).getItem());
                }
            }
        }

        boolean isWearingAll = armorSet.containsAll(Arrays.asList(AegisItems.AQUA_HELMET, AegisItems.AQUA_CHESTPLATE,
                                                                  AegisItems.AQUA_LEGGINS, AegisItems.AQUA_BOOTS));

        return isWearingAll ? PlayState.CONTINUE : PlayState.STOP;

    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void registerControllers(AnimationData data) {

        data.addAnimationController(new AnimationController(this, "controller", 20, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }
}
