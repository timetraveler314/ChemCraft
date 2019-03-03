package io.github.timetraveler314.chemcraft.inventory;

import io.github.timetraveler314.chemcraft.ChemCraft;
import io.github.timetraveler314.chemcraft.item.ItemLoader;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.swing.*;

@SideOnly(Side.CLIENT)
public class GuiContainerDistillatingMachine extends GuiContainer
{
    private static final String TEXTURE_PATH = ChemCraft.MODID + ":" + "textures/gui/container/gui_distillating_machine.png";
    private static final ResourceLocation TEXTURE = new ResourceLocation(TEXTURE_PATH);
    private DebugGraphics fontRendererObj;

    public GuiContainerDistillatingMachine(ContainerDistillatingMachine inventorySlotsIn) {
        super(inventorySlotsIn);
        this.xSize = 175;
        this.ySize = 165;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        GlStateManager.color(1.0F, 1.0F, 1.0F);

        this.mc.getTextureManager().bindTexture(TEXTURE);
        int offsetX = (this.width - this.xSize) / 2, offsetY = (this.height - this.ySize) / 2;

        this.drawTexturedModalRect(offsetX, offsetY, 0, 0, this.xSize, this.ySize);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        this.drawVerticalLine(30, 19, 36, 0xFF000000);
        this.drawHorizontalLine(8, 167, 43, 0xFF000000);

        String title = I18n.format("container.fmltutor.demo");
        this.fontRendererObj.drawString(title, (this.xSize - this.fontRendererObj.getStringWidth(title)) / 2, 6, 0x404040);

        /*ItemStack item = new ItemStack(ItemLoader.xxx);
        this.itemRender.renderItemAndEffectIntoGUI(item, 8, 20);*/
    }
}
