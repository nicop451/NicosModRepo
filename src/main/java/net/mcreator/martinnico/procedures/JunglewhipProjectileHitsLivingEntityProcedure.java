package net.mcreator.martinnico.procedures;

import net.minecraftforge.eventbus.api.Event;

public class JunglewhipProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 100, 2, (false), (false)));
	}
}
