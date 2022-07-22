/*
 * Copyright (C) 2022 fakelog
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.github.fakelog.aegis.item;

import com.github.fakelog.aegis.Aegis;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class AegisItemGroup {

    public static final String MOD_GROUP = "aegis_group";

    public static final ItemGroup AEGIS_GROUP = FabricItemGroupBuilder.create(new Identifier(Aegis.MOD_ID, MOD_GROUP))
            .icon(() -> new ItemStack(AegisItems.AQUA_HELMET))
            .build();
}
