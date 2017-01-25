package de.andhillgames.andhillcraft.init;

import de.andhillgames.andhillcraft.items.ItemAluminiumIngot;
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
import de.andhillgames.andhillcraft.items.ItemPortableCraftingTable;
import de.andhillgames.andhillcraft.items.ItemRedCoal;
import de.andhillgames.andhillcraft.items.ItemSalt;
import de.andhillgames.andhillcraft.items.ItemSilverIngot;
import de.andhillgames.andhillcraft.items.ItemTinIngot;
import de.andhillgames.andhillcraft.items.ItemUraniumIngot;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	// ConversionMod
	public static Item conversionBall;
	public static Item conversionWand;
	public static Item bloodDiamond;
	public static Item bloodDiamondDust;
	public static Item bloodDiamondIngot;
	public static Item flintDust;
	public static Item gravelDust;
	public static Item portableCraftingTable;
	public static Item redCoal;
	
	// More Ores Mod
	public static Item copperIngot;
	public static Item tinIngot;
	public static Item silverIngot;
	public static Item leadIngot;
	public static Item aluminiumIngot;
	public static Item ferrousIngot;
	public static Item uraniumIngot;
	public static Item salt;
	
	public static void init() {
		
		// ConversionMod
		conversionBall = new ItemConversionBall();
		conversionWand = new ItemConversionWand();
		bloodDiamond = new ItemBloodDiamond();
		bloodDiamondDust = new ItemBloodDiamondDust();
		bloodDiamondIngot = new ItemBloodDiamondIngot();
		flintDust = new ItemFlintDust();
		gravelDust = new ItemGravelDust();
		portableCraftingTable = new ItemPortableCraftingTable();
		redCoal = new ItemRedCoal();
		
		// More Ores Mod
		copperIngot = new ItemCopperIngot();
		tinIngot = new ItemTinIngot();
		silverIngot = new ItemSilverIngot();
		leadIngot = new ItemLeadIngot();
		aluminiumIngot = new ItemAluminiumIngot();
		ferrousIngot = new ItemFerrousIngot();
		uraniumIngot = new ItemUraniumIngot();
		salt = new ItemSalt();
	}
	
	public static void register() {
		
		// ConversionMod
		GameRegistry.register(conversionBall);
		GameRegistry.register(conversionWand);
		GameRegistry.register(bloodDiamond);
		GameRegistry.register(bloodDiamondDust);
		GameRegistry.register(bloodDiamondIngot);
		GameRegistry.register(flintDust);
		GameRegistry.register(gravelDust);
		GameRegistry.register(portableCraftingTable);
		GameRegistry.register(redCoal);
		
		// More Ores Mod
		GameRegistry.register(copperIngot);
		GameRegistry.register(tinIngot);
		GameRegistry.register(silverIngot);
		GameRegistry.register(leadIngot);
		GameRegistry.register(aluminiumIngot);
		GameRegistry.register(ferrousIngot);
		GameRegistry.register(uraniumIngot);
		GameRegistry.register(salt);
	}
	
	public static void registerRenders() {
		
		// ConversionMod
		registerRender(conversionBall);
		registerRender(conversionWand);
		registerRender(bloodDiamond);
		registerRender(bloodDiamondDust);
		registerRender(bloodDiamondIngot);
		registerRender(flintDust);
		registerRender(gravelDust);
		registerRender(portableCraftingTable);
		registerRender(redCoal);
		
		// More Ores Mod
		registerRender(copperIngot);
		registerRender(tinIngot);
		registerRender(silverIngot);
		registerRender(leadIngot);
		registerRender(aluminiumIngot);
		registerRender(ferrousIngot);
		registerRender(uraniumIngot);
		registerRender(salt);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}