package io.github.timetraveler314.chemcraft.tileentity;

import io.github.timetraveler314.chemcraft.ChemCraft;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityLoader {
    public TileEntityLoader(FMLPreInitializationEvent event)
    {
        registerTileEntity(TileEntityDistillatingMachine.class, "DistillatingMachine");
    }

    public void registerTileEntity(Class<? extends TileEntity> tileEntityClass, String id)
    {
        GameRegistry.registerTileEntity(tileEntityClass, new ResourceLocation(ChemCraft.MODID + ":" + id));
    }
}
