package net.mcreator.martinnico.procedures;

import net.minecraftforge.eventbus.api.Event;

public class GrappleHookHitsAnythingProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(x, y, z);
			if (_ent instanceof ServerPlayer _serverPlayer) {
				_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot(), Collections.emptySet());
			}
		}
	}
}
