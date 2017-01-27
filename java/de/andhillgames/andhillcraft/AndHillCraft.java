package de.andhillgames.andhillcraft;

import de.andhillgames.andhillcraft.handler.CraftingHandler;
import de.andhillgames.andhillcraft.handler.FuelHandler;
import de.andhillgames.andhillcraft.handler.GuiHandler;
import de.andhillgames.andhillcraft.handler.MainWorldGen;
import de.andhillgames.andhillcraft.handler.RecipeHandler;
import de.andhillgames.andhillcraft.init.ModBlocks;
import de.andhillgames.andhillcraft.init.ModItems;
import de.andhillgames.andhillcraft.misc.Reference;
import de.andhillgames.andhillcraft.misc.TabAndHillCraft;
import de.andhillgames.andhillcraft.proxy.CommonProxy;
import de.andhillgames.andhillcraft.tileentity.TileEntityAdvancedCraftingTable;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.MCVERSIONS)
public class AndHillCraft {

	@Instance
	public static AndHillCraft instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	// WORLDGENERATOR
	public static MainWorldGen WorldGen = new MainWorldGen();	
	
	// CraftingHandler
	public static CraftingHandler craftingHandler = new CraftingHandler();
	
	// DECLARE CREATIVETAB
	public static CreativeTabs tabAndHillCraft = new TabAndHillCraft(CreativeTabs.getNextID(),"TabAndHillCraft");
	
	// GUI Definition
	public static final int guiIDAdvancedCraftingTable = 1;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModItems.register();
		ModItems.registerItemOres();
		ModBlocks.init();
		ModBlocks.register();
		ModBlocks.registerBlockOres();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
		MinecraftForge.EVENT_BUS.register(craftingHandler);
		GameRegistry.registerFuelHandler(new FuelHandler());
		RecipeHandler.registerShapelessRecipes();
		RecipeHandler.registerShapedRecipes();
		RecipeHandler.registerSmeltingRecipes();
		RecipeHandler.registerMaceratorRecipes();
		RecipeHandler.registerConversionBallRecipes();
		GameRegistry.registerWorldGenerator(WorldGen, 1);
		
		// Register Tile Entities
		GameRegistry.registerTileEntity(TileEntityAdvancedCraftingTable.class, Reference.MODID + "_" + "TileEntityAdvancedCraftingTable");
		
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
}
