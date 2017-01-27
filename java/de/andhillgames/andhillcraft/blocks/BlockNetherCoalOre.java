package de.andhillgames.andhillcraft.blocks;

import java.util.Random;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.init.ModItems;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockNetherCoalOre extends Block {
	public BlockNetherCoalOre() {
		super(Material.ROCK);
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftBlocks.NETHERCOALORE.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftBlocks.NETHERCOALORE.getRegistryName());
		setHardness(2.0F);
		setResistance(2.0F);
		setHarvestLevel("pickaxe", 1);
	}
}