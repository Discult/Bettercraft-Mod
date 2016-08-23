package jordan.bettercraft.init;

import jordan.bettercraft.init.items.MaterialItems;
import jordan.bettercraft.init.items.MiscItems;
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
	public static Item RABBIT_RING;
	
	public static void init()
	{
		//Materials
		RUBY = new MaterialItems("ruby");
		SAPPHIRE = new MaterialItems("sapphire");
		COPPER_INGOT = new MaterialItems("copper_ingot");
		DRAGON_SCALE = new MaterialItems("dragon_scale");
		STEEL_INGOT = new MaterialItems("steel_ingot");
		SALT = new MaterialItems("salt");
		ALUMINUM_INGOT = new MaterialItems("aluminum_ingot");
		
		//Miscellaneous
		SWIFT_ITEM = new ItemSwift("swift_item");
		JUMP_ITEM = new ItemJump("jump_item");
		CATALYST = new MiscItems("catalyst");
		FLYING_RING = new ItemFlyingRing("flying_ring");
		RING = new MiscItems("ring");
		
	
		
	}
	

	
	public static void register()
	{
		//Materials
		registerItem(RUBY);
		registerItem(SAPPHIRE);
		registerItem(COPPER_INGOT);
		registerItem(DRAGON_SCALE);
		registerItem(STEEL_INGOT);
		registerItem(SALT);
		registerItem(ALUMINUM_INGOT);
		
		//Miscellaneous
		registerItem(SWIFT_ITEM);
		registerItem(JUMP_ITEM);
		registerItem(CATALYST);
		registerItem(FLYING_RING);
		registerItem(RING);
	
	}
	
	public static void registerItem(Item item)
	{
		GameRegistry.register(item);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}