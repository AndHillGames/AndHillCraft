package de.andhillgames.andhillcraft.blocks;

import java.util.Random;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.init.ModItems;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockBloodDiamondOre extends Block {
	public BlockBloodDiamondOre() {
		super(Material.IRON);
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftBlocks.BLOODDIAMONDORE.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftBlocks.BLOODDIAMONDORE.getRegistryName());
		setHardness(2.0F);
		setResistance(2.0F);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public int quantityDropped(Random random) {
        return 1;
    }
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.bloodDiamond;
	}
	
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune)
    {
		Random random = new Random();
        return random.nextInt(2);
    }
}
