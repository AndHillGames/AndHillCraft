package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.item.Item;

public class ItemPortableCraftingTable extends Item {
	public ItemPortableCraftingTable() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.PORTABLECRAFTINGTABLE.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.PORTABLECRAFTINGTABLE.getRegistryName());
	}
}