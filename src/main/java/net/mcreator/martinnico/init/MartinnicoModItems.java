
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.martinnico.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.martinnico.item.NicodiumSwordItem;
import net.mcreator.martinnico.item.NicodiumShovelItem;
import net.mcreator.martinnico.item.NicodiumPickaxeItem;
import net.mcreator.martinnico.item.NicodiumHoeItem;
import net.mcreator.martinnico.item.NicodiumAxeItem;
import net.mcreator.martinnico.item.BeepItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MartinnicoModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item BEEP = register(new BeepItem());
	public static final Item NICODIUM_PICKAXE = register(new NicodiumPickaxeItem());
	public static final Item NICODIUM_AXE = register(new NicodiumAxeItem());
	public static final Item NICODIUM_SWORD = register(new NicodiumSwordItem());
	public static final Item NICODIUM_SHOVEL = register(new NicodiumShovelItem());
	public static final Item NICODIUM_HOE = register(new NicodiumHoeItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
