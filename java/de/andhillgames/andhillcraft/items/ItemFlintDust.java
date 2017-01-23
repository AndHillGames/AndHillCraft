package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.Reference;
import net.minecraft.item.Item;

public class ItemFlintDust extends Item {
	public ItemFlintDust() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.FLINTDUST.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.FLINTDUST.getRegistryName());
	}
}