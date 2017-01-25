package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.item.Item;

public class ItemConversionWand extends Item {
	public ItemConversionWand() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.CONVERSIONWAND.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.CONVERSIONWAND.getRegistryName());
		setMaxStackSize(1);
		setMaxDamage(1999);
	}
}
