package jordan.bettercraft.init;

import jordan.bettercraft.init.items.weapons.BetterSwords;
import jordan.bettercraft.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BetterWeapons 
{
	public static Item RUBY_SWORD;
	public static Item SAPPHIRE_SWORD;
	public static Item EMERALD_SWORD;
	public static Item COPPER_SWORD;
	
	public static void init()
	{
		RUBY_SWORD = registerItem(new BetterSwords(BetterToolMaterials.RUBY), "ruby_sword").setUnlocalizedName("ruby_sword");
		SAPPHIRE_SWORD = registerItem(new BetterSwords(BetterToolMaterials.SAPPHIRE), "sapphire_sword").setUnlocalizedName("sapphire_sword");
		EMERALD_SWORD = registerItem(new BetterSwords(BetterToolMaterials.EMERALD), "emerald_sword").setUnlocalizedName("emerald_sword");
		COPPER_SWORD = registerItem(new BetterSwords(BetterToolMaterials.COPPER), "copper_sword").setUnlocalizedName("copper_sword");
	}
	public static void registerRenders()
	{
		registerRender(RUBY_SWORD);
		registerRender(SAPPHIRE_SWORD);
		registerRender(EMERALD_SWORD);
		registerRender(COPPER_SWORD);
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
