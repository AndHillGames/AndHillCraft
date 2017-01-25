package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.init.ModItems;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemConversionBall extends Item {
	public ItemConversionBall() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.CONVERSIONBALL.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.CONVERSIONBALL.getRegistryName());
		setMaxStackSize(1);
		setMaxDamage(10);
		canRepair = true;
	}
	
	//@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return ModItems.bloodDiamond == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}
