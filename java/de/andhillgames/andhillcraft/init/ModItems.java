package de.andhillgames.andhillcraft.init;

import de.andhillgames.andhillcraft.items.ItemAhgIcon;
import de.andhillgames.andhillcraft.items.ItemAluminiumIngot;
import de.andhillgames.andhillcraft.items.ItemBigBackPack;
import de.andhillgames.andhillcraft.items.ItemBloodDiamond;
import de.andhillgames.andhillcraft.items.ItemBloodDiamondDust;
import de.andhillgames.andhillcraft.items.ItemBloodDiamondIngot;
import de.andhillgames.andhillcraft.items.ItemConversionBall;
import de.andhillgames.andhillcraft.items.ItemConversionWand;
import de.andhillgames.andhillcraft.items.ItemCopperIngot;
import de.andhillgames.andhillcraft.items.ItemFerrousIngot;
import de.andhillgames.andhillcraft.items.ItemFlintDust;
import de.andhillgames.andhillcraft.items.ItemGravelDust;
import de.andhillgames.andhillcraft.items.ItemLeadIngot;
import de.andhillgames.andhillcraft.items.ItemMediumBackPack;
import de.andhillgames.andhillcraft.items.ItemPortableCraftingTable;
import de.andhillgames.andhillcraft.items.ItemRedCoal;
import de.andhillgames.andhillcraft.items.ItemSalt;
import de.andhillgames.andhillcraft.items.ItemSilverIngot;
import de.andhillgames.andhillcraft.items.ItemSmallBackPack;
import de.andhillgames.andhillcraft.items.ItemTinIngot;
import de.andhillgames.andhillcraft.items.ItemUraniumIngot;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems {
	
	// Dummy
	public static Item ahgIcon;

	// Tools
	public static Item conversionBall;
	public static Item conversionWand;
	public static Item portableCraftingTable;
	
	// Materials
	public static Item bloodDiamond;
	public static Item redCoal;
	public static Item bloodDiamondIngot;
	public static Item copperIngot;
	public static Item tinIngot;
	public static Item silverIngot;
	public static Item leadIngot;
	public static Item aluminiumIngot;
	public static Item ferrousIngot;
	public static Item uraniumIngot;
	public static Item bloodDiamondDust;
	public static Item salt;
	public static Item flintDust;
	public static Item gravelDust;
	
	// Miscellaneous
	public static Item smallBackPack;
	public static Item mediumBackPack;
	public static Item bigBackPack;
	
	
	public static void init() {
		
		// Dummy
		ahgIcon = new ItemAhgIcon();
		
		// Tools
		conversionBall = new ItemConversionBall();
		conversionWand = new ItemConversionWand();
		portableCraftingTable = new ItemPortableCraftingTable();
		
		// Materials
		bloodDiamond = new ItemBloodDiamond();
		redCoal = new ItemRedCoal();
		bloodDiamondIngot = new ItemBloodDiamondIngot();
		copperIngot = new ItemCopperIngot();
		tinIngot = new ItemTinIngot();
		silverIngot = new ItemSilverIngot();
		leadIngot = new ItemLeadIngot();
		aluminiumIngot = new ItemAluminiumIngot();
		ferrousIngot = new ItemFerrousIngot();
		uraniumIngot = new ItemUraniumIngot();
		bloodDiamondDust = new ItemBloodDiamondDust();
		flintDust = new ItemFlintDust();
		gravelDust = new ItemGravelDust();
		salt = new ItemSalt();
		
		// Miscellaneous
		smallBackPack = new ItemSmallBackPack();
		mediumBackPack = new ItemMediumBackPack();
		bigBackPack = new ItemBigBackPack();

	}
	
	public static void register() {
		
		// Dummy
		GameRegistry.register(ahgIcon);
		
		// Tools
		GameRegistry.register(conversionBall);
		GameRegistry.register(conversionWand);
		GameRegistry.register(portableCraftingTable);
		
		// Materials
		GameRegistry.register(bloodDiamond);
		GameRegistry.register(redCoal);
		GameRegistry.register(bloodDiamondIngot);
		GameRegistry.register(copperIngot);
		GameRegistry.register(tinIngot);
		GameRegistry.register(silverIngot);
		GameRegistry.register(leadIngot);
		GameRegistry.register(aluminiumIngot);
		GameRegistry.register(ferrousIngot);
		GameRegistry.register(uraniumIngot);
		GameRegistry.register(bloodDiamondDust);
		GameRegistry.register(flintDust);
		GameRegistry.register(gravelDust);
		GameRegistry.register(salt);
		
		// Miscellaneous
		GameRegistry.register(smallBackPack);
		GameRegistry.register(mediumBackPack);
		GameRegistry.register(bigBackPack);
		
	}
	
	public static void registerRenders() {
		
		// Dummy
		registerRender(ahgIcon);
		
		// Tools
		registerRender(conversionBall);
		registerRender(conversionWand);
		registerRender(portableCraftingTable);
		
		// Materials
		registerRender(bloodDiamond);
		registerRender(redCoal);
		registerRender(bloodDiamondIngot);
		registerRender(copperIngot);
		registerRender(tinIngot);
		registerRender(silverIngot);
		registerRender(leadIngot);
		registerRender(aluminiumIngot);
		registerRender(ferrousIngot);
		registerRender(uraniumIngot);
		registerRender(bloodDiamondDust);
		registerRender(flintDust);
		registerRender(gravelDust);
		registerRender(salt);
		
		// Miscellaneous
		registerRender(smallBackPack);
		registerRender(mediumBackPack);
		registerRender(bigBackPack);
		
	}
	
	public static void registerItemOres() {
		OreDictionary.registerOre("ingotCopper", copperIngot);
		OreDictionary.registerOre("ingotTin", tinIngot);
		OreDictionary.registerOre("ingotSilver", silverIngot);
		OreDictionary.registerOre("ingotLead", leadIngot);
		OreDictionary.registerOre("ingotAluminium", aluminiumIngot);
		OreDictionary.registerOre("ingotFerrous", ferrousIngot);
		OreDictionary.registerOre("ingotUranium", uraniumIngot);
		OreDictionary.registerOre("gemDiamond", bloodDiamond);
		OreDictionary.registerOre("dustBloodDiamond", bloodDiamondDust);
		OreDictionary.registerOre("dustFlint", flintDust);
		OreDictionary.registerOre("dustGravel", gravelDust);
		OreDictionary.registerOre("dustSalt", salt);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}