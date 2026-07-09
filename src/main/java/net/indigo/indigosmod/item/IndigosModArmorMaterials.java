package net.indigo.indigosmod.item;

import net.indigo.indigosmod.IndigosMod;
import net.indigo.indigosmod.tags.IndigosModTags;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.EquipmentAsset;

public class IndigosModArmorMaterials {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY= ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> EMERALD_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(IndigosMod.MOD_ID, "emerald"));

    public static final ArmorMaterial EMERALD_ARMOR_MATERIAL = new ArmorMaterial(35, ArmorMaterials.makeDefense(2,6,7,3,8), 9, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F, IndigosModTags.Items.EMERALD_TOOL_REPAIR, EMERALD_KEY); {}

}
