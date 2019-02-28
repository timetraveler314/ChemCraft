package io.github.timetraveler314.chemcraft.creativetab;

import io.github.timetraveler314.chemcraft.item.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabsChemCraft extends CreativeTabs
{
    public CreativeTabsChemCraft()
    {
        super("chemcraft");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemLoader.testCube, 1);
    }

    @Override
    public boolean hasSearchBar()
    {
        return true;
    }
}