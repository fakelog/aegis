/*
 * Copyright (C) 2022 fakelog
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.github.fakelog.aegis.material;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public enum AegisArmorMaterial implements ArmorMaterial {

    AQUAMARINE(37, 50, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE,
            Ingredient.ofItems(Items.GLASS), "aquamarine", 0.0f, 0);

    private static final int[] BASE_DURABILITY;
    private static final int [] BASE_PROTECTION;

    private final int durability;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final Ingredient repairIngredient;
    private final String name;
    private final float toughness;
    private final float knockbackResistance;

    private AegisArmorMaterial(
            int durability,
            int enchantability,
            SoundEvent equipSound,
            Ingredient repairIngredient,
            String name,
            float toughness,
            float knockbackResistance
    ) {
        this.durability = durability;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.repairIngredient = repairIngredient;
        this.name = name;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durability;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return BASE_PROTECTION[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    static {
        BASE_DURABILITY = new int[] {13, 15, 16, 11};
        BASE_PROTECTION = new int[] {3, 6, 8, 3};
    }
}
