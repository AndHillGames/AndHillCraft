package de.andhillgames.andhillcraft.gui;

import org.lwjgl.opengl.GL11;

import de.andhillgames.andhillcraft.container.ContainerAdvancedCraftingTable;
import de.andhillgames.andhillcraft.misc.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiAdvancedCraftingTable extends GuiContainer {

	private ResourceLocation texture = new ResourceLocation(Reference.MODID+":"+"textures/gui/advancedCraftingTable.png");
	
	public GuiAdvancedCraftingTable(EntityPlayer player) {
		super(new ContainerAdvancedCraftingTable(player));
		
		this.xSize = 176;
		this.ySize = 232;
	}
	
	@Override
	public void onGuiClosed() {
		super.onGuiClosed();
	}
	
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		this.fontRendererObj.drawString(I18n.format("container.advancedCraftingTable.title", new Object[0]), 26, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.advancedCraftingTable.chest", new Object[0]), 7, this.ySize - 159, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.advancedCraftingTable.inventory", new Object[0]), 7, this.ySize - 92, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GL11.glColor4f(1F, 1F, 1F, 1F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}

}