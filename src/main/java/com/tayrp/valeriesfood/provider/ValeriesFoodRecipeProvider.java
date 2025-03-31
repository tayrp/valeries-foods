package com.tayrp.valeriesfood.provider;

import com.tayrp.valeriesfood.registry.ItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ValeriesFoodRecipeProvider extends FabricRecipeProvider {
    public ValeriesFoodRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> smeltItems = List.of(Items.POTATO);

        RecipeProvider.offerBlasting(recipeExporter,
                smeltItems,
                RecipeCategory.FOOD,
                ItemRegistry.MCFRY,
                0.2f,
                100,
                "mcfry");

        RecipeProvider.offerSmelting(recipeExporter,
                smeltItems,
                RecipeCategory.FOOD,
                ItemRegistry.MCFRY,
                0.2f,
                100,
                "mcfry");
    }
}
