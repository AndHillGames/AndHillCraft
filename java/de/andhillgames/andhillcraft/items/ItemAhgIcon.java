package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.item.Item;

public class ItemAhgIcon extends Item {
	public ItemAhgIcon() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.AHGICON.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.AHGICON.getRegistryName());
	}
}