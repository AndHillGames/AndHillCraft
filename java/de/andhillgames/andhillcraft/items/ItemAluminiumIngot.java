package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.item.Item;

public class ItemAluminiumIngot extends Item {
	public ItemAluminiumIngot() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.ALUMINIUMINGOT.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.ALUMINIUMINGOT.getRegistryName());
	}
}