package jordan.bettercraft.init.blocks;

import jordan.bettercraft.init.BetterTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Rock extends Block 
{

	public Rock() 
	{
		super(Material.ROCK);
		setRegistryName("rock");
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
		setCreativeTab(BetterTabs.tabBetterBuildingBlocks);
	}
	
}
