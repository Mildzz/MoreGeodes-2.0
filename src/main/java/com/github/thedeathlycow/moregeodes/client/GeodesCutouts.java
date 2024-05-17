package com.github.thedeathlycow.moregeodes.client;

import com.github.thedeathlycow.moregeodes.blocks.ModBlocks;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class GeodesCutouts {

    public static void registerCutouts() {

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                ModBlocks.EMERALD_CLUSTER, ModBlocks.LARGE_EMERALD_BUD, ModBlocks.MEDIUM_EMERALD_BUD, ModBlocks.SMALL_EMERALD_BUD);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                ModBlocks.QUARTZ_CLUSTER, ModBlocks.LARGE_QUARTZ_BUD, ModBlocks.MEDIUM_QUARTZ_BUD, ModBlocks.SMALL_QUARTZ_BUD);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                ModBlocks.ECHO_CLUSTER, ModBlocks.LARGE_ECHO_BUD, ModBlocks.MEDIUM_ECHO_BUD, ModBlocks.SMALL_ECHO_BUD);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                ModBlocks.LAPIS_CLUSTER, ModBlocks.LARGE_LAPIS_BUD, ModBlocks.MEDIUM_LAPIS_BUD, ModBlocks.SMALL_LAPIS_BUD);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                ModBlocks.ROSE_QUARTZ_CLUSTER, ModBlocks.LARGE_ROSE_QUARTZ_BUD, ModBlocks.MEDIUM_ROSE_QUARTZ_BUD, ModBlocks.SMALL_ROSE_QUARTZ_BUD);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                ModBlocks.PEARL_CLUSTER, ModBlocks.LARGE_PEARL_BUD, ModBlocks.MEDIUM_PEARL_BUD, ModBlocks.SMALL_PEARL_BUD);

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                ModBlocks.BISMUTH_CLUSTER, ModBlocks.LARGE_BISMUTH_BUD, ModBlocks.MEDIUM_BISMUTH_BUD, ModBlocks.SMALL_BISMUTH_BUD);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DIAMOND_CLUSTER, RenderLayer.getCutout());

        //Tinted Glass Translucent Function
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                ModBlocks.ROSE_QUARTZ_TINTED_GLASS, ModBlocks.EMERALD_TINTED_GLASS, ModBlocks.LAPIS_TINTED_GLASS);
    }

}
