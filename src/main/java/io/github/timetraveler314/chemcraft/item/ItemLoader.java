package io.github.timetraveler314.chemcraft.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
//import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader
{
    public static Item testCube = new ItemTestCube();
    public static Item testCubeH2O = new ItemTestCubeH2O();

    public ItemLoader(FMLPreInitializationEvent event)
    {
        register(testCube, "test_cube");
        register(testCubeH2O, "test_cube_h2o");
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(testCube);
        registerRender(testCubeH2O);
    }

    private static void register(Item item, String name)
    {
        ForgeRegistries.ITEMS.register(item.setRegistryName(name));
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item)
    {
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, model);
    }
}
