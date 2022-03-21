package net.mcreator.martinnico.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.martinnico.init.MartinnicoModBlocks;

public class ReinforcedVineUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) (Math.floor(x)), (int) (Math.floor(y) - 1), (int) (Math.floor(z))))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos((int) (Math.floor(x)), (int) (Math.floor(y) - 1), (int) (Math.floor(z))),
					MartinnicoModBlocks.REINFORCED_VINE.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.MYCELIUM, x, y, z, 5, 1, 1, 1, 1);
		}
	}
}
