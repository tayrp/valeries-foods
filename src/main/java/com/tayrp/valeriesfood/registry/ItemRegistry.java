package com.tayrp.valeriesfood.registry;

import com.tayrp.valeriesfood.ValeriesFood;
import com.tayrp.valeriesfood.list.FoodList;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegistry {
    public static final Item MCFRIES;

    static {
        MCFRIES = register("mcfries",
                new Item(new Item.Settings().food(FoodList.MCFRIES_FOOD_COMPONENT).maxCount(64)));
    }

    public static final Item MCFRY;

    static {
        MCFRY = register("mcfry",
                new Item(new Item.Settings().food(FoodList.MCFRY_FOOD_COMPONENT).maxCount(64)));
    }

    public static final Item MCFRIES_BOX = register("mcfries_box", new Item(new Item.Settings()));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, ValeriesFood.id(name), item);
    }

    public static void load() {
    }
}
