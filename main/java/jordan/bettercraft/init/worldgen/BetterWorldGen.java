package jordan.bettercraft.init.worldgen;

import java.util.Random;

import jordan.bettercraft.init.BetterBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;

public class BetterWorldGen implements IWorldGenerator
{
	//OverWorldOres
	private WorldGenerator RUBY_ORE;
	private WorldGenerator SAPPHIRE_ORE;
	private WorldGenerator COPPER_ORE;
	
	//NeatherOres
	
	
	 public BetterWorldGen() 
	{
		this.RUBY_ORE = new BetterWorldGenMineable(BetterBlocks.RUBY_ORE.getDefaultState(), 3);
		this.SAPPHIRE_ORE = new BetterWorldGenMineable(BetterBlocks.SAPPHIRE_ORE.getDefaultState(), 3);
		this.COPPER_ORE = new BetterWorldGenMineable(BetterBlocks.COPPER_ORE.getDefaultState(), 3);
	}
	
	@Override
	public void generate(Random random, int chunckX, int chunckZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 0: //OverWorld
			
			this.runGenerator(this.RUBY_ORE, world, random, chunckX, chunckZ, 45, 0, 35);
			this.runGenerator(this.SAPPHIRE_ORE, world, random, chunckX, chunckZ, 45, 0, 35);
			this.runGenerator(this.COPPER_ORE, world, random, chunckX, chunckZ, 55, 0, 50);
			
			break;
		
		case -1: //Neather
			
			break;
			
		case 1: //EndWorld
			
			break;
		}
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random random, int chunckX, int chunckZ, int chanceToSpawn, int minHeight, int maxHeight)
	{
		if(minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Minimum or Maximum Height out of bounds");
		
		int heightDiff = maxHeight - minHeight +1;
		for (int i = 0; i < chanceToSpawn; i++)
		{
			int x = chunckX * 16 + random.nextInt(16);
			int y = minHeight + random.nextInt(heightDiff);
			int z = chunckZ * 16 + random.nextInt(16);
			generator.generate(world, random, new BlockPos(x, y, z));
		}
	}
	
}
