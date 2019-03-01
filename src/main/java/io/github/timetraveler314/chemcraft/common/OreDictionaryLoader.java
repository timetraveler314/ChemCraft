package io.github.timetraveler314.chemcraft.common;

import io.github.timetraveler314.chemcraft.block.BlockLoader;
import io.github.timetraveler314.chemcraft.item.ItemLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

import java.util.List;

public class OreDictionaryLoader
{
    public OreDictionaryLoader(FMLPreInitializationEvent event)
    {
        registerItem("dustTinySalt", ItemLoader.dustTinySalt);

        registerItem("oreSalt", new ItemBlock(BlockLoader.oreSalt));
    }

    public void registerItem (String name, Item item) {
        OreDictionary.registerOre(name, item);
    }
}
