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
    }
}