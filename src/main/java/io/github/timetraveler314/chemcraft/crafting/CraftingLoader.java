package io.github.timetraveler314.chemcraft.crafting;

import io.github.timetraveler314.chemcraft.item.ItemLoader;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemLead;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingLoader
{
    public CraftingLoader()
    {
        registerRecipe();
        registerSmelting();
        registerFuel();
    }

    private static void registerRecipe()
    {
        /* test cube */
        GameRegistry.addShapedRecipe(new ResourceLocation("testCube"), new ResourceLocation("ins"), new ItemStack(ItemLoader.testCube, 3), new Object[]{" # ", "* *", " * ", '#', Blocks.PLANKS, '*', Blocks.GLASS_PANE});
        /* test cube fill water */
        //GameRegistry.addShapedRecipe(new ResourceLocation("testCubeH2O"));
    }

    private static void registerSmelting()
    {
        GameRegistry.addSmelting(ItemLoader.testCubeH2O, new ItemStack(ItemLoader.testCube), 0.0F);
    }

    private static void registerFuel()
    {

    }
}
