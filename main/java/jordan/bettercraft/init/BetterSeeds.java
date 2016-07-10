package jordan.bettercraft.init;

import jordan.bettercraft.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BetterSeeds 
{
	public static Item STRAWBERRY_SEED;
	public static Item SWEET_CORN_SEED;
	public static Item LETTUCE_SEED;
	public static Item TOMATO_SEED;
	
	public static void init()
	{
		STRAWBERRY_SEED = registerItem(new ItemSeeds(BetterCrops.STRAWBERRY_PLANT, Blocks.FARMLAND), "strawberry_seed").setUnlocalizedName("strawberry_seed").setCreativeTab(BetterTabs.tabBetterMaterials);
		SWEET_CORN_SEED = registerItem(new ItemSeeds(BetterCrops.SWEET_CORN_PLANT, Blocks.FARMLAND), "sweet_corn_seed").setUnlocalizedName("sweet_corn_seed").setCreativeTab(BetterTabs.tabBetterMaterials);
		LETTUCE_SEED = registerItem(new ItemSeeds(BetterCrops.LETTUCE_PLANT, Blocks.FARMLAND), "lettuce_seed").setUnlocalizedName("lettuce_seed").setCreativeTab(BetterTabs.tabBetterMaterials);
		TOMATO_SEED = registerItem(new ItemSeeds(BetterCrops.TOMATO_PLANT, Blocks.FARMLAND), "tomato_seed").setUnlocalizedName("tomato_seed").setCreativeTab(BetterTabs.tabBetterMaterials);
	}
	public static void registerRenders()
	{
		registerRender(STRAWBERRY_SEED);
		registerRender(SWEET_CORN_SEED);
		registerRender(LETTUCE_SEED);
		registerRender(TOMATO_SEED);
		
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
