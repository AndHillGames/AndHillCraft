package de.andhillgames.andhillcraft.handler;

import de.andhillgames.andhillcraft.init.ModBlocks;
import de.andhillgames.andhillcraft.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class RecipeHandler {
	public static void registerShapelessRecipes() {
		
	}
	
	public static void registerShapedRecipes() {
		GameRegistry.addRecipe(new ItemStack(ModItems.conversionBall,1), new Object[] {"XXX", "XYX", "XXX", 'X',ModItems.bloodDiamond, 'Y', Items.DIAMOND});
		GameRegistry.addRecipe(new ItemStack(ModItems.conversionWand, 1), new Object[]{" X", "Y ", 'X', new ItemStack(ModItems.conversionBall, 1, OreDictionary.WILDCARD_VALUE), 'Y', Items.STICK});
	}
	
	public static void registerSmeltingRecipes() {
		GameRegistry.addSmelting(ModItems.bloodDiamond, new ItemStack(ModItems.bloodDiamondIngot, 2), 1.0F);
		GameRegistry.addSmelting(ModBlocks.copperOre, new ItemStack(ModItems.copperIngot, 1), 1.0F);
	}
	
	public static void registerMaceratorRecipes() {
		
	}
}