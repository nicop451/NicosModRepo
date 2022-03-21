package net.mcreator.martinnico.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.martinnico.init.MartinnicoModParticles;
import net.mcreator.martinnico.init.MartinnicoModBlocks;

public class ReinforcedVineUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) (Math.floor(x)), (int) (Math.floor(y) - 1), (int) (Math.floor(z))))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos((int) (Math.floor(x)), (int) (Math.floor(y) - 1), (int) (Math.floor(z))),
					MartinnicoModBlocks.REINFORCED_VINE.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(MartinnicoModParticles.VINE_BUILD_PARTICLE, (Math.floor(x)), (Math.floor(y)), (Math.floor(z)), 15, 0.25, 0.25,
						0.25, 0.3);
		}
	}
}
