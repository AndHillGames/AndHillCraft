package de.andhillgames.andhillcraft.blocks;

import java.util.Random;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.Reference;
import de.andhillgames.andhillcraft.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockNetherRedCoalOre extends Block {
	public BlockNetherRedCoalOre() {
		super(Material.ROCK);
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftBlocks.NETHERREDCOAL.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftBlocks.NETHERREDCOAL.getRegistryName());
		setHardness(2.0F);
		setResistance(2.0F);
		setHarvestLevel("pickaxe", 0);
	}
	
	@Override
	public int quantityDropped(Random random) {
        return 2;
    }
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.redCoal;
	}
	
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune)
    {
		Random random = new Random();
        return random.nextInt(2);
    }
}
