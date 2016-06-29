package jordan.bettercraft.init;

import jordan.bettercraft.init.blocks.crops.StrawberryPlant;
import jordan.bettercraft.main.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BetterFoods 
{
	public static Item STRAWBERRY;
	public static Item SWEET_CORN_RAW;
	public static Item BACON;
	public static Item BLT;
	public static Item LETTUCE;
	public static Item TOMATO;
	public static void init()
	{
		STRAWBERRY = registerItem(new ItemFood(2, 3.0F, false), "strawberry").setUnlocalizedName("strawberry").setCreativeTab(BetterTabs.tabBetterFood);
		SWEET_CORN_RAW = registerItem(new ItemFood(1, 1.0F, false), "sweet_corn_raw").setUnlocalizedName("sweet_corn_raw").setCreativeTab(BetterTabs.tabBetterFood);
		BACON = registerItem(new ItemFood(1, 1.0f, false), "bacon").setUnlocalizedName("bacon").setCreativeTab(BetterTabs.tabBetterFood);
		BLT = registerItem(new ItemFood(8, 4f, false), "BLT").setUnlocalizedName("BLT").setCreativeTab(BetterTabs.tabBetterFood);
		LETTUCE = registerItem(new ItemFood(1, 1.0F, false), "lettuce").setUnlocalizedName("lettuce").setCreativeTab(BetterTabs.tabBetterFood);
		TOMATO = registerItem(new ItemFood(1, 1.0F, false), "tomato").setUnlocalizedName("tomato").setCreativeTab(BetterTabs.tabBetterFood);
	
	
	}
	public static void registerRenders()
	{
		registerRender(STRAWBERRY);
		registerRender(SWEET_CORN_RAW);
		registerRender(BACON);
		registerRender(BLT);
		registerRender(LETTUCE);
		registerRender(TOMATO);
		
		
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//registerItem Start\\
	public static Item registerItem(Item item, String name)
	{
		return registerItem(item, name, null);
	}
	
	public static Item registerItem(Item item, String name, CreativeTabs tab)
	{
		GameRegistry.register(item, new ResourceLocation(Reference.MODID, name));
		return item;
	}
	//registerItem End\\
}
