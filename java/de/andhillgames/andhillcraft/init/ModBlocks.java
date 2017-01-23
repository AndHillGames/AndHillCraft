package de.andhillgames.andhillcraft.init;

import de.andhillgames.andhillcraft.blocks.BlockXPNetherRack;
import de.andhillgames.andhillcraft.blocks.BlockXPStone;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block xpStone;
	
	public static Block xpNetherRack;
	
	public static void init() {
		xpStone = new BlockXPStone();
		
		xpNetherRack = new BlockXPNetherRack();
	}
	
	public static void register() {
		registerBlock(xpStone);
		registerBlock(xpNetherRack);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(xpStone);
		registerRender(xpNetherRack);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}