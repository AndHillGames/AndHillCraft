package de.andhillgames.andhillcraft.handler;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.container.ContainerAdvancedCraftingTable;
import de.andhillgames.andhillcraft.gui.GuiAdvancedCraftingTable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID) {
		case 1: return new ContainerAdvancedCraftingTable(player);
			default: return 0;
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID) {
		case 1: return new GuiAdvancedCraftingTable(player);
			default: return 0;
		}
	}

}
