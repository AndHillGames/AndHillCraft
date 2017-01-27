package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.item.Item;

public class ItemLeadIngot extends Item {
	public ItemLeadIngot() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.LEADINGOT.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.LEADINGOT.getRegistryName());
	}
}