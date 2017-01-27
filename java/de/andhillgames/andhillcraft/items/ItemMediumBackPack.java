package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemMediumBackPack extends Item {
	public ItemMediumBackPack() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.MEDIUMBACKPACK.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.MEDIUMBACKPACK.getRegistryName());
		setMaxStackSize(1);
	}
}