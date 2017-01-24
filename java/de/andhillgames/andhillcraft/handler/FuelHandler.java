package de.andhillgames.andhillcraft.handler;

import de.andhillgames.andhillcraft.Reference;
import de.andhillgames.andhillcraft.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		
		if(fuel.getItem() == ModItems.redCoal) {
			return 3200;
		} else {
			return 0;
		}
	}
	
}
