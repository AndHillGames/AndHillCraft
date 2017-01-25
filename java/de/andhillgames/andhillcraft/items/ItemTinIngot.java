package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.item.Item;

public class ItemTinIngot extends Item {
	public ItemTinIngot() {
		setCreativeTab(AndHillCraft.tabAndHillCraftMO);
		setUnlocalizedName(Reference.AndHillCraftItems.TININGOT.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.TININGOT.getRegistryName());
	}
}