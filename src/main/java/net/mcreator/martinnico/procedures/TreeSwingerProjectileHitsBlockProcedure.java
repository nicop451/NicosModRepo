package net.mcreator.martinnico.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.martinnico.init.MartinnicoModBlocks;

public class TreeSwingerProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos((int) (Math.floor(x)), (int) (Math.floor(y)), (int) (Math.floor(z))),
				MartinnicoModBlocks.REINFORCED_VINE.defaultBlockState(), 3);
	}
}
