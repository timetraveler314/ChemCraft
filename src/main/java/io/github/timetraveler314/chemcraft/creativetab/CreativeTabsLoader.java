package io.github.timetraveler314.chemcraft.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CreativeTabsLoader {
    public static CreativeTabs tabChemCraft;

    public CreativeTabsLoader (FMLPreInitializationEvent event) {
        tabChemCraft = new CreativeTabsChemCraft();
    }
}
