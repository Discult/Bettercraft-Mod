package jordan.bettercraft.init.blocks.crops;

import jordan.bettercraft.init.BetterFoods;
import jordan.bettercraft.init.BetterItems;
import jordan.bettercraft.init.BetterSeeds;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class LettucePlant extends BlockCrops 
{
	public LettucePlant()
	{
		setRegistryName("lettuce_plant");
		setUnlocalizedName("lettuce_plant");
	}
	

	@Override
	protected Item getSeed() 
	{
		return BetterSeeds.LETTUCE_SEED;
	}
	
	@Override
	protected Item getCrop() 
	{
		return BetterFoods.LETTUCE;
	}
	
	
}
