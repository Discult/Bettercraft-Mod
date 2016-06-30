package jordan.bettercraft.init.blocks;

import jordan.bettercraft.init.BetterTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Altar extends Block 
{

	public Altar() 
	{
		super(Material.ROCK);
		setRegistryName("altar");
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
		setCreativeTab(BetterTabs.tabBetterBuildingBlocks);
	}
	
}
