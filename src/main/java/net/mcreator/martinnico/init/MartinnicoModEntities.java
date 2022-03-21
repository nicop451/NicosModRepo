
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.martinnico.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.martinnico.entity.TreeSwingerEntity;
import net.mcreator.martinnico.entity.JunglewhipEntity;
import net.mcreator.martinnico.entity.GfEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MartinnicoModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<TreeSwingerEntity> TREE_SWINGER = register("entitybullettree_swinger",
			EntityType.Builder.<TreeSwingerEntity>of(TreeSwingerEntity::new, MobCategory.MISC).setCustomClientFactory(TreeSwingerEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<JunglewhipEntity> JUNGLEWHIP = register("entitybulletjunglewhip",
			EntityType.Builder.<JunglewhipEntity>of(JunglewhipEntity::new, MobCategory.MISC).setCustomClientFactory(JunglewhipEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<GfEntity> GF = register("gf", EntityType.Builder.<GfEntity>of(GfEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GfEntity::new).sized(0.6f, 1.8f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GfEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GF, GfEntity.createAttributes().build());
	}
}
