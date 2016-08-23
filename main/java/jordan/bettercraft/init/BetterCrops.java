package jordan.bettercraft.init;

import jordan.bettercraft.init.blocks.crops.LettucePlant;
import jordan.bettercraft.init.blocks.crops.StrawberryPlant;
import jordan.bettercraft.init.blocks.crops.SweetcornPlant;
import jordan.bettercraft.init.blocks.crops.TomatoPlant;
import jordan.bettercraft.init.blocks.ores.CopperOre;
import jordan.bettercraft.init.blocks.ores.RubyOre;
import jordan.bettercraft.init.blocks.ores.SapphireOre;
import jordan.bettercraft.main.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BetterCrops 
{
	public static Block STRAWBERRY_PLANT;
	public static Block SWEET_CORN_PLANT;
	public static Block LETTUCE_PLANT;
	public static Block TOMATO_PLANT;
	
	public static void init()
	{
		STRAWBERRY_PLANT = new StrawberryPlant();
		
		SWEET_CORN_PLANT = new SweetcornPlant();
		
		LETTUCE_PLANT = new LettucePlant();
		
		TOMATO_PLANT = new TomatoPlant();
	}
	
	public static void register()
	{
		registerBlock(STRAWBERRY_PLANT);
		registerBlock(SWEET_CORN_PLANT);
		registerBlock(LETTUCE_PLANT);
		registerBlock(TOMATO_PLANT);
	}
	
	public static void registerBlock(Block block)
	{
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders()
	{
		registerRender(STRAWBERRY_PLANT);
		registerRender(SWEET_CORN_PLANT);
		registerRender(LETTUCE_PLANT);
		registerRender(TOMATO_PLANT);
	}
	
	public static void registerRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getUnlocalizedName(), "inventory"));
	}
}
