package net.mcreator.martinnico.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.martinnico.entity.GfEntity;
import net.mcreator.martinnico.client.model.Modelg;

public class GfRenderer extends MobRenderer<GfEntity, Modelg<GfEntity>> {
	public GfRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelg(context.bakeLayer(Modelg.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GfEntity entity) {
		return new ResourceLocation("martinnico:textures/leaves_particle_texture.png");
	}
}
