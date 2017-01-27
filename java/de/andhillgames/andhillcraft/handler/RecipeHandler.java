package de.andhillgames.andhillcraft.handler;

import java.util.Random;

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
		GameRegistry.addRecipe(new ItemStack(ModBlocks.advancedCraftingTable, 1), new Object[]{"OXO", "OYO", "OZO", 'X', new ItemStack(ModItems.conversionBall, 1, OreDictionary.WILDCARD_VALUE), 'Y', Blocks.CRAFTING_TABLE, 'Z', Blocks.CHEST, 'O', Blocks.PLANKS});
		GameRegistry.addRecipe(new ItemStack(ModItems.smallBackPack, 1), new Object[]{"XYX", "YZY", "XYX", 'X', Items.STRING, 'Y', Items.LEATHER, 'Z', Blocks.CHEST});
		GameRegistry.addRecipe(new ItemStack(ModItems.mediumBackPack, 1), new Object[]{"X", "Y", "Z", 'X', Blocks.CHEST, 'Y', ModItems.smallBackPack, 'Z', new ItemStack(Items.DYE, 1, 4)});
		GameRegistry.addRecipe(new ItemStack(ModItems.bigBackPack, 1), new Object[]{"X", "Y", "Z", 'X', Blocks.CHEST, 'Y', ModItems.mediumBackPack, 'Z', ModItems.bloodDiamond});
	}
	
	public static void registerSmeltingRecipes() {
		GameRegistry.addSmelting(ModItems.bloodDiamond, new ItemStack(ModItems.bloodDiamondIngot, 2), 1.0F);
		GameRegistry.addSmelting(ModBlocks.copperOre, new ItemStack(ModItems.copperIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.tinOre, new ItemStack(ModItems.tinIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.silverOre, new ItemStack(ModItems.silverIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.leadOre, new ItemStack(ModItems.leadIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.aluminiumOre, new ItemStack(ModItems.aluminiumIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.ferrousOre, new ItemStack(ModItems.ferrousIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.netherCopperOre, new ItemStack(ModItems.copperIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.netherTinOre, new ItemStack(ModItems.tinIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.netherSilverOre, new ItemStack(ModItems.silverIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.netherLeadOre, new ItemStack(ModItems.leadIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.netherAluminiumOre, new ItemStack(ModItems.aluminiumIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.netherFerrousOre, new ItemStack(ModItems.ferrousIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.netherIronOre, new ItemStack(Items.IRON_INGOT, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.netherCoalOre, new ItemStack(Items.COAL, 1, 0), 1.0F);
		GameRegistry.addSmelting(ModBlocks.netherGoldOre, new ItemStack(Items.GOLD_INGOT, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.netherFerrousOre, new ItemStack(ModItems.ferrousIngot, 1), 1.0F);

	}
	
	public static void registerMaceratorRecipes() {
		
	}
	
	public static void registerConversionBallRecipes() {
		
	}
}