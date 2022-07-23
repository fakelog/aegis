/*
 * Copyright (C) 2022 fakelog
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.github.fakelog.aegis;

import com.github.fakelog.aegis.item.AegisItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class AegisGroups {

    private static final String MOD_GROUP;
    private static final ItemGroup AEGIS_ITEM_GROUP;

    public static final Item.Settings AEGIS_GROUP;
    public static final Item.Settings AEGIS_GROUP_FIREPROOF;

    static {
        MOD_GROUP = "aegis_group";
        AEGIS_ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier(Aegis.MOD_ID, MOD_GROUP))
                .icon(() -> new ItemStack(AegisItems.AQUA_HELMET))
                .build();

        AEGIS_GROUP = new Item.Settings().group(AegisGroups.AEGIS_ITEM_GROUP);
        AEGIS_GROUP_FIREPROOF = AEGIS_GROUP.fireproof();
    }
}
