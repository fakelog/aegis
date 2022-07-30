/*
 * Copyright (C) 2022 fakelog
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.github.fakelog.aegis.common;

import com.github.fakelog.aegis.Aegis;
import com.github.fakelog.aegis.common.block.AegisBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class AegisGroups {

    private static final String MOD_ITEMS_GROUP;
    private static final String MOD_BLOCKS_GROUP;

    private static final ItemGroup AEGIS_ITEM_GROUP;

    public static final Item.Settings AEGIS_GROUP;
    public static final Item.Settings AEGIS_GROUP_FIREPROOF;

    static {
        MOD_ITEMS_GROUP = "aegis_group";
        MOD_BLOCKS_GROUP = "aegis_blocks_group";

        AEGIS_ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier(Aegis.MOD_ID, MOD_ITEMS_GROUP))
                .icon(() -> new ItemStack(AegisBlocks.APPLE_BLOCK))
                .build();

        AEGIS_GROUP = new Item.Settings().group(AegisGroups.AEGIS_ITEM_GROUP).maxCount(64);
        AEGIS_GROUP_FIREPROOF = AEGIS_GROUP.fireproof();
    }
}
