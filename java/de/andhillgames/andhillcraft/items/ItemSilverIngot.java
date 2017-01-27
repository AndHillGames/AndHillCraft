package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.item.Item;

public class ItemSilverIngot extends Item {
	public ItemSilverIngot() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.SILVERINGOT.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.SILVERINGOT.getRegistryName());
	}
}