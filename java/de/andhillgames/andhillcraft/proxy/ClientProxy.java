package de.andhillgames.andhillcraft.proxy;

import de.andhillgames.andhillcraft.init.ModBlocks;
import de.andhillgames.andhillcraft.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
