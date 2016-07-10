package jordan.bettercraft.init.blocks.ores;

import jordan.bettercraft.init.BetterTabs;

public class Bauxite extends BetterOre 
{
	public Bauxite()
	{
	setRegistryName("bauxite");
	setUnlocalizedName("bauxite");
	setHarvestLevel("pickaxe", 2);
	setHardness(2.0F);
	setResistance(10F);
	setCreativeTab(BetterTabs.tabBetterBuildingBlocks);
	}
}
