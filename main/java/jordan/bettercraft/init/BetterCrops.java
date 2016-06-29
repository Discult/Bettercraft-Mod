package jordan.bettercraft.init;

import jordan.bettercraft.init.blocks.CustomBlock;
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

public class BetterCrops 
{
	public static Block STRAWBERRY_PLANT;
	public static Block SWEET_CORN_PLANT;
	public static Block LETTUCE_PLANT;
	public static Block TOMATO_PLANT;
	public static void init()
	{
		STRAWBERRY_PLANT = new StrawberryPlant();
		STRAWBERRY_PLANT.setUnlocalizedName("strawberry_plant");
		
		SWEET_CORN_PLANT = new SweetcornPlant();
		SWEET_CORN_PLANT.setUnlocalizedName("sweet_corn_plant");
		
		LETTUCE_PLANT = new LettucePlant();
		LETTUCE_PLANT.setUnlocalizedName("lettuce_plant");
		
		TOMATO_PLANT = new TomatoPlant();
		TOMATO_PLANT.setUnlocalizedName("strawberry_plant");
	}
	
	
	public static void registerRenders()
	{
		registerRender(STRAWBERRY_PLANT);
		registerRender(SWEET_CORN_PLANT);
	}
	
	public static void registerRender(Block block)
	{
		
		Item item = Item.getItemFromBlock(block);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

	}
}
