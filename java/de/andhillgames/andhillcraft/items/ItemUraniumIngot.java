package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.item.Item;

public class ItemUraniumIngot extends Item {
	public ItemUraniumIngot() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.URANIUMINGOT.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.URANIUMINGOT.getRegistryName());
	}
}