package de.andhillgames.andhillcraft.init;

import de.andhillgames.andhillcraft.blocks.BlockBloodDiamondBlock;
import de.andhillgames.andhillcraft.blocks.BlockBloodDiamondOre;
import de.andhillgames.andhillcraft.blocks.BlockNetherBloodDiamondOre;
import de.andhillgames.andhillcraft.blocks.BlockNetherRedCoalOre;
import de.andhillgames.andhillcraft.blocks.BlockRedCoalOre;
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
	public static Block bloodDiamondOre;
	public static Block bloodDiamondBlock;
	public static Block netherBloodDiamondOre;
	public static Block netherRedCoalOre;
	public static Block redCoalOre;
	
	public static void init() {
		xpStone = new BlockXPStone();
		xpNetherRack = new BlockXPNetherRack();
		bloodDiamondOre = new BlockBloodDiamondOre();
		bloodDiamondBlock = new BlockBloodDiamondBlock();
		netherBloodDiamondOre = new BlockNetherBloodDiamondOre();
		netherRedCoalOre = new BlockNetherRedCoalOre();
		redCoalOre = new BlockRedCoalOre();
	}
	
	public static void register() {
		registerBlock(xpStone);
		registerBlock(xpNetherRack);
		registerBlock(bloodDiamondOre);
		registerBlock(bloodDiamondBlock);
		registerBlock(netherBloodDiamondOre);
		registerBlock(netherRedCoalOre);
		registerBlock(redCoalOre);
	}
	
	public static void registerRenders() {
		registerRender(xpStone);
		registerRender(xpNetherRack);
		registerRender(bloodDiamondOre);
		registerRender(bloodDiamondBlock);
		registerRender(netherBloodDiamondOre);
		registerRender(netherRedCoalOre);
		registerRender(redCoalOre);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}