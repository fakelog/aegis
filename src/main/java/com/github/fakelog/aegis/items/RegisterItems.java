package com.github.fakelog.aegis.items;

import com.github.fakelog.aegis.Aegis;
import com.github.fakelog.aegis.materials.AegisArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {
    public static final ArmorMaterial AEGIS_ARMOR_MATERIAL = new AegisArmorMaterial();
    public static final Item AEGIS_AQUA_HELMET = new ArmorItem(AEGIS_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Aegis.AEGIS_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("aegis", "aegis_aqua_helmet"), AEGIS_AQUA_HELMET);
    }
}


