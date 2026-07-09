package net.indigo.indigosmod.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.indigo.indigosmod.item.IndigosModArmorMaterials;
import net.indigo.indigosmod.item.IndigosModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class IndigosModModelProvider extends FabricModelProvider {
    public IndigosModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(IndigosModItems.EMERALD_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(IndigosModItems.EMERALD_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(IndigosModItems.EMERALD_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(IndigosModItems.EMERALD_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(IndigosModItems.EMERALD_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(IndigosModItems.EMERALD_SPEAR);
        itemModelGenerators.generateTrimmableItem(IndigosModItems.EMERALD_HELMET, IndigosModArmorMaterials.EMERALD_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModelGenerators.generateTrimmableItem(IndigosModItems.EMERALD_CHESTPLATE, IndigosModArmorMaterials.EMERALD_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModelGenerators.generateTrimmableItem(IndigosModItems.EMERALD_LEGGINGS, IndigosModArmorMaterials.EMERALD_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModelGenerators.generateTrimmableItem(IndigosModItems.EMERALD_BOOTS, IndigosModArmorMaterials.EMERALD_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        itemModelGenerators.generateFlatItem(IndigosModItems.EMERALD_HORSE_ARMOR, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(IndigosModItems.EMERALD_NAUTILUS_ARMOR, ModelTemplates.FLAT_HANDHELD_ITEM);
    }
}
