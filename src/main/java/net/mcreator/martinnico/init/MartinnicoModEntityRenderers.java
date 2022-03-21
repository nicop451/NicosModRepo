
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.martinnico.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.martinnico.client.renderer.GfRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MartinnicoModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MartinnicoModEntities.TREE_SWINGER, ThrownItemRenderer::new);
		event.registerEntityRenderer(MartinnicoModEntities.JUNGLEWHIP, ThrownItemRenderer::new);
		event.registerEntityRenderer(MartinnicoModEntities.GF, GfRenderer::new);
	}
}
