package jordan.bettercraft.main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Reference 
{
	public static final String MODID = "bettercraft";
	public static final String  NAME = "Bettercraft";
	public static final String VERSION = "1.9.4-R2";
	
	public static final String CLIENTPROXY = "jordan.bettercraft.proxy.ClientProxy";
	public static final String COMMONPROXY = "jordan.bettercraft.proxy.CommonProxy";
	
	
//utils
	public static BlockPos getRayTrace(World world, EntityPlayer player, int reachDistance){
		double x = player.posX;
		double y = player.posY + player.getEyeHeight();
		double z = player.posZ;
		for (int i = 0; i < reachDistance*10.0; i ++){
			x += player.getLookVec().xCoord*0.1;
			y += player.getLookVec().yCoord*0.1;
			z += player.getLookVec().zCoord*0.1;
			if (world.getBlockState(new BlockPos(x,y,z)).getBlock() != Blocks.AIR){
				return new BlockPos(x,y,z);
			}
		}
		return new BlockPos(x,y,z);
	}
	
	
	
	
	
	
}