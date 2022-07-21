/*
 * Copyright (C) 2022 fakelog
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.github.fakelog.aegis.items;

import com.github.fakelog.aegis.Aegis;
import com.github.fakelog.aegis.items.custom.AquaArmorItem;
import com.github.fakelog.aegis.materials.AegisArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AegisItems {

    public static final Item AQUA_HELMET = registerItem("aqua_helmet",
            new AquaArmorItem(AegisArmorMaterial.AQUAMARINE, EquipmentSlot.HEAD,
                    new Item.Settings().group(AegisItemGroup.AEGIS_GROUP)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Aegis.MOD_ID, name), item);
    }

    public static void registerAegisItems() {
        Aegis.LOGGER.info("Registering Mod Items for " + Aegis.MOD_ID);
    }
}


