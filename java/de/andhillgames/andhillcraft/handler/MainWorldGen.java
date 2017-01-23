package de.andhillgames.andhillcraft.handler;

import java.util.Random;

import de.andhillgames.andhillcraft.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class MainWorldGen implements IWorldGenerator{

	private void generateInEnd(World world, Random random, int x, int z) {
		
	}

	private void generateInOverworld(World world, Random random, int x, int z) {
		// Generate BlockXPStone
		for (int i=0; i<80; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(64);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(ModBlocks.xpStone.getDefaultState(), 25)).generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
		}
		
	}

	private void generateInNether(World world, Random random, int x, int z) {
		// Generate BlockXPNetherRack
				for (int i=0; i<80; i++) {
					int chunkX = x + random.nextInt(16);
					int chunkY = random.nextInt(128);
					int chunkZ = z + random.nextInt(16);
							
					(new WorldGenMinable(ModBlocks.xpNetherRack.getDefaultState(), 25)).generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
				}
		
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) {
		
		switch(world.provider.getDimension()) {
		case -1:
			generateInNether(world, random, chunkX*16, chunkZ*16);
			break;
		case 0:
			generateInOverworld(world, random, chunkX*16, chunkZ*16);
			break;
		case 1:
			generateInEnd(world, random, chunkX*16, chunkZ*16);
			break;
		}
	}
}
