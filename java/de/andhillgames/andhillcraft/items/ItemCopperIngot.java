package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.item.Item;

public class ItemCopperIngot extends Item {
	public ItemCopperIngot() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.COPPERINGOT.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.COPPERINGOT.getRegistryName());
	}
}
