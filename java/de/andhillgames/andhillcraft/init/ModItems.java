package de.andhillgames.andhillcraft.init;

import de.andhillgames.andhillcraft.Reference;
import de.andhillgames.andhillcraft.items.ItemBloodDiamond;
import de.andhillgames.andhillcraft.items.ItemBloodDiamondDust;
import de.andhillgames.andhillcraft.items.ItemBloodDiamondIngot;
import de.andhillgames.andhillcraft.items.ItemConversionBall;
import de.andhillgames.andhillcraft.items.ItemConversionWand;
import de.andhillgames.andhillcraft.items.ItemFlintDust;
import de.andhillgames.andhillcraft.items.ItemGravelDust;
import de.andhillgames.andhillcraft.items.ItemPortableCraftingTable;
import de.andhillgames.andhillcraft.items.ItemRedCoal;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item conversionBall;
	public static Item conversionWand;
	public static Item bloodDiamond;
	public static Item bloodDiamondDust;
	public static Item bloodDiamondIngot;
	public static Item flintDust;
	public static Item gravelDust;
	public static Item portableCraftingTable;
	public static Item redCoal;
	
	public static void init() {
		conversionBall = new ItemConversionBall();
		conversionWand = new ItemConversionWand();
		bloodDiamond = new ItemBloodDiamond();
		bloodDiamondDust = new ItemBloodDiamondDust();
		bloodDiamondIngot = new ItemBloodDiamondIngot();
		flintDust = new ItemFlintDust();
		gravelDust = new ItemGravelDust();
		portableCraftingTable = new ItemPortableCraftingTable();
		redCoal = new ItemRedCoal();
	}
	
	public static void register() {
		GameRegistry.register(conversionBall);
		GameRegistry.register(conversionWand);
		GameRegistry.register(bloodDiamond);
		GameRegistry.register(bloodDiamondDust);
		GameRegistry.register(bloodDiamondIngot);
		GameRegistry.register(flintDust);
		GameRegistry.register(gravelDust);
		GameRegistry.register(portableCraftingTable);
		GameRegistry.register(redCoal);
	}
	
	public static void registerRenders() {
		registerRender(conversionBall);
		registerRender(conversionWand);
		registerRender(bloodDiamond);
		registerRender(bloodDiamondDust);
		registerRender(bloodDiamondIngot);
		registerRender(flintDust);
		registerRender(gravelDust);
		registerRender(portableCraftingTable);
		registerRender(redCoal);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}