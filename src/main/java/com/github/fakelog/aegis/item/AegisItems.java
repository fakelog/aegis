/*
 * Copyright (C) 2022 fakelog
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.github.fakelog.aegis.item;

import com.github.fakelog.aegis.Aegis;
import com.github.fakelog.aegis.AegisGroups;
import com.github.fakelog.aegis.item.armor.animation.AquaArmorItem;
import com.github.fakelog.aegis.material.AegisArmorMaterial;
import com.github.fakelog.aegis.register.AegisRegister;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;

public class AegisItems {

    public static final Item AQUA_INGOT;

    public static final Item AQUA_RAW;
    public static final Item AQUA_RAW_INGOT;

    public static final Item AQUA_HELMET = AegisRegister.registerItem("aqua_helmet",
            new AquaArmorItem(AegisArmorMaterial.AQUAMARINE, EquipmentSlot.HEAD, AegisGroups.AEGIS_GROUP));
    public static final Item AQUA_CHESTPLATE = AegisRegister.registerItem("aqua_chestplate",
            new AquaArmorItem(AegisArmorMaterial.AQUAMARINE, EquipmentSlot.CHEST, AegisGroups.AEGIS_GROUP));
    public static final Item AQUA_LEGGINS = AegisRegister.registerItem("aqua_leggings",
            new AquaArmorItem(AegisArmorMaterial.AQUAMARINE, EquipmentSlot.LEGS, AegisGroups.AEGIS_GROUP));
    public static final Item AQUA_BOOTS = AegisRegister.registerItem("aqua_boots",
            new AquaArmorItem(AegisArmorMaterial.AQUAMARINE, EquipmentSlot.FEET, AegisGroups.AEGIS_GROUP));

    public static void registerAegisItems() {
        Aegis.LOGGER.info("Registering Mod Items for " + Aegis.MOD_ID);
    }

    static {
        AQUA_INGOT = AegisRegister.registerItem("aqua_ingot", new Item(AegisGroups.AEGIS_GROUP));
        AQUA_RAW = AegisRegister.registerItem("aqua_raw", new Item(AegisGroups.AEGIS_GROUP));
        AQUA_RAW_INGOT = AegisRegister.registerItem("aqua_raw_ingot", new Item(AegisGroups.AEGIS_GROUP));
    }
}


