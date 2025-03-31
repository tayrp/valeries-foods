package com.tayrp.valeriesfood.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {
    public static final FoodComponent MCFRIES_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(1)
            .alwaysEdible()
            .build();

    public static final FoodComponent MCFRY_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.5f)
            .alwaysEdible()
            .build();
}
