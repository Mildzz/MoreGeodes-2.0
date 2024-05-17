package com.github.thedeathlycow.moregeodes.features;

import com.github.thedeathlycow.moregeodes.MoreGeodes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> EMERALD_GEODE = of("emerald_geode");
    public static final RegistryKey<PlacedFeature> EMERALD_GEODE_EXTRA = of("emerald_geode_extra");
    public static final RegistryKey<PlacedFeature> QUARTZ_GEODE = of("quartz_geode");
    public static final RegistryKey<PlacedFeature> DIAMOND_GEODE = of("diamond_geode");
    public static final RegistryKey<PlacedFeature> ECHO_GEODE = of("echo_geode");

    public static final RegistryKey<PlacedFeature> LAPIS_GEODE = of("lapis_geode");
    public static final RegistryKey<PlacedFeature> LAPIS_GEODE_EXTRA = of("lapis_geode_extra");
    public static final RegistryKey<PlacedFeature> ROSE_QUARTZ_GEODE = of("rose_quartz_geode");
    public static final RegistryKey<PlacedFeature> ROSE_QUARTZ_GEODE_EXTRA = of("rose_quartz_geode_extra");
    public static final RegistryKey<PlacedFeature> BISMUTH_GEODE = of("bismuth_geode");
    public static final RegistryKey<PlacedFeature> PEARL_GEODE = of("pearl_geode");

    public static RegistryKey<PlacedFeature> of(String id) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MoreGeodes.MODID, id));
    }

}
