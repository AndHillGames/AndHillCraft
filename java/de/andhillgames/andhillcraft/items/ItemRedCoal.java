package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.item.Item;

public class ItemRedCoal extends Item {
	public ItemRedCoal() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.REDCOAL.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.REDCOAL.getRegistryName());
	}
}