package de.andhillgames.andhillcraft.blocks;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockNetherCopperOre extends Block {
	public BlockNetherCopperOre() {
		super(Material.ROCK);
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftBlocks.NETHERCOPPERORE.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftBlocks.NETHERCOPPERORE.getRegistryName());
		setHardness(2.0F);
		setResistance(2.0F);
		setHarvestLevel("pickaxe", 1);
	}
}
