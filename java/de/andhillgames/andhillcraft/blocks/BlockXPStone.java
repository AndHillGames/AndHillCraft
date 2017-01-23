package de.andhillgames.andhillcraft.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockXPStone extends Block {
	public BlockXPStone() {
		super(Material.ROCK);
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftBlocks.XPSTONE.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftBlocks.XPSTONE.getRegistryName());
		setHardness(2.0F);
		setResistance(2.0F);
		setHarvestLevel("pickaxe", 0);
	}
	
	@Override
	public int quantityDropped(Random random)
    {
        return 1;
    }
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(Blocks.COBBLESTONE);
	}
	
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune)
    {
		Random random = new Random();
        return random.nextInt(2);
    }
}
