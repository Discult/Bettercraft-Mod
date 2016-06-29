package jordan.bettercraft.init.blocks.ores;

import jordan.bettercraft.init.BetterTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RubyOre extends BetterOre
{
	public RubyOre()
	{
		setRegistryName("ruby_ore");
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
		setHarvestLevel("pickaxe", 2);
		setHardness(2.5F);
		setResistance(13F);
		setCreativeTab(BetterTabs.tabBetterBuildingBlocks);
	}
}
