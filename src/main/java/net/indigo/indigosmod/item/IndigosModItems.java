package net.indigo.indigosmod.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.indigo.indigosmod.IndigosMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Function;

public class IndigosModItems {

    public static final Item EMERALD_SWORD = registerItem("emerald_sword", properties -> new Item(properties.sword(IndigosModToolMaterials.EMERALD, 3.0F, -2.4F)));
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe", properties -> new Item(properties.pickaxe(IndigosModToolMaterials.EMERALD, 1.0F, -2.8F)));
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel", properties -> new ShovelItem(IndigosModToolMaterials.EMERALD, 1.5F, -3.0F, properties));
    public static final Item EMERALD_AXE = registerItem("emerald_axe", properties -> new AxeItem(IndigosModToolMaterials.EMERALD, 6.0F, -3.0F, properties));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe", properties -> new HoeItem(IndigosModToolMaterials.EMERALD, -2.0F, -1.0F, properties));
    public static final Item EMERALD_SPEAR = registerItem("emerald_spear", properties -> new Item(properties.spear(IndigosModToolMaterials.EMERALD,1.0F, 1.0F, 0.5F, 3.0F, 11.0F, 6.5F, 5.1F, 10.0F, 4.6F)));
    public static final Item EMERALD_HELMET = registerItem("emerald_helmet", properties -> new Item(properties.humanoidArmor(IndigosModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate", properties -> new Item(properties.humanoidArmor(IndigosModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings", properties -> new Item(properties.humanoidArmor(IndigosModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots", properties -> new Item(properties.humanoidArmor(IndigosModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorType.BOOTS)));
    public static final Item EMERALD_HORSE_ARMOR = registerItem("emerald_horse_armor", properties -> new Item(properties.horseArmor(IndigosModArmorMaterials.EMERALD_ARMOR_MATERIAL)));
    public static final Item EMERALD_NAUTILUS_ARMOR = registerItem("emerald_nautilus_armor", properties -> new Item(properties.nautilusArmor(IndigosModArmorMaterials.EMERALD_ARMOR_MATERIAL)));


    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(IndigosMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(IndigosMod.MOD_ID, name)))));
    }

    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }


    public static void registerIndigosModItems()
    {
        IndigosMod.LOGGER.info("Registering IndigosModItems");
    }
}
