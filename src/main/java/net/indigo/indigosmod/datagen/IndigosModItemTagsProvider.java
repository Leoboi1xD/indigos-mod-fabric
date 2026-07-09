package net.indigo.indigosmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.indigo.indigosmod.item.IndigosModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class IndigosModItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
    public IndigosModItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
    tag(ItemTags.SWORDS).add(IndigosModItems.getRK(IndigosModItems.EMERALD_SWORD));
    tag(ItemTags.PICKAXES).add(IndigosModItems.getRK(IndigosModItems.EMERALD_PICKAXE));
    tag(ItemTags.SHOVELS).add(IndigosModItems.getRK(IndigosModItems.EMERALD_SHOVEL));
    tag(ItemTags.AXES).add(IndigosModItems.getRK(IndigosModItems.EMERALD_AXE));
    tag(ItemTags.HOES).add(IndigosModItems.getRK(IndigosModItems.EMERALD_HOE));
    tag(ItemTags.SPEARS).add(IndigosModItems.getRK(IndigosModItems.EMERALD_SPEAR));
    tag(ItemTags.HEAD_ARMOR).add(IndigosModItems.getRK(IndigosModItems.EMERALD_HELMET));
    tag(ItemTags.CHEST_ARMOR).add(IndigosModItems.getRK(IndigosModItems.EMERALD_CHESTPLATE));
    tag(ItemTags.LEG_ARMOR).add(IndigosModItems.getRK(IndigosModItems.EMERALD_LEGGINGS));
    tag(ItemTags.FOOT_ARMOR).add(IndigosModItems.getRK(IndigosModItems.EMERALD_BOOTS));
    }
}