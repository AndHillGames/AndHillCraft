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
		
		// Generate BlockBloodDiamondOre
		for (int i=0; i<5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(16);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(ModBlocks.bloodDiamondOre.getDefaultState(), 6)).generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
		}
				
		// Generate BlockRedCoalOre
		for (int i=0; i<10; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(40);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(ModBlocks.redCoalOre.getDefaultState(), 10)).generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
		}
		
		// Generate BlockCopperOre
		for (int i=0; i<10; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(60);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(ModBlocks.copperOre.getDefaultState(), 7)).generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
		}
		
		// Generate BlockTinOre
		for (int i=0; i<10; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(60);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(ModBlocks.tinOre.getDefaultState(), 7)).generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
		}
		
		// Generate BlockSilverOre
		for (int i=0; i<10; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(25);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(ModBlocks.silverOre.getDefaultState(), 7)).generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
		}
		
		// Generate BlockleadOre
		for (int i=0; i<10; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(40);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(ModBlocks.leadOre.getDefaultState(), 7)).generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
		}
		
		// Generate BlockAluminiumOre
		for (int i=0; i<10; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(60);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(ModBlocks.aluminiumOre.getDefaultState(), 7)).generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
		}
		
		// Generate BlockFerrousOre
		for (int i=0; i<10; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(20);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(ModBlocks.ferrousOre.getDefaultState(), 3)).generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
		}
		
		// Generate BlockUraniumOre
		for (int i=0; i<10; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(35);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(ModBlocks.uraniumOre.getDefaultState(), 4)).generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
		}
		
		// Generate BlockSaltOre
		for (int i=0; i<10; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(80);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(ModBlocks.saltOre.getDefaultState(), 10)).generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
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
