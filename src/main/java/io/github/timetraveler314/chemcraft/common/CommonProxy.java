package io.github.timetraveler314.chemcraft.common;

import io.github.timetraveler314.chemcraft.block.BlockLoader;
import io.github.timetraveler314.chemcraft.crafting.CraftingLoader;
import io.github.timetraveler314.chemcraft.creativetab.CreativeTabsChemCraft;
import io.github.timetraveler314.chemcraft.creativetab.CreativeTabsLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import io.github.timetraveler314.chemcraft.item.ItemLoader;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        new CreativeTabsLoader(event);
        new ItemLoader(event);
        new BlockLoader(event);
        new OreDictionaryLoader(event);
    }

    public void init(FMLInitializationEvent event)
    {
        new CraftingLoader();
    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
