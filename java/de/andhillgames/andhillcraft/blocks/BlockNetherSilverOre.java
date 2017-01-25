package de.andhillgames.andhillcraft.blocks;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockNetherSilverOre extends Block {
	public BlockNetherSilverOre() {
		super(Material.ROCK);
		setCreativeTab(AndHillCraft.tabAndHillCraftMO);
		setUnlocalizedName(Reference.AndHillCraftBlocks.NETHERSILVERORE.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftBlocks.NETHERSILVERORE.getRegistryName());
		setHardness(2.0F);
		setResistance(2.0F);
		setHarvestLevel("pickaxe", 2);
	}
}