package jordan.bettercraft.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BetterTabs 
{
	public static final CreativeTabs tabBetterBuildingBlocks = new CreativeTabs("BetterBuildingBlocks") 
	{
		
		@Override
		public Item getTabIconItem() 
		{
			return Item.getItemFromBlock(BetterBlocks.RUBY_ORE);
		}
	};
	
	public static final CreativeTabs tabBetterDecorationBlocks = new CreativeTabs("BetterDecorationBlocks") 
	{
		
		@Override
		public Item getTabIconItem() 
		{
			return Item.getItemFromBlock(Blocks.LEAVES2);
		}
	};
	
	public static final CreativeTabs tabBetterRedstone = new CreativeTabs("BetterRedstone") 
	{
		
		@Override
		public Item getTabIconItem() 
		{
			return Items.REDSTONE;
		}
	};
	
	public static final CreativeTabs tabBetterTransport = new CreativeTabs("BetterTransport") 
	{
		
		@Override
		public Item getTabIconItem() 
		{
			return Items.MINECART;
		}
	};
	
	public static final CreativeTabs tabBetterMiscellaneous = new CreativeTabs("BetterMiscellaneous") 
	{
		
		@Override
		public Item getTabIconItem() 
		{
			return Items.BUCKET;
		}
	};
	
	public static final CreativeTabs tabBetterFood = new CreativeTabs("BetterFood") 
	{
		
		@Override
		public Item getTabIconItem() 
		{
			return Items.BEEF;
		}
	};
	
	public static final CreativeTabs tabBetterTools = new CreativeTabs("BetterTools") 
	{
		
		@Override
		public Item getTabIconItem() 
		{
			return BetterTools.SAPPHIRE_PICKAXE;
		}
	};
	
	public static final CreativeTabs tabBetterCombat = new CreativeTabs("BetterCombat") 
	{
		
		@Override
		public Item getTabIconItem() 
		{
			return BetterWeapons.EMERALD_SWORD;
		}
	};
	
	
	public static final CreativeTabs tabBetterMaterials = new CreativeTabs("BetterMaterials") 
	{
		
		@Override
		public Item getTabIconItem() 
		{
			return BetterItems.SAPPHIRE;
		}
	};
}
