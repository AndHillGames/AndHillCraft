package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.item.Item;

public class ItemBloodDiamondDust extends Item {
	public ItemBloodDiamondDust() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.BLOODDIAMONDDUST.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.BLOODDIAMONDDUST.getRegistryName());
	}
}