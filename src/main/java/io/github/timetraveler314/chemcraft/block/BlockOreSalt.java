package io.github.timetraveler314.chemcraft.block;

import io.github.timetraveler314.chemcraft.creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOreSalt extends Block {
    public BlockOreSalt () {
        super(Material.ROCK);
        this.setUnlocalizedName("oreSalt");
        this.setHardness(2.5F);
        this.setHarvestLevel("pickaxe", 2);
        this.setCreativeTab(CreativeTabsLoader.tabChemCraft);
    }
}
