
package net.mcreator.martinnico.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.martinnico.init.MartinnicoModParticles;

import java.util.Random;
import java.util.List;
import java.util.Collections;

public class DarkBlueMushroomBlockBlock extends Block {
	public DarkBlueMushroomBlockBlock() {
		super(BlockBehaviour.Properties.of(Material.DECORATION).sound(SoundType.WOOD).strength(1f, 10f).lightLevel(s -> 13)
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
		setRegistryName("dark_blue_mushroom_block");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
		super.animateTick(blockstate, world, pos, random);
		Player entity = Minecraft.getInstance().player;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		for (int l = 0; l < 5; ++l) {
			double x0 = x + 0.5 + (random.nextFloat() - 0.5) * 0.2D;
			double y0 = y + 1.2 + (random.nextFloat() - 0.5) * 0.2D * 100;
			double z0 = z + 0.5 + (random.nextFloat() - 0.5) * 0.2D;
			world.addParticle(MartinnicoModParticles.SHROOM_SPORES, x0, y0, z0, 0, 0, 0);
		}
	}
}
