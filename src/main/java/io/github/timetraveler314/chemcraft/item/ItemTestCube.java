package io.github.timetraveler314.chemcraft.item;

import io.github.timetraveler314.chemcraft.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemTestCube extends Item {
    public ItemTestCube() {
        super();
        this.setUnlocalizedName("testCube");
        this.setCreativeTab(CreativeTabsLoader.tabChemCraft);
    }
}