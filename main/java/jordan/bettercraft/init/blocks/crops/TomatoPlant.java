package jordan.bettercraft.init.blocks.crops;

import jordan.bettercraft.init.BetterFoods;
import jordan.bettercraft.init.BetterItems;
import jordan.bettercraft.init.BetterSeeds;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TomatoPlant extends BlockCrops 
{
	public TomatoPlant()
	{
		setRegistryName("tomato_plant");
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
	}
	

	@Override
	protected Item getSeed() 
	{
		return BetterSeeds.TOMATO_SEED;
	}
	
	@Override
	protected Item getCrop() 
	{
		return BetterFoods.TOMATO;
	}
	
	
}
