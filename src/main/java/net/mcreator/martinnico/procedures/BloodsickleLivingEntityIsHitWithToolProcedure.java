package net.mcreator.martinnico.procedures;

import net.minecraftforge.eventbus.api.Event;

public class BloodsickleLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 60, 1, (false), (false)));
	}
}
