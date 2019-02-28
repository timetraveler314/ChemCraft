package io.github.timetraveler314.chemcraft;

import io.github.timetraveler314.chemcraft.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author ustc_zzzz
 */
@Mod(modid = ChemCraft.MODID, name = ChemCraft.NAME, version = ChemCraft.VERSION, acceptedMinecraftVersions = "1.12.2")
public class ChemCraft
{
    public static final String MODID = "chemcraft";
    public static final String NAME = "ChemCraft";
    public static final String VERSION = "1.0.0";

    @SidedProxy(clientSide = "io.github.timetraveler314.chemcraft.client.ClientProxy",
            serverSide = "io.github.timetraveler314.chemcraft.common.CommonProxy")
    public static CommonProxy proxy;

    @Instance(ChemCraft.MODID)
    public static ChemCraft instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
