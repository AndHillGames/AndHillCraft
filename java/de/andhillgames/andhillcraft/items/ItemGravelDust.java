package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.item.Item;

public class ItemGravelDust extends Item {
	public ItemGravelDust() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.GRAVELDUST.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.GRAVELDUST.getRegistryName());
	}
}
