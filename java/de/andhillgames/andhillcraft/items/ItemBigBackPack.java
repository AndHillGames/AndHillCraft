package de.andhillgames.andhillcraft.items;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemBigBackPack extends Item {
	public ItemBigBackPack() {
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftItems.BIGBACKPACK.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftItems.BIGBACKPACK.getRegistryName());
		setMaxStackSize(1);
	}
}