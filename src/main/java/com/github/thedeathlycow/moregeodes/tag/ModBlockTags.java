package com.github.thedeathlycow.moregeodes.tag;

import com.github.thedeathlycow.moregeodes.MoreGeodes;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class ModBlockTags {


    public static final TagKey<Block> CUSTOM_CRYSTAL_SOUND_BLOCKS = create("custom_crystal_sound_blocks");

    private static TagKey<Block> create(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(MoreGeodes.MODID, id));
    }
}
