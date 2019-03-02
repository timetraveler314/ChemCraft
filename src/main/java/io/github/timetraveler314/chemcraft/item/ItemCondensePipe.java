package io.github.timetraveler314.chemcraft.item;

import io.github.timetraveler314.chemcraft.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemCondensePipe extends Item {
    public ItemCondensePipe() {
        super();
        this.setUnlocalizedName("condensePipe");
        this.setCreativeTab(CreativeTabsLoader.tabChemCraft);
    }
}
