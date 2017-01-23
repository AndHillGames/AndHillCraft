package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.Reference;
import net.minecraft.item.Item;

public class ItemBloodDiamondIngot extends Item {
	public ItemBloodDiamondIngot() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.BLOODDIAMONDINGOT.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.BLOODDIAMONDINGOT.getRegistryName());
	}
}
