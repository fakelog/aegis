package com.github.fakelog.aegis;

import com.github.fakelog.aegis.items.RegisterItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Aegis implements ModInitializer {

	public static final ItemGroup AEGIS_GROUP = FabricItemGroupBuilder.create(
			new Identifier("aegis", "aegis_group"))
			.icon(() -> new ItemStack(RegisterItems.AEGIS_AQUA_HELMET))
			.build();

	@Override
	public void onInitialize() {
		RegisterItems.register();
	}
}
