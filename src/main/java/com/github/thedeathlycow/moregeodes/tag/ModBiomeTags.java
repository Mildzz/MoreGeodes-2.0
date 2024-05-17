package com.github.thedeathlycow.moregeodes.tag;

import com.github.thedeathlycow.moregeodes.MoreGeodes;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class ModBiomeTags {

    public static final TagKey<Biome> HAS_EMERALD_GEODE = of("has_emerald_geode");
    public static final TagKey<Biome> HAS_EXTRA_EMERALD_GEODES = of("has_extra_emerald_geodes");
    public static final TagKey<Biome> HAS_QUARTZ_GEODE = of("has_quartz_geode");
    public static final TagKey<Biome> HAS_DIAMOND_GEODE = of("has_diamond_geode");
    public static final TagKey<Biome> HAS_ECHO_GEODE = of("has_echo_geode");
    public static final TagKey<Biome> HAS_LAPIS_GEODE = of("has_lapis_geode");
    public static final TagKey<Biome> HAS_EXTRA_LAPIS_GEODES = of("has_extra_lapis_geodes");
    public static final TagKey<Biome> HAS_ROSE_QUARTZ_GEODE = of("has_rose_quartz_geode");
    public static final TagKey<Biome> HAS_EXTRA_ROSE_QUARTZ_GEODES = of("has_extra_rose_quartz_geodes");
    public static final TagKey<Biome> HAS_BISMUTH_GEODE = of("has_bismuth_geode");
    public static final TagKey<Biome> HAS_PEARL_GEODE = of("has_pearl_geode");

    private static TagKey<Biome> of(String id) {
        return TagKey.of(RegistryKeys.BIOME, new Identifier(MoreGeodes.MODID, id));
    }

}
