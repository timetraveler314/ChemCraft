package io.github.timetraveler314.chemcraft.crafting;

import io.github.timetraveler314.chemcraft.block.BlockLoader;
import io.github.timetraveler314.chemcraft.item.ItemLoader;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
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
        GameRegistry.addShapedRecipe(new ResourceLocation("testCube"), new ResourceLocation("ins"), new ItemStack(ItemLoader.testCube, 3), new Object[]{" # ", "* *", " * ", '#', "plankWood", '*', "paneGlass"});
        /* test cube fill water */
        //GameRegistry.addShapedRecipe(new ResourceLocation("testCubeH2O"));
    }

    private static void registerSmelting()
    {
        /* Clear testCubeH2O */
        GameRegistry.addSmelting(ItemLoader.testCubeH2O, new ItemStack(ItemLoader.testCube), 0.0F);
        /* Burn water bucket into dusttinysalt */
        GameRegistry.addSmelting(Items.WATER_BUCKET, new ItemStack(ItemLoader.dustTinySalt), 0.0F);
        /* burn salt ore to get salt(test) */
        GameRegistry.addSmelting(BlockLoader.oreSalt, new ItemStack(ItemLoader.dustTinySalt, 9), 0.5F);

    }

    private static void registerFuel()
    {

    }
}
