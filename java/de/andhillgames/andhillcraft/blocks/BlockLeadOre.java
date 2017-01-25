package de.andhillgames.andhillcraft.blocks;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLeadOre extends Block {
	public BlockLeadOre() {
		super(Material.ROCK);
		setCreativeTab(AndHillCraft.tabAndHillCraftMO);
		setUnlocalizedName(Reference.AndHillCraftBlocks.LEADORE.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftBlocks.LEADORE.getRegistryName());
		setHardness(2.0F);
		setResistance(2.0F);
		setHarvestLevel("pickaxe", 2);
	}
}
