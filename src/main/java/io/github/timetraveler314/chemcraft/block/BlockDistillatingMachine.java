package io.github.timetraveler314.chemcraft.block;

import io.github.timetraveler314.chemcraft.creativetab.CreativeTabsLoader;
import io.github.timetraveler314.chemcraft.tileentity.TileEntityDistillatingMachine;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class BlockDistillatingMachine extends BlockContainer {
    public BlockDistillatingMachine () {
        super(Material.IRON);
        this.setUnlocalizedName("distillatingMachine");
        this.setHardness(5F);
        this.setHarvestLevel("pickaxe", 2);
        this.setCreativeTab(CreativeTabsLoader.tabChemCraft);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH)
                .withProperty(WORKING, Boolean.FALSE));
    }

    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
    public static final PropertyBool WORKING = PropertyBool.create("working");

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, FACING, WORKING);
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        EnumFacing facing = EnumFacing.getHorizontal(meta & 3);
        Boolean working = Boolean.valueOf((meta & 4) != 0);
        return this.getDefaultState().withProperty(FACING, facing).withProperty(WORKING, working);
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        int facing = state.getValue(FACING).getHorizontalIndex();
        int working = state.getValue(WORKING).booleanValue() ? 4 : 0;
        return facing | working;
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list)
    {
        list.add(new ItemStack(itemIn, 1, 0));
    }


    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityDistillatingMachine();
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.SOLID;
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState iBlockState) {
        return EnumBlockRenderType.MODEL;
    }


}
