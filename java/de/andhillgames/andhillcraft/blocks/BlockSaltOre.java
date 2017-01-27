package de.andhillgames.andhillcraft.blocks;

import java.util.Random;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.init.ModItems;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockSaltOre extends Block {
	public BlockSaltOre() {
		super(Material.ROCK);
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftBlocks.SALTORE.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftBlocks.SALTORE.getRegistryName());
		setHardness(2.0F);
		setResistance(2.0F);
		setHarvestLevel("pickaxe", 1);
	}
	
	@Override
	public int quantityDropped(Random random) {
		return 4;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.salt;
	}
}