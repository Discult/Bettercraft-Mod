package jordan.bettercraft.init;

import jordan.bettercraft.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BetterArmor 
{
	
	public static Item STEEL_HELMET;
	public static Item STEEL_CHESTPLATE;
	public static Item STEEL_LEGGINGS;
	public static Item STEEL_BOOTS;
	
	public static void init()
	{
		STEEL_HELMET = registerItem(new ItemArmor(BetterArmorMaterial.STEEL, 1, EntityEquipmentSlot.HEAD), "steel_helmet").setUnlocalizedName("steel_helmet").setCreativeTab(BetterTabs.tabBetterCombat);
		STEEL_CHESTPLATE = registerItem(new ItemArmor(BetterArmorMaterial.STEEL, 1, EntityEquipmentSlot.CHEST), "steel_chestplate").setUnlocalizedName("steel_chestplate").setCreativeTab(BetterTabs.tabBetterCombat);
		STEEL_LEGGINGS = registerItem(new ItemArmor(BetterArmorMaterial.STEEL, 2, EntityEquipmentSlot.LEGS), "steel_leggings").setUnlocalizedName("steel_leggings").setCreativeTab(BetterTabs.tabBetterCombat);
		STEEL_BOOTS = registerItem(new ItemArmor(BetterArmorMaterial.STEEL, 1, EntityEquipmentSlot.FEET), "steel_boots").setUnlocalizedName("steel_boots").setCreativeTab(BetterTabs.tabBetterCombat);
	}
	public static void registerRenders()
	{	
		//steel
		registerRender(STEEL_HELMET);
		registerRender(STEEL_CHESTPLATE);
		registerRender(STEEL_LEGGINGS);
		registerRender(STEEL_BOOTS);
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
