package io.github.timetraveler314.chemcraft.worldgen;

import io.github.timetraveler314.chemcraft.block.BlockLoader;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.event.terraingen.WorldTypeEvent;

import java.util.Random;

public class WorldGeneratorSaltOre extends WorldGenerator {

    private final WorldGenerator saltOreGenerator = new WorldGenMinable(BlockLoader.oreSalt.getDefaultState(), 16);

    @Override
    public boolean generate(World world, Random rand, BlockPos pos)
    {
        if (TerrainGen.generateOre(world, rand, this, pos, OreGenEvent.GenerateMinable.EventType.CUSTOM))
        {
            for (int i = 0; i < 10; ++i)
            {
                int posX = pos.getX() + rand.nextInt(16);
                int posY = 16 + rand.nextInt(16);
                int posZ = pos.getZ() + rand.nextInt(16);
                BlockPos blockpos = new BlockPos(posX, posY, posZ);

                saltOreGenerator.generate(world, rand, blockpos);
            }
        }
        return true;
    }
}
