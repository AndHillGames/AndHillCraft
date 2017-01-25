package de.andhillgames.andhillcraft;

import de.andhillgames.andhillcraft.handler.CraftingHandler;
import de.andhillgames.andhillcraft.handler.FuelHandler;
import de.andhillgames.andhillcraft.handler.MainWorldGen;
import de.andhillgames.andhillcraft.handler.RecipeHandler;
import de.andhillgames.andhillcraft.init.ModBlocks;
import de.andhillgames.andhillcraft.init.ModItems;
import de.andhillgames.andhillcraft.misc.Reference;
import de.andhillgames.andhillcraft.misc.TabAndHillCraftCBM;
import de.andhillgames.andhillcraft.misc.TabAndHillCraftMO;
import de.andhillgames.andhillcraft.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
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
	public static CreativeTabs tabAndHillCraft = new TabAndHillCraftCBM(CreativeTabs.getNextID(),"TabAndHillCraftCBM");
	public static CreativeTabs tabAndHillCraftMO = new TabAndHillCraftMO(CreativeTabs.getNextID(),"TabAndHillCraftMO");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModItems.register();
		ModBlocks.init();
		ModBlocks.register();
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
		GameRegistry.registerWorldGenerator(WorldGen, 1);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
}
