package com.github.thedeathlycow.moregeodes.blocks;

import com.github.thedeathlycow.moregeodes.MoreGeodes;
import com.github.thedeathlycow.moregeodes.sounds.CrystalBlockSoundGroup;
import com.github.thedeathlycow.moregeodes.sounds.ModBlockSoundGroups;
import com.google.common.collect.ImmutableList;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;


public class ModBlocks {

    public static final Block EMERALD_CRYSTAL_BLOCK = new CrystalBlock(CrystalBlockSoundGroup.EMERALD_GEODE, FabricBlockSettings.create().mapColor(MapColor.EMERALD_GREEN).strength(1.5F).sounds(ModBlockSoundGroups.EMERALD_GEODE).requiresTool());

    public static final Block EMERALD_CLUSTER = new CrystalClusterBlock(CrystalBlockSoundGroup.EMERALD_GEODE, 7, 3, FabricBlockSettings.create().mapColor(MapColor.EMERALD_GREEN).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.EMERALD_CLUSTER).strength(1.5f).luminance((blockState) -> 5));
    public static final Block LARGE_EMERALD_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.EMERALD_GEODE, 5, 3, FabricBlockSettings.create().mapColor(MapColor.EMERALD_GREEN).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.LARGE_EMERALD_BUD).strength(1.5f).luminance((blockState) -> 4));
    public static final Block MEDIUM_EMERALD_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.EMERALD_GEODE, 4, 3, FabricBlockSettings.create().mapColor(MapColor.EMERALD_GREEN).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.MEDIUM_EMERALD_BUD).strength(1.5f).luminance((blockState) -> 2));
    public static final Block SMALL_EMERALD_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.EMERALD_GEODE, 3, 4, FabricBlockSettings.create().mapColor(MapColor.EMERALD_GREEN).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.SMALL_EMERALD_BUD).strength(1.5f).luminance((blockState) -> 1));

    public static final Block QUARTZ_CRYSTAL_BLOCK = new CrystalBlock(CrystalBlockSoundGroup.QUARTZ_GEODE, FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).strength(1.5F).sounds(ModBlockSoundGroups.QUARTZ_GEODE).requiresTool());

    public static final Block QUARTZ_CLUSTER = new QuartzClusterBlock(7, 3, FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.QUARTZ_CLUSTER).strength(1.5f).luminance((blockState) -> 5), 15, 1);
    public static final Block LARGE_QUARTZ_BUD = new QuartzClusterBlock(5, 3, FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.LARGE_QUARTZ_BUD).strength(1.5f).luminance((blockState) -> 4), 15, 5);
    public static final Block MEDIUM_QUARTZ_BUD = new QuartzClusterBlock(4, 3, FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.MEDIUM_QUARTZ_BUD).strength(1.5f).luminance((blockState) -> 2), 15, 10);
    public static final Block SMALL_QUARTZ_BUD = new QuartzClusterBlock(3, 4, FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.SMALL_QUARTZ_BUD).strength(1.5f).luminance((blockState) -> 1), 15, 20);

    public static final Block DIAMOND_CRYSTAL_BLOCK = new CrystalBlock(CrystalBlockSoundGroup.DIAMOND_GEODE, FabricBlockSettings.create().mapColor(MapColor.DIAMOND_BLUE).strength(1.5F).sounds(ModBlockSoundGroups.DIAMOND_GEODE).requiresTool());

    public static final Block DIAMOND_CLUSTER = new CrystalClusterBlock(CrystalBlockSoundGroup.DIAMOND_GEODE, 7, 3, FabricBlockSettings.create().mapColor(MapColor.DIAMOND_BLUE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.DIAMOND_CLUSTER).strength(1.5f).luminance((blockState) -> 7));

    public static final Block ECHO_BLOCK = new CrystalBlock(CrystalBlockSoundGroup.ECHO_BLOCK, FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(1.5f).sounds(ModBlockSoundGroups.ECHO_BLOCK).requiresTool());

    public static final Block ECHO_CLUSTER = new CrystalClusterBlock(CrystalBlockSoundGroup.ECHO_BLOCK, 7, 3, FabricBlockSettings.create().mapColor(MapColor.BLACK).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.ECHO_CLUSTER).strength(1.5f).luminance((blockState) -> 7));
    public static final Block LARGE_ECHO_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.ECHO_BLOCK, 5, 3, FabricBlockSettings.create().mapColor(MapColor.BLACK).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.LARGE_ECHO_BUD).strength(1.5f).luminance((blockState) -> 6));
    public static final Block MEDIUM_ECHO_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.ECHO_BLOCK, 4, 3, FabricBlockSettings.create().mapColor(MapColor.BLACK).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.MEDIUM_ECHO_BUD).strength(1.5f).luminance((blockState) -> 5));
    public static final Block SMALL_ECHO_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.ECHO_BLOCK, 3, 4, FabricBlockSettings.create().mapColor(MapColor.BLACK).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.SMALL_ECHO_BUD).strength(1.5f).luminance((blockState) -> 4));

    public static final Block LAPIS_CRYSTAL_BLOCK = new CrystalBlock(CrystalBlockSoundGroup.LAPIS, FabricBlockSettings.create().mapColor(MapColor.LAPIS_BLUE).strength(1.5f).sounds(ModBlockSoundGroups.LAPIS_CRYSTAL_BLOCK).requiresTool());
    public static final Block LAPIS_CLUSTER = new CrystalClusterBlock(CrystalBlockSoundGroup.LAPIS, 7, 3, FabricBlockSettings.create().mapColor(MapColor.LAPIS_BLUE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.LAPIS_CLUSTER).strength(1.5f).luminance((blockState) -> 5));
    public static final Block LARGE_LAPIS_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.LAPIS, 5, 3, FabricBlockSettings.create().mapColor(MapColor.LAPIS_BLUE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.LARGE_LAPIS_BUD).strength(1.5f).luminance((blockState) -> 4));
    public static final Block MEDIUM_LAPIS_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.LAPIS, 4, 3, FabricBlockSettings.create().mapColor(MapColor.LAPIS_BLUE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.MEDIUM_LAPIS_BUD).strength(1.5f).luminance((blockState) -> 2));
    public static final Block SMALL_LAPIS_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.LAPIS, 3, 4, FabricBlockSettings.create().mapColor(MapColor.LAPIS_BLUE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.SMALL_LAPIS_BUD).strength(1.5f).luminance((blockState) -> 1));

    public static final Block ROSE_QUARTZ_CRYSTAL_BLOCK = new CrystalBlock(CrystalBlockSoundGroup.ROSE_QUARTZ, FabricBlockSettings.create().mapColor(MapColor.PINK).strength(1.5f).sounds(ModBlockSoundGroups.ROSE_QUARTZ_CRYSTAL_BLOCK).requiresTool());
    public static final Block ROSE_QUARTZ_CLUSTER = new CrystalClusterBlock(CrystalBlockSoundGroup.ROSE_QUARTZ, 7, 3, FabricBlockSettings.create().mapColor(MapColor.PINK).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.ROSE_QUARTZ_CLUSTER).strength(1.5f).luminance((blockState) -> 6));
    public static final Block LARGE_ROSE_QUARTZ_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.ROSE_QUARTZ, 5, 3, FabricBlockSettings.create().mapColor(MapColor.PINK).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.LARGE_ROSE_QUARTZ_BUD).strength(1.5f).luminance((blockState) -> 5));
    public static final Block MEDIUM_ROSE_QUARTZ_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.ROSE_QUARTZ, 4, 3, FabricBlockSettings.create().mapColor(MapColor.PINK).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.MEDIUM_ROSE_QUARTZ_BUD).strength(1.5f).luminance((blockState) -> 3));
    public static final Block SMALL_ROSE_QUARTZ_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.ROSE_QUARTZ, 3, 4, FabricBlockSettings.create().mapColor(MapColor.PINK).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.SMALL_ROSE_QUARTZ_BUD).strength(1.5f).luminance((blockState) -> 2));

    public static final TintedGlassBlock ROSE_QUARTZ_TINTED_GLASS = new TintedGlassBlock(FabricBlockSettings.copyOf(Blocks.TINTED_GLASS));
    public static final TintedGlassBlock LAPIS_TINTED_GLASS = new TintedGlassBlock(FabricBlockSettings.copyOf(Blocks.TINTED_GLASS));
    public static final TintedGlassBlock EMERALD_TINTED_GLASS = new TintedGlassBlock(FabricBlockSettings.copyOf(Blocks.TINTED_GLASS));

    public static final Block GABBRO = new Block(FabricBlockSettings.create().mapColor(MapColor.BLACK).requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.BASALT));

    public static final GeodeBuddingBlock BUDDING_EMERALD = new GeodeBuddingBlock(
            CrystalBlockSoundGroup.EMERALD_GEODE,
            FabricBlockSettings.create().mapColor(MapColor.EMERALD_GREEN).ticksRandomly().strength(1.5F).sounds(ModBlockSoundGroups.EMERALD_GEODE).requiresTool(),
            ImmutableList.of(SMALL_EMERALD_BUD, MEDIUM_EMERALD_BUD, LARGE_EMERALD_BUD, EMERALD_CLUSTER)
    );

    public static final GeodeBuddingBlock BUDDING_QUARTZ = new GeodeBuddingBlock(
            CrystalBlockSoundGroup.QUARTZ_GEODE,
            FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).ticksRandomly().strength(1.5f).sounds(ModBlockSoundGroups.QUARTZ_GEODE).requiresTool(),
            ImmutableList.of(SMALL_QUARTZ_BUD, MEDIUM_QUARTZ_BUD, LARGE_QUARTZ_BUD, QUARTZ_CLUSTER)
    );

    public static final GeodeBuddingBlock BUDDING_ECHO_BLOCK = new GeodeBuddingBlock(
            CrystalBlockSoundGroup.ECHO_BLOCK,
            FabricBlockSettings.create().mapColor(MapColor.BLACK).ticksRandomly().strength(1.5f).sounds(ModBlockSoundGroups.ECHO_BLOCK).requiresTool(),
            ImmutableList.of(SMALL_ECHO_BUD, MEDIUM_ECHO_BUD, LARGE_ECHO_BUD, ECHO_CLUSTER)
    );

    public static final GeodeBuddingBlock BUDDING_LAPIS = new GeodeBuddingBlock(
            CrystalBlockSoundGroup.LAPIS,
            FabricBlockSettings.create().mapColor(MapColor.BLACK).ticksRandomly().strength(1.5f).sounds(ModBlockSoundGroups.LAPIS_CRYSTAL_BLOCK).requiresTool(),
            ImmutableList.of(SMALL_LAPIS_BUD, MEDIUM_LAPIS_BUD, LARGE_LAPIS_BUD, LAPIS_CLUSTER)
    );

    public static final GeodeBuddingBlock BUDDING_ROSE_QUARTZ = new GeodeBuddingBlock(
            CrystalBlockSoundGroup.ROSE_QUARTZ,
            FabricBlockSettings.create().mapColor(MapColor.PINK).ticksRandomly().strength(1.5f).sounds(ModBlockSoundGroups.ROSE_QUARTZ_CRYSTAL_BLOCK).requiresTool(),
            ImmutableList.of(SMALL_ROSE_QUARTZ_BUD, MEDIUM_ROSE_QUARTZ_BUD, LARGE_ROSE_QUARTZ_BUD, ROSE_QUARTZ_CLUSTER)
    );

    public static final Block BISMUTH_CLUSTER = new CrystalClusterBlock(CrystalBlockSoundGroup.BISMUTH, 7, 3, FabricBlockSettings.create().mapColor(MapColor.PURPLE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.BISMUTH_CLUSTER).strength(1.5f).luminance((blockState) -> 7));
    public static final Block LARGE_BISMUTH_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.BISMUTH, 5, 3, FabricBlockSettings.create().mapColor(MapColor.PURPLE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.LARGE_BISMUTH_BUD).strength(1.5f).luminance((blockState) -> 6));
    public static final Block MEDIUM_BISMUTH_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.BISMUTH, 4, 3, FabricBlockSettings.create().mapColor(MapColor.PURPLE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.MEDIUM_BISMUTH_BUD).strength(1.5f).luminance((blockState) -> 5));
    public static final Block SMALL_BISMUTH_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.BISMUTH, 3, 4, FabricBlockSettings.create().mapColor(MapColor.PURPLE).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.SMALL_BISMUTH_BUD).strength(1.5f).luminance((blockState) -> 3));

    public static final Block BISMUTH_BLOCK = new CrystalBlock(CrystalBlockSoundGroup.BISMUTH, FabricBlockSettings.create().mapColor(MapColor.PURPLE).strength(1.5F).sounds(ModBlockSoundGroups.BISMUTH_BLOCK).requiresTool());

    public static final Block BUDDING_BISMUTH_BLOCK = new GeodeBuddingBlock(
            CrystalBlockSoundGroup.BISMUTH,
            FabricBlockSettings.create().mapColor(MapColor.PURPLE).ticksRandomly().strength(1.5f).sounds(ModBlockSoundGroups.BISMUTH_BLOCK).requiresTool(),
            ImmutableList.of(SMALL_BISMUTH_BUD, MEDIUM_BISMUTH_BUD, LARGE_BISMUTH_BUD, BISMUTH_CLUSTER)
    );

    public static final Block PEARL_CLUSTER = new CrystalClusterBlock(CrystalBlockSoundGroup.PEARL, 7, 3, FabricBlockSettings.create().mapColor(MapColor.WHITE_GRAY).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.PEARL_CLUSTER).strength(1.5f).luminance((blockState) -> 7));
    public static final Block LARGE_PEARL_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.PEARL, 5, 3, FabricBlockSettings.create().mapColor(MapColor.WHITE_GRAY).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.LARGE_PEARL_BUD).strength(1.5f).luminance((blockState) -> 6));
    public static final Block MEDIUM_PEARL_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.PEARL, 4, 3, FabricBlockSettings.create().mapColor(MapColor.WHITE_GRAY).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.MEDIUM_PEARL_BUD).strength(1.5f).luminance((blockState) -> 5));
    public static final Block SMALL_PEARL_BUD = new CrystalClusterBlock(CrystalBlockSoundGroup.PEARL, 3, 4, FabricBlockSettings.create().mapColor(MapColor.WHITE_GRAY).nonOpaque().requiresTool().sounds(ModBlockSoundGroups.SMALL_PEARL_BUD).strength(1.5f).luminance((blockState) -> 3));

    public static final Block PEARL_CRYSTAL_BLOCK = new CrystalBlock(CrystalBlockSoundGroup.PEARL, FabricBlockSettings.create().mapColor(MapColor.WHITE_GRAY).strength(1.5F).sounds(ModBlockSoundGroups.PEARL_CRYSTAL_BLOCK).requiresTool());

    public static final Block BUDDING_PEARL = new GeodeBuddingBlock(
            CrystalBlockSoundGroup.PEARL,
            FabricBlockSettings.create().mapColor(MapColor.WHITE_GRAY).ticksRandomly().strength(1.5f).sounds(ModBlockSoundGroups.PEARL_CRYSTAL_BLOCK).requiresTool(),
            ImmutableList.of(SMALL_PEARL_BUD, MEDIUM_PEARL_BUD, LARGE_PEARL_BUD, PEARL_CLUSTER)
    );


    public static final Block PYRITE = new Block(
            FabricBlockSettings.create()
                    .mapColor(MapColor.GOLD)
                    .sounds(BlockSoundGroup.CALCITE)
                    .requiresTool()
                    .strength(0.75F)
    );

    public static final Block PYRITE_STAIRS = new StairsBlock(
            PYRITE.getDefaultState(),
            FabricBlockSettings.copyOf(PYRITE)
    );

    public static final Block PYRITE_SLAB = new SlabBlock(
            FabricBlockSettings.copyOf(PYRITE)
    );

    public static final Block PYRITE_WALL = new WallBlock(
            FabricBlockSettings.copyOf(PYRITE)
    );

    public static final Block CALCITE_STAIRS = new StairsBlock(
            Blocks.CALCITE.getDefaultState(),
            FabricBlockSettings.copyOf(Blocks.CALCITE)
    );

    public static final Block CALCITE_SLAB = new SlabBlock(
            FabricBlockSettings.copyOf(Blocks.CALCITE)
    );

    public static final Block CALCITE_WALL = new WallBlock(
            FabricBlockSettings.copyOf(Blocks.CALCITE)
    );


    public static void registerBlocks() {
        register("emerald_crystal_block", EMERALD_CRYSTAL_BLOCK);
        register("budding_emerald", BUDDING_EMERALD);
        register("emerald_cluster", EMERALD_CLUSTER);
        register("large_emerald_bud", LARGE_EMERALD_BUD);
        register("medium_emerald_bud", MEDIUM_EMERALD_BUD);
        register("small_emerald_bud", SMALL_EMERALD_BUD);
        register("quartz_crystal_block", QUARTZ_CRYSTAL_BLOCK);
        register("budding_quartz", BUDDING_QUARTZ);
        register("quartz_cluster", QUARTZ_CLUSTER);
        register("large_quartz_bud", LARGE_QUARTZ_BUD);
        register("medium_quartz_bud", MEDIUM_QUARTZ_BUD);
        register("small_quartz_bud", SMALL_QUARTZ_BUD);
        register("diamond_crystal_block", DIAMOND_CRYSTAL_BLOCK);
        register("diamond_cluster", DIAMOND_CLUSTER);
        register("echo_block", ECHO_BLOCK);
        register("budding_echo_block", BUDDING_ECHO_BLOCK);
        register("echo_cluster", ECHO_CLUSTER);
        register("large_echo_bud", LARGE_ECHO_BUD);
        register("medium_echo_bud", MEDIUM_ECHO_BUD);
        register("small_echo_bud", SMALL_ECHO_BUD);
        register("lapis_crystal_block", LAPIS_CRYSTAL_BLOCK);
        register("lapis_cluster", LAPIS_CLUSTER);
        register("large_lapis_bud", LARGE_LAPIS_BUD);
        register("medium_lapis_bud", MEDIUM_LAPIS_BUD);
        register("small_lapis_bud", SMALL_LAPIS_BUD);
        register("budding_lapis", BUDDING_LAPIS);
        register("rose_quartz_crystal_block", ROSE_QUARTZ_CRYSTAL_BLOCK);
        register("rose_quartz_tinted_glass", ROSE_QUARTZ_TINTED_GLASS);
        register("rose_quartz_cluster", ROSE_QUARTZ_CLUSTER);
        register("large_rose_quartz_bud", LARGE_ROSE_QUARTZ_BUD);
        register("medium_rose_quartz_bud", MEDIUM_ROSE_QUARTZ_BUD);
        register("small_rose_quartz_bud", SMALL_ROSE_QUARTZ_BUD);
        register("budding_rose_quartz", BUDDING_ROSE_QUARTZ);
        register("budding_bismuth_block", BUDDING_BISMUTH_BLOCK);
        register("bismuth_cluster", BISMUTH_CLUSTER);
        register("large_bismuth_bud", LARGE_BISMUTH_BUD);
        register("medium_bismuth_bud", MEDIUM_BISMUTH_BUD);
        register("small_bismuth_bud", SMALL_BISMUTH_BUD);
        register("pearl_crystal_block", PEARL_CRYSTAL_BLOCK);
        register("pearl_cluster", PEARL_CLUSTER);
        register("large_pearl_bud", LARGE_PEARL_BUD);
        register("medium_pearl_bud", MEDIUM_PEARL_BUD);
        register("small_pearl_bud", SMALL_PEARL_BUD);
        register("budding_pearl", BUDDING_PEARL);
        register("bismuth_block", BISMUTH_BLOCK);
        register("pyrite", PYRITE);
        register("pyrite_stairs", PYRITE_STAIRS);
        register("pyrite_slab", PYRITE_SLAB);
        register("pyrite_wall", PYRITE_WALL);
        register("calcite_stairs", CALCITE_STAIRS);
        register("calcite_slab", CALCITE_SLAB);
        register("calcite_wall", CALCITE_WALL);
        register("gabbro", GABBRO);
        register("lapis_tinted_glass", LAPIS_TINTED_GLASS);
        register("emerald_tinted_glass", EMERALD_TINTED_GLASS);
    }

    private static void register(String name, Block block) {
        Registry.register(Registries.BLOCK, new Identifier(MoreGeodes.MODID, name), block);
    }

}
