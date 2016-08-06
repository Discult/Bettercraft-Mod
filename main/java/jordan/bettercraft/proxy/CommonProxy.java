package jordan.bettercraft.proxy;

import jordan.bettercraft.init.BetterArmor;
import jordan.bettercraft.init.BetterBlocks;
import jordan.bettercraft.init.BetterCrops;
import jordan.bettercraft.init.BetterFoods;
import jordan.bettercraft.init.BetterItems;
import jordan.bettercraft.init.BetterRecipes;
import jordan.bettercraft.init.BetterSeeds;
import jordan.bettercraft.init.BetterSoundEvents;
import jordan.bettercraft.init.BetterTools;
import jordan.bettercraft.init.BetterWeapons;
import jordan.bettercraft.init.BetterEvents;
import jordan.bettercraft.init.MobDropsHandler;
import jordan.bettercraft.init.TileEntitys;
import jordan.bettercraft.init.mobs.MobRegistry;
import jordan.bettercraft.init.worldgen.BetterWorldGen;
import jordan.bettercraft.main.Reference;
import net.minecraft.item.Item;
import net.minecraft.world.gen.structure.StructureStrongholdPieces.ChestCorridor;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent event)
	{
		//Item type stuff
		BetterItems.init();
		BetterSeeds.init();
		BetterFoods.init();
		BetterArmor.init();
		BetterTools.init();
		BetterWeapons.init();
		TileEntitys.init();
		Reference.InitAltarArray();
		//Block type stuff
		BetterBlocks.init();
		BetterBlocks.register();
		
		BetterCrops.init();
		BetterCrops.register();

		BetterSoundEvents.registerSounds();
		MinecraftForge.EVENT_BUS.register(new BetterEvents());
		MinecraftForge.EVENT_BUS.register((Object)new MobDropsHandler());
		
		
		
	}
	
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
