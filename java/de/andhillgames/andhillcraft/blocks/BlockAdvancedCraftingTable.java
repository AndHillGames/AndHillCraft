package de.andhillgames.andhillcraft.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import de.andhillgames.andhillcraft.AndHillCraft;
import de.andhillgames.andhillcraft.init.ModBlocks;
import de.andhillgames.andhillcraft.misc.Reference;
import de.andhillgames.andhillcraft.tileentity.TileEntityAdvancedCraftingTable;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockAdvancedCraftingTable extends Block implements ITileEntityProvider{
	
	public BlockAdvancedCraftingTable() {
		super(Material.WOOD);
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(Reference.AndHillCraftBlocks.ADVANCEDCRAFTINGTABLE.getUnlocalizedName());
		setRegistryName(Reference.AndHillCraftBlocks.ADVANCEDCRAFTINGTABLE.getRegistryName());
		setHardness(1.0F);
		setResistance(1.0F);
		setHarvestLevel("axe", 0);
	}
	
	 @Nullable
	 public Item getItemDropped(IBlockState state, Random rand, int fortune)
	 {
		 return Item.getItemFromBlock(ModBlocks.advancedCraftingTable);
	 }
	 
	 @Override
	 public BlockRenderLayer getBlockLayer() {
		 return BlockRenderLayer.SOLID;
	 }

	 @Override
	 public boolean isFullCube(IBlockState state) {
		 return true;
	 }	 
	 
	 @Override
	 public boolean isOpaqueCube(IBlockState state) {
		 return false;
	 }
	 
	 @Override
	 public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		 if(!worldIn.isRemote) {
			 TileEntity tileentity = worldIn.getTileEntity(pos);
			 if (tileentity instanceof TileEntityAdvancedCraftingTable) {
				 playerIn.openGui(AndHillCraft.instance, AndHillCraft.guiIDAdvancedCraftingTable, worldIn, pos.getX(), pos.getY(), pos.getZ());
				 return true;
			 } else {
				 return false;
			 }
		 } else {
			 return false;
		 }
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityAdvancedCraftingTable();
	}
	 
}