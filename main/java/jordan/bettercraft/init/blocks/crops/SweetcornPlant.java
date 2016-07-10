package jordan.bettercraft.init.blocks.crops;

import jordan.bettercraft.init.BetterFoods;
import jordan.bettercraft.init.BetterSeeds;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SweetcornPlant extends BlockCrops 
{
	public SweetcornPlant()
	{
		setRegistryName("sweet_corn_plant");
		setUnlocalizedName("sweet_corn_plant");
	}
	
	@Override
	protected Item getSeed() 
	{
		return BetterSeeds.SWEET_CORN_SEED;
	}
	
	@Override
	protected Item getCrop() 
	{
		return BetterFoods.SWEET_CORN_RAW;
	}
}
