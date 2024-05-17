package com.github.thedeathlycow.moregeodes;

import com.github.thedeathlycow.moregeodes.blocks.ModBlocks;
import com.github.thedeathlycow.moregeodes.config.GeodesConfig;
import com.github.thedeathlycow.moregeodes.entity.GeodesMemoryModules;
import com.github.thedeathlycow.moregeodes.features.ModFeatures;
import com.github.thedeathlycow.moregeodes.item.ModItems;
import com.github.thedeathlycow.moregeodes.sounds.GeodesSoundEvents;
import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;

public class MoreGeodes implements ModInitializer {

    public static final String MODID = "geodes";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final GeodesConfig CONFIG = new GeodesConfig();

    @Override
    public void onInitialize() {
        LOGGER.info("Beginning More Geodes initialization");
        CONFIG.loadConfig();

        ModBlocks.registerBlocks();
        ModItems.registerItems();
        ModFeatures.placeFeaturesInBiomes();
        GeodesSoundEvents.registerSoundEvents();
        GeodesMemoryModules.registerModules();

        LOGGER.info("More Geodes initialized!");
    }
}