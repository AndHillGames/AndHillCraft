package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemSmallBackPack extends Item {
	public ItemSmallBackPack() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.SMALLBACKPACK.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.SMALLBACKPACK.getRegistryName());
		setMaxStackSize(1);
	}
}