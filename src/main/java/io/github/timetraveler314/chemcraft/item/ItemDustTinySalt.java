package io.github.timetraveler314.chemcraft.item;

import io.github.timetraveler314.chemcraft.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemDustTinySalt extends Item {
    public ItemDustTinySalt() {
        super();
        this.setUnlocalizedName("dustTinySalt");
        this.setCreativeTab(CreativeTabsLoader.tabChemCraft);
    }
}
