package io.github.timetraveler314.chemcraft.item;

import io.github.timetraveler314.chemcraft.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemTestCubeH2O extends Item {
    public ItemTestCubeH2O() {
        super();
        this.setUnlocalizedName("testCubeH2O");
        this.setCreativeTab(CreativeTabsLoader.tabChemCraft);
    }
}
