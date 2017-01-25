package de.andhillgames.andhillcraft.misc;

import de.andhillgames.andhillcraft.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabAndHillCraftCBM extends CreativeTabs {

	public TabAndHillCraftCBM(int index, String label) {
		super(index, label);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.conversionBall;
	}

}
