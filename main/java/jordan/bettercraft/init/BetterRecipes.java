package jordan.bettercraft.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BetterRecipes 
{
	
	public static void register()
	{
		BetterRecipes.crafting();
		BetterRecipes.smelting();
	}
	
	public static void crafting()
	{
		//RubyStuff
		GameRegistry.addRecipe(new ItemStack(BetterTools.RUBY_PICKAXE), new Object[] {
				"RRR",
				" S ",
				" S ",
				'R', BetterItems.RUBY, 'S', Items.STICK
				
		});
		
		GameRegistry.addRecipe(new ItemStack(BetterTools.RUBY_AXE), new Object[] {
				"RR ",
				"RS ",
				" S ",
				'R', BetterItems.RUBY, 'S', Items.STICK
				
		});
		
		GameRegistry.addRecipe(new ItemStack(BetterTools.RUBY_SHOVEL), new Object[] {
				" R ",
				" S ",
				" S ",
				'R', BetterItems.RUBY, 'S', Items.STICK
				
		});
		
		GameRegistry.addRecipe(new ItemStack(BetterWeapons.RUBY_SWORD), new Object[] {
				" R ",
				" R ",
				" S ",
				'R', BetterItems.RUBY, 'S', Items.STICK
				
		});
		//RubyStuffEnd
		
		//SapphireStuffStart
		GameRegistry.addRecipe(new ItemStack(BetterTools.SAPPHIRE_PICKAXE), new Object[] {
				"SSS",
				" s ",
				" s ",
				'S', BetterItems.SAPPHIRE, 's', Items.STICK
				
		});
		
		GameRegistry.addRecipe(new ItemStack(BetterTools.SAPPHIRE_AXE), new Object[] {
				"SS ",
				"Ss ",
				" s ",
				'S', BetterItems.SAPPHIRE, 's', Items.STICK
				
		});
		
		GameRegistry.addRecipe(new ItemStack(BetterTools.SAPPHIRE_SHOVEL), new Object[] {
				" S ",
				" s ",
				" s ",
				'S', BetterItems.SAPPHIRE, 's', Items.STICK
				
		});
		
		GameRegistry.addRecipe(new ItemStack(BetterWeapons.SAPPHIRE_SWORD), new Object[] {
				" S ",
				" S ",
				" s ",
				'S', BetterItems.SAPPHIRE, 's', Items.STICK
				
		});
		//SapphireStuffEnd
		
		//EmeraldStuff
		GameRegistry.addRecipe(new ItemStack(BetterTools.EMERALD_PICKAXE), new Object[] {
				"EEE",
				" s ",
				" s ",
				'E', Items.EMERALD, 's', Items.STICK
				
		});
		
		GameRegistry.addRecipe(new ItemStack(BetterTools.EMERALD_AXE), new Object[] {
				"EE ",
				"Es ",
				" s ",
				'E', BetterItems.COPPER_INGOT, 's', Items.STICK
				
		});
		
		GameRegistry.addRecipe(new ItemStack(BetterTools.EMERALD_SHOVEL), new Object[] {
				" E ",
				" s ",
				" s ",
				'E', Items.EMERALD, 's', Items.STICK
				
		});
		
		GameRegistry.addRecipe(new ItemStack(BetterWeapons.EMERALD_SWORD), new Object[] {
				" E ",
				" E ",
				" s ",
				'E', Items.EMERALD, 's', Items.STICK
				
		});
		//EmeraldStuffEnd
		
		//CopperStuff
		GameRegistry.addRecipe(new ItemStack(BetterTools.COPPER_PICKAXE), new Object[] {
				"CCC",
				" s ",
				" s ",
				'C', BetterItems.COPPER_INGOT, 's', Items.STICK
				
		});
		
		GameRegistry.addRecipe(new ItemStack(BetterTools.COPPER_AXE), new Object[] {
				"CC ",
				"Cs ",
				" s ",
				'C', BetterItems.COPPER_INGOT, 's', Items.STICK
				
		});
		
		GameRegistry.addRecipe(new ItemStack(BetterTools.COPPER_SHOVEL), new Object[] {
				" C ",
				" s ",
				" s ",
				'C', BetterItems.COPPER_INGOT, 's', Items.STICK
				
		});
		
		GameRegistry.addRecipe(new ItemStack(BetterWeapons.COPPER_SWORD), new Object[] {
				" C ",
				" C ",
				" s ",
				'C', BetterItems.COPPER_INGOT, 's', Items.STICK
				
		});
		//CopperStuffEnd
		
		//Steel Stuff
		GameRegistry.addRecipe(new ItemStack(BetterArmor.STEEL_HELMET), new Object[]{
				"SSS",
				"S S",
				"   ",
				'S', BetterItems.STEEL_INGOT
		});
		//Steel Stuff End
		//Food
		GameRegistry.addRecipe(new ItemStack(BetterFoods.BACON), new Object[] {
				" B ",
				" S ",
				
				'B', BetterItems.SALT, 'S', Items.PORKCHOP
				
		});
		GameRegistry.addRecipe(new ItemStack(BetterFoods.BLT), new Object[] {
				" B ",
				" L ",
				" T ",
				'B', BetterFoods.BACON, 'L', BetterFoods.LETTUCE, 'T', BetterFoods.TOMATO
				
		});
		GameRegistry.addRecipe(new ItemStack(BetterItems.SALT), new Object[] {
				" C ",
				'C', Items.WATER_BUCKET, 
				
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void smelting()
	{
		GameRegistry.addSmelting(BetterBlocks.COPPER_ORE, new ItemStack(BetterItems.COPPER_INGOT), 2);
		GameRegistry.addSmelting(Items.IRON_INGOT, new ItemStack(BetterItems.STEEL_INGOT), 3);
	}
	
}
