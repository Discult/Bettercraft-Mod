package jordan.bettercraft.init;

import jordan.bettercraft.init.tileentitys.blocks.AltarTileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntitys {

	
	public static void init(){
		GameRegistry.registerTileEntity(AltarTileEntity.class, "Crafting Altar");
	}
	
	
}
