package net.indigo.indigosmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.indigo.indigosmod.tags.IndigosModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class IndigosModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public IndigosModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(IndigosModTags.Blocks.NEEDS_EMERALD_TOOL).forceAddTag(BlockTags.NEEDS_DIAMOND_TOOL);
        tag(IndigosModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL).forceAddTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL);
    }
}