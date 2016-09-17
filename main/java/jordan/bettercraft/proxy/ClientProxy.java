package jordan.bettercraft.proxy;

import jordan.bettercraft.init.BetterArmor;
import jordan.bettercraft.init.BetterBlocks;
import jordan.bettercraft.init.BetterCrops;
import jordan.bettercraft.init.BetterFoods;
import jordan.bettercraft.init.BetterItems;
import jordan.bettercraft.init.BetterRecipes;
import jordan.bettercraft.init.BetterSeeds;
import jordan.bettercraft.init.BetterTools;
import jordan.bettercraft.init.BetterWeapons;
import jordan.bettercraft.init.MobDropsHandler;
import jordan.bettercraft.init.blocks.entitys.EntitySittableBlock;
import jordan.bettercraft.init.mobs.MobRegistry;
import jordan.bettercraft.init.worldgen.BetterWorldGen;
import jordan.bettercraft.main.Bettercraft;
import jordan.bettercraft.main.Reference;
import net.minecraftforge.client.model.b3d.B3DLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);	
		OBJLoader.INSTANCE.addDomain(Reference.MODID);
		B3DLoader.INSTANCE.addDomain(Reference.MODID);
	
	}
	
	@Override
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
		BetterItems.register();
		BetterBlocks.registerRenders();
		BetterTools.register();
		BetterWeapons.registerRenders();
		BetterCrops.registerRenders();
		BetterSeeds.registerRenders();
		BetterFoods.registerRenders();
		BetterArmor.registerRenders();
		
		BetterRecipes.register();
		
		MobRegistry.register();
	
		EntityRegistry.registerModEntity(EntitySittableBlock.class, "mountable_block", 500, Bettercraft.instance, 80, 1, false);
		
		GameRegistry.registerWorldGenerator(new BetterWorldGen(), 0);
		
		MinecraftForge.EVENT_BUS.register(new MobDropsHandler());
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event)
	{
		super.postInit(event);
	}
	
	
}
