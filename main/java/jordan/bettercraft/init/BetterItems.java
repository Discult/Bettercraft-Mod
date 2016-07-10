package jordan.bettercraft.init;

import com.sun.xml.internal.ws.assembler.dev.ServerTubelineAssemblyContext;

import jordan.bettercraft.init.items.misc.ItemFlyingRing;
import jordan.bettercraft.init.items.potionitems.ItemJump;
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
	//Materials
	public static Item RUBY;
	public static Item SAPPHIRE;
	public static Item COPPER_INGOT;
	public static Item DRAGON_SCALE;
	public static Item STEEL_INGOT;
	public static Item SALT;
	public static Item ALUMINUM_INGOT;

	
	//Miscellaneous
	public static Item SWIFT_ITEM;
	public static Item JUMP_ITEM;
	public static Item CATALYST;
	public static Item FLYING_RING;
	public static Item RING;
	
	public static void init()
	{
		//Materials
		RUBY = registerItem(new Item(), "ruby").setUnlocalizedName("ruby").setCreativeTab(BetterTabs.tabBetterMaterials);
		SAPPHIRE = registerItem(new Item(), "sapphire").setUnlocalizedName("sapphire").setCreativeTab(BetterTabs.tabBetterMaterials);
		COPPER_INGOT = registerItem(new Item(), "copper_ingot").setUnlocalizedName("copper_ingot").setCreativeTab(BetterTabs.tabBetterMaterials);
		DRAGON_SCALE = registerItem(new Item(), "dragon_scale").setUnlocalizedName("dragon_scale").setCreativeTab(BetterTabs.tabBetterMaterials);
		STEEL_INGOT = registerItem(new Item(), "steel_ingot").setUnlocalizedName("steel_ingot").setCreativeTab(BetterTabs.tabBetterMaterials);
		SALT = registerItem(new Item(), "salt").setUnlocalizedName("salt").setCreativeTab(BetterTabs.tabBetterMaterials);
		ALUMINUM_INGOT = registerItem(new Item(), "aluminum_ingot").setUnlocalizedName("aluminum_ingot").setCreativeTab(BetterTabs.tabBetterMaterials);
		
		//Miscellaneous
		SWIFT_ITEM = registerItem(new ItemSwift(), "swift_item").setUnlocalizedName("swift_item").setCreativeTab(BetterTabs.tabBetterMiscellaneous);
		JUMP_ITEM = registerItem(new ItemJump(), "jump_item").setUnlocalizedName("jump_item").setCreativeTab(BetterTabs.tabBetterMiscellaneous);
		CATALYST = registerItem(new Item(), "catalyst").setUnlocalizedName("catalyst").setCreativeTab(BetterTabs.tabBetterMiscellaneous);
		FLYING_RING = registerItem(new ItemFlyingRing(), "flying_ring").setUnlocalizedName("flying_ring").setCreativeTab(BetterTabs.tabBetterMiscellaneous);
		RING = registerItem(new Item(), "ring").setUnlocalizedName("ring").setCreativeTab(BetterTabs.tabBetterMiscellaneous);
	
		
	}
	public static void registerRenders()
	{
		//Materials
		registerRender(RUBY);
		registerRender(SAPPHIRE);
		registerRender(COPPER_INGOT);
		registerRender(DRAGON_SCALE);
		registerRender(STEEL_INGOT);
		registerRender(SALT);
		registerRender(ALUMINUM_INGOT);
		
		//Miscellaneous
		registerRender(SWIFT_ITEM);
		registerRender(JUMP_ITEM);
		registerRender(CATALYST);
		registerRender(FLYING_RING);
		registerRender(RING);
	
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
