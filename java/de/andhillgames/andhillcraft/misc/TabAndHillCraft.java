package de.andhillgames.andhillcraft.misc;

import de.andhillgames.andhillcraft.init.ModBlocks;
import de.andhillgames.andhillcraft.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabAndHillCraft extends CreativeTabs {

	public TabAndHillCraft(int index, String label) {
		super(index, label);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.ahgIcon;
	}

}
