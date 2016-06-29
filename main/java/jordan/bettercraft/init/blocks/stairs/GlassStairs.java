package jordan.bettercraft.init.blocks.stairs;

import jordan.bettercraft.init.BetterBlocks;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GlassStairs extends BlockStairs
{

	public GlassStairs(IBlockState modelState) 
	{
		super(modelState);
		setRegistryName("glass_stairs");
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
	}
	
}
