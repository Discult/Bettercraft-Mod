package jordan.bettercraft.main;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import jordan.bettercraft.init.BetterItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Reference {
	public static final String MODID = "bettercraft";
	public static final String NAME = "Bettercraft";
	public static final String VERSION = "1.9.4-R2";

	public static final String CLIENTPROXY = "jordan.bettercraft.proxy.ClientProxy";
	public static final String COMMONPROXY = "jordan.bettercraft.proxy.CommonProxy";
	public static ArrayList<ItemStack> FlightRingR = new ArrayList<ItemStack>();

	
	
	
	
	
	// utils
	public static void InitAltarArray() {
		FlightRingR.add(new ItemStack(Items.NETHER_STAR));
		FlightRingR.add(new ItemStack(BetterItems.RING));
	}

	public static BlockPos getRayTrace(World world, EntityPlayer player, int reachDistance) {
		double x = player.posX;
		double y = player.posY + player.getEyeHeight();
		double z = player.posZ;
		for (int i = 0; i < reachDistance * 10.0; i++) {
			x += player.getLookVec().xCoord * 0.1;
			y += player.getLookVec().yCoord * 0.1;
			z += player.getLookVec().zCoord * 0.1;
			if (world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.AIR) {
				return new BlockPos(x, y, z);
			}
		}
		return new BlockPos(x, y, z);
	}

	public static boolean itemListsMatch(List<ItemStack> i1, List<ItemStack> i2) {
		if (!i2.isEmpty()) {
			System.out.println("Worl");
			if (i1.get(0).equals(i2.get(0)) && i1.get(2).equals(i2.get(2))) {
				System.out.println("Worl");
				return true;

			}
		}

		return false;
	}
}
