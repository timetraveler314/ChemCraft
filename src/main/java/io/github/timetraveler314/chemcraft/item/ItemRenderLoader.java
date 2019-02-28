package io.github.timetraveler314.chemcraft.item;

import io.github.timetraveler314.chemcraft.block.BlockLoader;

public class ItemRenderLoader
{
    public ItemRenderLoader()
    {
        ItemLoader.registerRenders();
        BlockLoader.registerRenders();
    }
}