package io.github.timetraveler314.chemcraft.item;

import io.github.timetraveler314.chemcraft.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemHollowGlassTube extends Item {
    public ItemHollowGlassTube() {
        super();
        this.setUnlocalizedName("hollowGlassTube");
        this.setCreativeTab(CreativeTabsLoader.tabChemCraft);
    }
}
