package io.github.timetraveler314.chemcraft.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
//import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.GameData;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class BlockLoader {
    public static Block saltEvaporator = new BlockSaltEvaporator();
    public static Block oreSalt = new BlockOreSalt();

    public BlockLoader(FMLPreInitializationEvent event) {
        register(saltEvaporator, "salt_evaporator");
        register(oreSalt, "ore_salt");
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(saltEvaporator);
        registerRender(oreSalt);
    }

    private static void register(Block block, String name) {
        ForgeRegistries.BLOCKS.register(block.setRegistryName(name));
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(name));
        //GameData.getBlockItemMap().put(block, itemBlock);
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Block block) {
        ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, model);

    }
}
