package com.github.thedeathlycow.moregeodes.item;

import com.github.thedeathlycow.moregeodes.MoreGeodes;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class GeodesItemGroup {


    public static final RegistryKey<ItemGroup> MORE_GEODES = RegistryKey.of(
            RegistryKeys.ITEM_GROUP,
            new Identifier(MoreGeodes.MODID, "main")
    );

    public static void register() {
        Registry.register(
                Registries.ITEM_GROUP,
                MORE_GEODES,
                FabricItemGroup.builder()
                        .icon(() -> new ItemStack(ModItems.ROSE_QUARTZ_SHARD))
                        .displayName(Text.translatable("itemGroup.geodes.more_geodes"))
                        .entries(((context, entries) -> {
                            // emerald
                            entries.add(new ItemStack(ModItems.EMERALD_TINTED_GLASS));
                            entries.add(new ItemStack(ModItems.EMERALD_CRYSTAL_BLOCK));
                            entries.add(new ItemStack(ModItems.BUDDING_EMERALD));
                            entries.add(new ItemStack(ModItems.EMERALD_CLUSTER));
                            entries.add(new ItemStack(ModItems.LARGE_EMERALD_BUD));
                            entries.add(new ItemStack(ModItems.MEDIUM_EMERALD_BUD));
                            entries.add(new ItemStack(ModItems.SMALL_EMERALD_BUD));

                            // bismuth
                            entries.add(new ItemStack(ModItems.BUDDING_BISMUTH_BLOCK));
                            entries.add(new ItemStack(ModItems.BISMUTH_BLOCK));
                            entries.add(new ItemStack(ModItems.BISMUTH_CLUSTER));
                            entries.add(new ItemStack(ModItems.LARGE_BISMUTH_BUD));
                            entries.add(new ItemStack(ModItems.MEDIUM_BISMUTH_BUD));
                            entries.add(new ItemStack(ModItems.SMALL_BISMUTH_BUD));

                            // diamond
                            entries.add(new ItemStack(ModItems.DIAMOND_CRYSTAL_BLOCK));
                            entries.add(new ItemStack(ModItems.DIAMOND_CLUSTER));

                            // lapis
                            entries.add(new ItemStack(ModItems.LAPIS_TINTED_GLASS));
                            entries.add(new ItemStack(ModItems.LAPIS_CRYSTAL_BLOCK));
                            entries.add(new ItemStack(ModItems.BUDDING_LAPIS));
                            entries.add(new ItemStack(ModItems.LAPIS_CLUSTER));
                            entries.add(new ItemStack(ModItems.LARGE_LAPIS_BUD));
                            entries.add(new ItemStack(ModItems.MEDIUM_LAPIS_BUD));
                            entries.add(new ItemStack(ModItems.SMALL_LAPIS_BUD));

                            // echo
                            entries.add(new ItemStack(ModItems.ECHO_BLOCK));
                            entries.add(new ItemStack(ModItems.BUDDING_ECHO_BLOCK));
                            entries.add(new ItemStack(ModItems.ECHO_CLUSTER));
                            entries.add(new ItemStack(ModItems.LARGE_ECHO_BUD));
                            entries.add(new ItemStack(ModItems.MEDIUM_ECHO_BUD));
                            entries.add(new ItemStack(ModItems.SMALL_ECHO_BUD));

                            // rose quartz
                            entries.add(new ItemStack(ModItems.ROSE_QUARTZ_TINTED_GLASS));
                            entries.add(new ItemStack(ModItems.ROSE_QUARTZ_CRYSTAL_BLOCK));
                            entries.add(new ItemStack(ModItems.BUDDING_ROSE_QUARTZ));
                            entries.add(new ItemStack(ModItems.ROSE_QUARTZ_CLUSTER));
                            entries.add(new ItemStack(ModItems.LARGE_ROSE_QUARTZ_BUD));
                            entries.add(new ItemStack(ModItems.MEDIUM_ROSE_QUARTZ_BUD));
                            entries.add(new ItemStack(ModItems.SMALL_ROSE_QUARTZ_BUD));
                            entries.add(new ItemStack(ModItems.ROSE_QUARTZ_SHARD));


                            // quartz
                            entries.add(new ItemStack(ModItems.QUARTZ_CRYSTAL_BLOCK));
                            entries.add(new ItemStack(ModItems.BUDDING_QUARTZ));
                            entries.add(new ItemStack(ModItems.QUARTZ_CLUSTER));
                            entries.add(new ItemStack(ModItems.LARGE_QUARTZ_BUD));
                            entries.add(new ItemStack(ModItems.MEDIUM_QUARTZ_BUD));
                            entries.add(new ItemStack(ModItems.SMALL_QUARTZ_BUD));

                            // pearl
                            entries.add(new ItemStack(ModItems.PEARL_CRYSTAL_BLOCK));
                            entries.add(new ItemStack(ModItems.BUDDING_PEARL));
                            entries.add(new ItemStack(ModItems.PEARL_CLUSTER));
                            entries.add(new ItemStack(ModItems.LARGE_PEARL_BUD));
                            entries.add(new ItemStack(ModItems.MEDIUM_PEARL_BUD));
                            entries.add(new ItemStack(ModItems.SMALL_PEARL_BUD));

                            entries.add(new ItemStack(ModItems.GABRRO));

                            // pyrite and calcite
                            entries.add(new ItemStack(ModItems.PYRITE_CHUNK));
                            entries.add(new ItemStack(ModItems.PYRITE));
                            entries.add(new ItemStack(ModItems.PYRITE_STAIRS));
                            entries.add(new ItemStack(ModItems.PYRITE_SLAB));
                            entries.add(new ItemStack(ModItems.PYRITE_WALL));
                            entries.add(new ItemStack(Items.CALCITE));
                            entries.add(new ItemStack(ModItems.CALCITE_STAIRS));
                            entries.add(new ItemStack(ModItems.CALCITE_SLAB));
                            entries.add(new ItemStack(ModItems.CALCITE_WALL));

                            entries.add(new ItemStack(ModItems.ROSE_QUARTZ_HELMET));
                            entries.add(new ItemStack(ModItems.ROSE_QUARTZ_CHESTPLATE));
                            entries.add(new ItemStack(ModItems.ROSE_QUARTZ_LEGGINGS));
                            entries.add(new ItemStack(ModItems.ROSE_QUARTZ_BOOTS));

                        }))
                        .build()
        );
    }
}
