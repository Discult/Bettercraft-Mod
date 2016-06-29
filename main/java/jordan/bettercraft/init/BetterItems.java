package jordan.bettercraft.init;

import jordan.bettercraft.init.items.potionitems.ItemSwift;
import jordan.bettercraft.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BetterItems 
{
	public static Item RUBY;
	public static Item SAPPHIRE;
	public static Item COPPER_INGOT;
	public static Item DRAGON_SCALE;
	public static Item STEEL_INGOT;
	public static Item SWIFT_ITEM;
	
	public static void init()
	{
		RUBY = registerItem(new Item(), "ruby").setUnlocalizedName("ruby").setCreativeTab(BetterTabs.tabBetterMaterials);
		SAPPHIRE = registerItem(new Item(), "sapphire").setUnlocalizedName("sapphire").setCreativeTab(BetterTabs.tabBetterMaterials);
		COPPER_INGOT = registerItem(new Item(), "copper_ingot").setUnlocalizedName("copper_ingot").setCreativeTab(BetterTabs.tabBetterMaterials);
		DRAGON_SCALE = registerItem(new Item(), "dragon_scale").setUnlocalizedName("dragon_scale").setCreativeTab(BetterTabs.tabBetterMaterials);
		STEEL_INGOT = registerItem(new Item(), "steel_ingot").setUnlocalizedName("steel_ingot").setCreativeTab(BetterTabs.tabBetterMaterials);
		SWIFT_ITEM = registerItem(new ItemSwift(), "swift_item").setUnlocalizedName("swift_item").setCreativeTab(BetterTabs.tabBetterMiscellaneous);
	}
	public static void registerRenders()
	{
		registerRender(RUBY);
		registerRender(SAPPHIRE);
		registerRender(COPPER_INGOT);
		registerRender(DRAGON_SCALE);
		registerRender(STEEL_INGOT);
		registerRender(SWIFT_ITEM);
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
