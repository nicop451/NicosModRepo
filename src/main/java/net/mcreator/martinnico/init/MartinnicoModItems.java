
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.martinnico.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.martinnico.item.StaffofjudgmentItem;
import net.mcreator.martinnico.item.JunglewhipItem;
import net.mcreator.martinnico.item.BloodsickleItem;
import net.mcreator.martinnico.item.BlankItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MartinnicoModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item STAFFOFJUDGMENT = register(new StaffofjudgmentItem());
	public static final Item JUNGLEWHIP = register(new JunglewhipItem());
	public static final Item BLANK = register(new BlankItem());
	public static final Item BLOODSICKLE = register(new BloodsickleItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
