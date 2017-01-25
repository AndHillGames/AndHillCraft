package de.andhillgames.andhillcraft.misc;

import de.andhillgames.andhillcraft.init.ModBlocks;
import de.andhillgames.andhillcraft.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class TabAndHillCraftMO extends CreativeTabs {

	public TabAndHillCraftMO(int index, String label) {
		super(index, label);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModBlocks.copperOre);
	}

}
