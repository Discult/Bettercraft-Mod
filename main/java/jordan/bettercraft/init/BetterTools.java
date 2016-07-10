package jordan.bettercraft.init;


import jordan.bettercraft.init.items.tools.BetterItemAxe;
import jordan.bettercraft.init.items.tools.BetterItemPaxel;
import jordan.bettercraft.init.items.tools.BetterItemPickaxe;
import jordan.bettercraft.init.items.tools.BetterItemShovel;
import jordan.bettercraft.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BetterTools 
{
	//Picks
	public static Item RUBY_PICKAXE;
	public static Item SAPPHIRE_PICKAXE;
	public static Item EMERALD_PICKAXE;
	public static Item COPPER_PICKAXE;
	
	//Axes
	public static Item RUBY_AXE;
	public static Item SAPPHIRE_AXE;
	public static Item EMERALD_AXE;
	public static Item COPPER_AXE;
	
	//Shovels
	public static Item RUBY_SHOVEL;
	public static Item SAPPHIRE_SHOVEL;
	public static Item EMERALD_SHOVEL;
	public static Item COPPER_SHOVEL;
	
	//Paxels
	public static Item WOODEN_PAXEL;
	public static Item STONE_PAXEL;
	public static Item IRON_PAXEL;
	public static Item GOLDEN_PAXEL;
	public static Item DIAMOND_PAXEL;
	
	
	public static void init()
	{
		//Picks
		RUBY_PICKAXE = registerItem(new BetterItemPickaxe(BetterToolMaterials.RUBY), "ruby_pickaxe").setUnlocalizedName("ruby_pickaxe");
		SAPPHIRE_PICKAXE = registerItem(new BetterItemPickaxe(BetterToolMaterials.SAPPHIRE), "sapphire_pickaxe").setUnlocalizedName("sapphire_pickaxe");
		EMERALD_PICKAXE = registerItem(new BetterItemPickaxe(BetterToolMaterials.EMERALD), "emerald_pickaxe").setUnlocalizedName("emerald_pickaxe");
		COPPER_PICKAXE = registerItem(new BetterItemPickaxe(BetterToolMaterials.COPPER), "copper_pickaxe").setUnlocalizedName("copper_pickaxe");
		
		//Axes
		RUBY_AXE = registerItem(new BetterItemAxe(BetterToolMaterials.RUBY), "ruby_axe").setUnlocalizedName("ruby_axe");
		SAPPHIRE_AXE = registerItem(new BetterItemAxe(BetterToolMaterials.SAPPHIRE), "sapphire_axe").setUnlocalizedName("sapphire_axe");
		EMERALD_AXE = registerItem(new BetterItemAxe(BetterToolMaterials.EMERALD), "emerald_axe").setUnlocalizedName("emerald_axe");
		COPPER_AXE = registerItem(new BetterItemAxe(BetterToolMaterials.COPPER), "copper_axe").setUnlocalizedName("copper_axe");
		
		//Shovels
		RUBY_SHOVEL = registerItem(new BetterItemShovel(BetterToolMaterials.RUBY), "ruby_shovel").setUnlocalizedName("ruby_shovel");
		SAPPHIRE_SHOVEL = registerItem(new BetterItemShovel(BetterToolMaterials.SAPPHIRE), "sapphire_shovel").setUnlocalizedName("sapphire_shovel");
		EMERALD_SHOVEL = registerItem(new BetterItemShovel(BetterToolMaterials.EMERALD), "emerald_shovel").setUnlocalizedName("emerald_shovel");
		COPPER_SHOVEL = registerItem(new BetterItemShovel(BetterToolMaterials.COPPER), "copper_shovel").setUnlocalizedName("copper_shovel");
		
		//Paxels
		WOODEN_PAXEL = registerItem(new BetterItemPaxel(ToolMaterial.WOOD), "wooden_paxel").setUnlocalizedName("wooden_paxel");
		STONE_PAXEL = registerItem(new BetterItemPaxel(ToolMaterial.STONE), "stone_paxel").setUnlocalizedName("stone_paxel");
		IRON_PAXEL = registerItem(new BetterItemPaxel(ToolMaterial.IRON), "iron_paxel").setUnlocalizedName("iron_paxel");
		GOLDEN_PAXEL = registerItem(new BetterItemPaxel(ToolMaterial.GOLD), "golden_paxel").setUnlocalizedName("golden_paxel");
		DIAMOND_PAXEL = registerItem(new BetterItemPaxel(ToolMaterial.DIAMOND), "diamond_paxel").setUnlocalizedName("diamond_paxel");
		
	}
	
	public static void registerRenders()
	{
		//Picks
		registerRender(RUBY_PICKAXE);
		registerRender(SAPPHIRE_PICKAXE);
		registerRender(EMERALD_PICKAXE);
		registerRender(COPPER_PICKAXE);
		
		//Axes
		registerRender(RUBY_AXE);
		registerRender(SAPPHIRE_AXE);
		registerRender(EMERALD_AXE);
		registerRender(COPPER_AXE);
		
		//Shovels
		registerRender(RUBY_SHOVEL);
		registerRender(SAPPHIRE_SHOVEL);
		registerRender(EMERALD_SHOVEL);
		registerRender(COPPER_SHOVEL);
		
		//Paxels
		registerRender(WOODEN_PAXEL);
		registerRender(STONE_PAXEL);
		registerRender(IRON_PAXEL);
		registerRender(GOLDEN_PAXEL);
		registerRender(DIAMOND_PAXEL);
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
