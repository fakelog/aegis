/*
 * Copyright (C) 2022 fakelog
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.github.fakelog.aegis.common.item;

import com.github.fakelog.aegis.Aegis;
import com.github.fakelog.aegis.common.AegisGroups;
import com.github.fakelog.aegis.common.item.armor.animation.AquaArmorItem;
import com.github.fakelog.aegis.common.material.AegisArmorMaterial;
import com.github.fakelog.aegis.common.registry.AegisRegister;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;

public class AegisItems {

    public static final Item AQUA;
    public static final Item AQUA_RAW;


    public static final Item AQUA_HELMET;
    public static final Item AQUA_MANTLE;
    public static final Item AQUA_SHORTS;
    public static final Item AQUA_GETA;

    public static final Item FROG_HIDE;
    public static final Item FROG_STUFFED;

    public static void registerAegisItems() {
        Aegis.LOGGER.info("Registering Mod Items for " + Aegis.MOD_ID);
    }

    static {
        AQUA = AegisRegister.registerItem("aqua", new Item(AegisGroups.AEGIS_ITEMS_FIREPROOF));
        AQUA_RAW = AegisRegister.registerItem("aqua_raw", new Item(AegisGroups.AEGIS_ITEMS_FIREPROOF));

        AQUA_HELMET = AegisRegister.registerItem("aqua_helmet",
                new AquaArmorItem(AegisArmorMaterial.AQUAMARINE, EquipmentSlot.HEAD, AegisGroups.AEGIS_ITEMS_FIREPROOF));
        AQUA_MANTLE = AegisRegister.registerItem("aqua_mantle",
                new AquaArmorItem(AegisArmorMaterial.AQUAMARINE, EquipmentSlot.CHEST, AegisGroups.AEGIS_ITEMS_FIREPROOF));
        AQUA_SHORTS = AegisRegister.registerItem("aqua_shorts",
                new AquaArmorItem(AegisArmorMaterial.AQUAMARINE, EquipmentSlot.LEGS, AegisGroups.AEGIS_ITEMS_FIREPROOF));
        AQUA_GETA = AegisRegister.registerItem("aqua_geta",
                new AquaArmorItem(AegisArmorMaterial.AQUAMARINE, EquipmentSlot.FEET, AegisGroups.AEGIS_ITEMS_FIREPROOF));

        FROG_HIDE = AegisRegister.registerItem("frog_hide", new Item(AegisGroups.AEGIS_ITEMS));
        FROG_STUFFED = AegisRegister.registerItem("frog_stuffed", new Item(AegisGroups.AEGIS_ITEMS));
    }
}


