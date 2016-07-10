package jordan.bettercraft.init;

import jordan.bettercraft.init.blocks.Altar;
import jordan.bettercraft.init.blocks.ores.Bauxite;
import jordan.bettercraft.init.blocks.ores.CopperOre;
import jordan.bettercraft.init.blocks.ores.RubyOre;
import jordan.bettercraft.init.blocks.ores.SapphireOre;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BetterBlocks 
{
	//Ores
	public static Block RUBY_ORE;
	public static Block SAPPHIRE_ORE;
	public static Block COPPER_ORE;
	public static Block ALLUMINUM_ORE;
	//Normal Blocks
		
		
	//Stairs
		
	//Other
	public static Block ALTAR;
	
	public static void init()
	{
		//Ores
		RUBY_ORE = new RubyOre();
		SAPPHIRE_ORE = new SapphireOre();
		COPPER_ORE = new CopperOre();
		ALLUMINUM_ORE = new Bauxite();
		
		//NormalBlocks
		
		//Stairs
		
		//Other
		ALTAR = new Altar();
	}
	
	public static void register()
	{
		//Ores
		registerBlock(RUBY_ORE);
		registerBlock(SAPPHIRE_ORE);
		registerBlock(COPPER_ORE);
		registerBlock(ALLUMINUM_ORE);
		
		//Normal Blocks
		
		//Stairs
		
		//Other
		registerBlock(ALTAR);
	}
	
	private static void registerBlock(Block block)
	{
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders()
	{
		//Ores
		registerRender(RUBY_ORE);
		registerRender(SAPPHIRE_ORE);
		registerRender(COPPER_ORE);
		registerRender(ALLUMINUM_ORE);
		
		//Normal Blocks
		
		//Stairs
		
		//Other
		registerRender(ALTAR);
	}
	
	public static void registerRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
}