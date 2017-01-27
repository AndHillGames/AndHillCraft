package de.andhillgames.andhillcraft.init;

import de.andhillgames.andhillcraft.blocks.BlocNetherkAluminiumOre;
import de.andhillgames.andhillcraft.blocks.BlockAdvancedCraftingTable;
import de.andhillgames.andhillcraft.blocks.BlockAluminiumOre;
import de.andhillgames.andhillcraft.blocks.BlockBloodDiamondBlock;
import de.andhillgames.andhillcraft.blocks.BlockBloodDiamondOre;
import de.andhillgames.andhillcraft.blocks.BlockCopperOre;
import de.andhillgames.andhillcraft.blocks.BlockFerrousOre;
import de.andhillgames.andhillcraft.blocks.BlockLeadOre;
import de.andhillgames.andhillcraft.blocks.BlockNetherBloodDiamondOre;
import de.andhillgames.andhillcraft.blocks.BlockNetherCoalOre;
import de.andhillgames.andhillcraft.blocks.BlockNetherCopperOre;
import de.andhillgames.andhillcraft.blocks.BlockNetherDiamondOre;
import de.andhillgames.andhillcraft.blocks.BlockNetherEmeraldOre;
import de.andhillgames.andhillcraft.blocks.BlockNetherFerrousOre;
import de.andhillgames.andhillcraft.blocks.BlockNetherGoldOre;
import de.andhillgames.andhillcraft.blocks.BlockNetherIronOre;
import de.andhillgames.andhillcraft.blocks.BlockNetherLapisLazuliOre;
import de.andhillgames.andhillcraft.blocks.BlockNetherLeadOre;
import de.andhillgames.andhillcraft.blocks.BlockNetherRedCoalOre;
import de.andhillgames.andhillcraft.blocks.BlockNetherRedStoneOre;
import de.andhillgames.andhillcraft.blocks.BlockNetherSaltOre;
import de.andhillgames.andhillcraft.blocks.BlockNetherSilverOre;
import de.andhillgames.andhillcraft.blocks.BlockNetherTinOre;
import de.andhillgames.andhillcraft.blocks.BlockNetherUraniumOre;
import de.andhillgames.andhillcraft.blocks.BlockRedCoalOre;
import de.andhillgames.andhillcraft.blocks.BlockSaltOre;
import de.andhillgames.andhillcraft.blocks.BlockSilverOre;
import de.andhillgames.andhillcraft.blocks.BlockTinOre;
import de.andhillgames.andhillcraft.blocks.BlockUraniumOre;
import de.andhillgames.andhillcraft.blocks.BlockXPNetherRack;
import de.andhillgames.andhillcraft.blocks.BlockXPStone;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModBlocks {
	
	// Building Blocks
	public static Block xpStone;
	public static Block xpNetherRack;
	public static Block bloodDiamondBlock;
	
	// Ores
	public static Block bloodDiamondOre;
	public static Block netherBloodDiamondOre;
	public static Block netherRedCoalOre;
	public static Block redCoalOre;
	public static Block copperOre;
	public static Block tinOre;
	public static Block silverOre;
	public static Block leadOre;
	public static Block aluminiumOre;
	public static Block ferrousOre;
	public static Block uraniumOre;
	public static Block saltOre;
	public static Block netherCopperOre;
	public static Block netherTinOre;
	public static Block netherSilverOre;
	public static Block netherLeadOre;
	public static Block netherAluminiumOre;
	public static Block netherFerrousOre;
	public static Block netherUraniumOre;
	public static Block netherSaltOre;
	public static Block netherIronOre;
	public static Block netherCoalOre;
	public static Block netherGoldOre;
	public static Block netherDiamondOre;
	public static Block netherLapisLazuliOre;
	public static Block netherRedStoneOre;
	public static Block netherEmeraldOre;
	
	// Machines
	public static Block advancedCraftingTable;
	
	
	public static void init() {
		
		// Building Blocks
		xpStone = new BlockXPStone();
		xpNetherRack = new BlockXPNetherRack();
		bloodDiamondBlock = new BlockBloodDiamondBlock();
		
		// Ores
		bloodDiamondOre = new BlockBloodDiamondOre();
		netherBloodDiamondOre = new BlockNetherBloodDiamondOre();
		netherRedCoalOre = new BlockNetherRedCoalOre();
		redCoalOre = new BlockRedCoalOre();
		copperOre = new BlockCopperOre();
		tinOre = new BlockTinOre();
		silverOre = new BlockSilverOre();
		leadOre = new BlockLeadOre();
		aluminiumOre = new BlockAluminiumOre();
		ferrousOre = new BlockFerrousOre();
		uraniumOre = new BlockUraniumOre();
		saltOre = new BlockSaltOre();
		netherCopperOre = new BlockNetherCopperOre();
		netherTinOre = new BlockNetherTinOre();
		netherSilverOre = new BlockNetherSilverOre();
		netherLeadOre = new BlockNetherLeadOre();
		netherAluminiumOre = new BlocNetherkAluminiumOre();
		netherFerrousOre = new BlockNetherFerrousOre();
		netherUraniumOre = new BlockNetherUraniumOre();
		netherSaltOre = new BlockNetherSaltOre();
		netherIronOre = new BlockNetherIronOre();
		netherCoalOre = new BlockNetherCoalOre();
		netherGoldOre = new BlockNetherGoldOre();
		netherDiamondOre = new BlockNetherDiamondOre();
		netherLapisLazuliOre = new BlockNetherLapisLazuliOre();
		netherRedStoneOre = new BlockNetherRedStoneOre();
		netherEmeraldOre = new BlockNetherEmeraldOre();
		
		// Machines
		advancedCraftingTable = new BlockAdvancedCraftingTable();
		
	}
	
	public static void register() {
		
		// Building Blocks
		registerBlock(xpStone);
		registerBlock(xpNetherRack);
		registerBlock(bloodDiamondBlock);
		
		// Ores
		registerBlock(bloodDiamondOre);
		registerBlock(netherBloodDiamondOre);
		registerBlock(netherRedCoalOre);
		registerBlock(redCoalOre);
		registerBlock(copperOre);
		registerBlock(tinOre);
		registerBlock(silverOre);
		registerBlock(leadOre);
		registerBlock(aluminiumOre);
		registerBlock(ferrousOre);
		registerBlock(uraniumOre);
		registerBlock(saltOre);
		registerBlock(netherCopperOre);
		registerBlock(netherTinOre);
		registerBlock(netherSilverOre);
		registerBlock(netherLeadOre);
		registerBlock(netherAluminiumOre);
		registerBlock(netherFerrousOre);
		registerBlock(netherUraniumOre);
		registerBlock(netherSaltOre);
		registerBlock(netherIronOre);
		registerBlock(netherCoalOre);
		registerBlock(netherGoldOre);
		registerBlock(netherDiamondOre);
		registerBlock(netherLapisLazuliOre);
		registerBlock(netherRedStoneOre);
		registerBlock(netherEmeraldOre);
		
		// Machines
		registerBlock(advancedCraftingTable);
		
	}
	
	public static void registerRenders() {
		
		// Building Blocks
		registerRender(xpStone);
		registerRender(xpNetherRack);
		registerRender(bloodDiamondBlock);
		
		// Ores
		registerRender(bloodDiamondOre);
		registerRender(netherBloodDiamondOre);
		registerRender(netherRedCoalOre);
		registerRender(redCoalOre);
		registerRender(copperOre);
		registerRender(tinOre);
		registerRender(silverOre);
		registerRender(leadOre);
		registerRender(aluminiumOre);
		registerRender(ferrousOre);
		registerRender(uraniumOre);
		registerRender(saltOre);
		registerRender(netherCopperOre);
		registerRender(netherTinOre);
		registerRender(netherSilverOre);
		registerRender(netherLeadOre);
		registerRender(netherAluminiumOre);
		registerRender(netherFerrousOre);
		registerRender(netherUraniumOre);
		registerRender(netherSaltOre);
		registerRender(netherIronOre);
		registerRender(netherCoalOre);
		registerRender(netherGoldOre);
		registerRender(netherDiamondOre);
		registerRender(netherLapisLazuliOre);
		registerRender(netherRedStoneOre);
		registerRender(netherEmeraldOre);
		
		// Machines
		registerRender(advancedCraftingTable);
		
	}
	
	public static void registerBlockOres() {
		OreDictionary.registerOre("oreDiamond", bloodDiamondOre);
		OreDictionary.registerOre("oreCopper", copperOre);
		OreDictionary.registerOre("oreTin", tinOre);
		OreDictionary.registerOre("oreSilver", silverOre);
		OreDictionary.registerOre("oreLead", leadOre);
		OreDictionary.registerOre("oreAluminium", aluminiumOre);
		OreDictionary.registerOre("oreFerrous",ferrousOre);
		OreDictionary.registerOre("oreUranium", uraniumOre);
		OreDictionary.registerOre("oreSalt", saltOre);
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