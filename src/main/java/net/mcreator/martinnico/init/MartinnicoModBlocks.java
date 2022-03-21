
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.martinnico.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.martinnico.block.ReinforcedVineBlock;
import net.mcreator.martinnico.block.DarkBlueMushroomBlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MartinnicoModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block DARK_BLUE_MUSHROOM_BLOCK = register(new DarkBlueMushroomBlockBlock());
	public static final Block REINFORCED_VINE = register(new ReinforcedVineBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ReinforcedVineBlock.registerRenderLayer();
		}
	}
}
