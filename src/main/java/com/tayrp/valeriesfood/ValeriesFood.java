package com.tayrp.valeriesfood;

import com.tayrp.valeriesfood.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValeriesFood implements ModInitializer {
    public static final String MOD_ID = "valeries_food";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Loading!..??~");
        ItemRegistry.load();
    }

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}