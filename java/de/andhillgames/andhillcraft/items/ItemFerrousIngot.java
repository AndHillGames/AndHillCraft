package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.item.Item;

public class ItemFerrousIngot extends Item {
	public ItemFerrousIngot() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.FERROUSINGOT.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.FERROUSINGOT.getRegistryName());
	}
}