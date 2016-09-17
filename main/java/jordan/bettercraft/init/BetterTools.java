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
		RUBY_PICKAXE = new BetterItemPickaxe(BetterToolMaterials.RUBY, "ruby_pickaxe");
		SAPPHIRE_PICKAXE = new BetterItemPickaxe(BetterToolMaterials.SAPPHIRE, "sapphire_pickaxe");
		EMERALD_PICKAXE = new BetterItemPickaxe(BetterToolMaterials.EMERALD, "emerald_pickaxe");
		COPPER_PICKAXE = new BetterItemPickaxe(BetterToolMaterials.COPPER, "copper_pickaxe");
		
		//Axes
		RUBY_AXE = new BetterItemAxe(BetterToolMaterials.RUBY, "ruby_axe");
		SAPPHIRE_AXE = new BetterItemAxe(BetterToolMaterials.SAPPHIRE, "sapphire_axe");
		EMERALD_AXE = new BetterItemAxe(BetterToolMaterials.EMERALD, "emerald_axe");
		COPPER_AXE = new BetterItemAxe(BetterToolMaterials.COPPER, "copper_axe");
		
		//Shovels
		RUBY_SHOVEL = new BetterItemShovel(BetterToolMaterials.RUBY, "ruby_shovel");
		SAPPHIRE_SHOVEL = new BetterItemShovel(BetterToolMaterials.SAPPHIRE, "sapphire_shovel");
		EMERALD_SHOVEL = new BetterItemShovel(BetterToolMaterials.EMERALD, "emerald_shovel");
		COPPER_SHOVEL = new BetterItemShovel(BetterToolMaterials.COPPER, "copper_shovel");
		
		//Paxels
		WOODEN_PAXEL = new BetterItemPaxel(ToolMaterial.WOOD, "wooden_paxel");
		STONE_PAXEL = new BetterItemPaxel(ToolMaterial.STONE, "stone_paxel");
		IRON_PAXEL = new BetterItemPaxel(ToolMaterial.IRON, "iron_paxel");
		GOLDEN_PAXEL = new BetterItemPaxel(ToolMaterial.GOLD, "golden_paxel");
		DIAMOND_PAXEL = new BetterItemPaxel(ToolMaterial.DIAMOND, "diamond_paxel");
		
	}
	
	public static void register()
	{
		//Picks
		registerItem(RUBY_PICKAXE);
		registerItem(SAPPHIRE_PICKAXE);
		registerItem(EMERALD_PICKAXE);
		registerItem(COPPER_PICKAXE);
		
		//Axes
		registerItem(RUBY_AXE);
		registerItem(SAPPHIRE_AXE);
		registerItem(EMERALD_AXE);
		registerItem(COPPER_AXE);
		
		//Shovels
		registerItem(RUBY_SHOVEL);
		registerItem(SAPPHIRE_SHOVEL);
		registerItem(EMERALD_SHOVEL);
		registerItem(COPPER_SHOVEL);
		
		//Paxels
		registerItem(WOODEN_PAXEL);
		registerItem(STONE_PAXEL);
		registerItem(IRON_PAXEL);
		registerItem(GOLDEN_PAXEL);
		registerItem(DIAMOND_PAXEL);
		
	}
	
	public static void registerItem(Item item)
	{
		GameRegistry.register(item);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
