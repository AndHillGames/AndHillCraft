package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.item.Item;

public class ItemSalt extends Item {
	public ItemSalt() {
		setCreativeTab(AndHillCraft.tabAndHillCraftMO);
		setUnlocalizedName(Reference.AndHillCraftItems.SALT.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.SALT.getRegistryName());
	}
}