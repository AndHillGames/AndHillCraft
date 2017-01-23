package de.andhillgames.andhillcraft.handler;

import de.andhillgames.andhillcraft.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {
	public static void registerShapelessRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DIRT,4), Blocks.GRAVEL, ModItems.conversionBall);
	}
}