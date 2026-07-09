package net.indigo.indigosmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.indigo.indigosmod.item.IndigosModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class IndigosModRecipeProvider extends FabricRecipeProvider {

    public IndigosModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        return new RecipeProvider(provider, recipeOutput) {
            @Override
            public void buildRecipes() {
                shaped(RecipeCategory.COMBAT, IndigosModItems.EMERALD_SWORD)
                        .pattern("A")
                        .pattern("A")
                        .pattern("B")
                        .define('A', Items.EMERALD)
                        .define('B', Items.STICK)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("emerald")
                        .save(output);

                shaped(RecipeCategory.TOOLS, IndigosModItems.EMERALD_PICKAXE)
                        .pattern("AAA")
                        .pattern(" B ")
                        .pattern(" B ")
                        .define('A', Items.EMERALD)
                        .define('B', Items.STICK)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("emerald")
                        .save(output);
                shaped(RecipeCategory.TOOLS, IndigosModItems.EMERALD_SHOVEL)
                        .pattern("A")
                        .pattern("B")
                        .pattern("B")
                        .define('A', Items.EMERALD)
                        .define('B', Items.STICK)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("emerald")
                        .save(output);
                shaped(RecipeCategory.TOOLS, IndigosModItems.EMERALD_AXE)
                        .pattern("AA")
                        .pattern("AB")
                        .pattern(" B")
                        .define('A', Items.EMERALD)
                        .define('B', Items.STICK)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("emerald")
                        .save(output);
                shaped(RecipeCategory.TOOLS, IndigosModItems.EMERALD_HOE)
                        .pattern("AA")
                        .pattern(" B")
                        .pattern(" B")
                        .define('A', Items.EMERALD)
                        .define('B', Items.STICK)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("emerald")
                        .save(output);
                shaped(RecipeCategory.COMBAT, IndigosModItems.EMERALD_SPEAR)
                        .pattern("  A")
                        .pattern(" B ")
                        .pattern("B  ")
                        .define('A', Items.EMERALD)
                        .define('B', Items.STICK)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .group("emerald")
                        .save(output);
                shaped(RecipeCategory.COMBAT, IndigosModItems.EMERALD_HELMET)
                        .pattern("AAA")
                        .pattern("A A")
                        .pattern("   ")
                        .define('A', Items.EMERALD)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .group("emerald")
                        .save(output);
                shaped(RecipeCategory.COMBAT, IndigosModItems.EMERALD_CHESTPLATE)
                        .pattern("A A")
                        .pattern("AAA")
                        .pattern("AAA")
                        .define('A', Items.EMERALD)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .group("emerald")
                        .save(output);
                shaped(RecipeCategory.COMBAT, IndigosModItems.EMERALD_LEGGINGS)
                        .pattern("AAA")
                        .pattern("A A")
                        .pattern("A A")
                        .define('A', Items.EMERALD)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .group("emerald")
                        .save(output);
                shaped(RecipeCategory.COMBAT, IndigosModItems.EMERALD_BOOTS)
                        .pattern("   ")
                        .pattern("A A")
                        .pattern("A A")
                        .define('A', Items.EMERALD)
                        .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                        .group("emerald")
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "IndigosMod Recipes";
    }
}
