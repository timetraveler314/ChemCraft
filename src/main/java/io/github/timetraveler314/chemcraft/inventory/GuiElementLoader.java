package io.github.timetraveler314.chemcraft.inventory;

import io.github.timetraveler314.chemcraft.ChemCraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class GuiElementLoader implements IGuiHandler
{
    public static final int GUI_DISTILLATINGMACHINE = 1;

    public GuiElementLoader()
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(ChemCraft.instance, this);
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        switch (ID)
        {
            case GUI_DISTILLATINGMACHINE:
                return new ContainerDistillatingMachine(player);
            default:
                return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        switch (ID)
        {
            case GUI_DISTILLATINGMACHINE:
                return new GuiContainerDistillatingMachine(new ContainerDistillatingMachine(player));
            default:
                return null;
        }
    }
}