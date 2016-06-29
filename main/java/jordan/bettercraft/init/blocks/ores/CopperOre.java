package jordan.bettercraft.init.blocks.ores;

import jordan.bettercraft.init.BetterTabs;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CopperOre extends BetterOre
{
	public CopperOre()
	{
		setRegistryName("copper_ore");
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
		setHarvestLevel("pickaxe", 2);
		setHardness(2.0F);
		setResistance(10F);
		setCreativeTab(BetterTabs.tabBetterBuildingBlocks);
	}
}
