/*
 * Copyright (C) 2022 fakelog
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.github.fakelog.aegis.common;

import com.github.fakelog.aegis.Aegis;
import com.github.fakelog.aegis.common.block.AegisBlocks;
import com.github.fakelog.aegis.common.item.AegisItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class AegisGroups {

    private static final String MOD_ITEMS_GROUP;
    private static final String MOD_BLOCKS_GROUP;

    private static final ItemGroup AEGIS_ITEMS_GROUP;
    private static final ItemGroup AEGIS_BLOCKS_GROUP;

    public static final Item.Settings AEGIS_ITEMS;
    public static final Item.Settings AEGIS_ITEMS_FIREPROOF;
    public static final Item.Settings AEGIS_BLOCKS;
    public static final Item.Settings AEGIS_BLOCKS_FIREPROOF;

    static {
        MOD_ITEMS_GROUP = "aegis_group";
        MOD_BLOCKS_GROUP = "aegis_blocks_group";

        AEGIS_ITEMS_GROUP = FabricItemGroupBuilder.create(new Identifier(Aegis.MOD_ID, MOD_ITEMS_GROUP))
                .icon(() -> new ItemStack(AegisItems.AQUA_HELMET))
                .build();

        AEGIS_BLOCKS_GROUP = FabricItemGroupBuilder.create(new Identifier(Aegis.MOD_ID, MOD_BLOCKS_GROUP))
                .icon(() -> new ItemStack(AegisBlocks.APPLE_BLOCK))
                .build();

        AEGIS_ITEMS = new Item.Settings().group(AEGIS_ITEMS_GROUP).maxCount(64);
        AEGIS_ITEMS_FIREPROOF = AEGIS_ITEMS.fireproof();

        AEGIS_BLOCKS = new Item.Settings().group(AEGIS_BLOCKS_GROUP);
        AEGIS_BLOCKS_FIREPROOF = AEGIS_BLOCKS.fireproof();
    }
}
