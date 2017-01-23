package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.Reference;
import net.minecraft.item.Item;

public class ItemBloodDiamond extends Item {
	public ItemBloodDiamond() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.BLOODDIAMOND.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.BLOODDIAMOND.getRegistryName());
	}
}
