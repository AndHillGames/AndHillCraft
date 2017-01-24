package de.andhillgames.andhillcraft.blocks;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBloodDiamondBlock extends Block {
	public BlockBloodDiamondBlock() {
		super(Material.IRON);
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftBlocks.BLOODDIAMONDBLOCK.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftBlocks.BLOODDIAMONDBLOCK.getRegistryName());
		setHardness(2.0F);
		setResistance(2.0F);
		setHarvestLevel("pickaxe", 2);
	}
}
