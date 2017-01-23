package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.Reference;
import net.minecraft.item.Item;

public class ItemConversionBall extends Item {
	public ItemConversionBall() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.CONVERSIONBALL.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.CONVERSIONBALL.getRegistryName());
		setMaxStackSize(1);
		setMaxDamage(1999);
	}
}
