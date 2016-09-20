package jordan.bettercraft.proxy;

import jordan.bettercraft.init.Gui.AltarContainer;
import jordan.bettercraft.init.Gui.AltarGUI;
import jordan.bettercraft.init.tileentitys.blocks.AltarBlockInventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GUIProxy implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity te = world.getTileEntity(pos);
        if (te instanceof AltarBlockInventory) {
            return new AltarContainer(player.inventory, (AltarBlockInventory) te);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity te = world.getTileEntity(pos);
        if (te instanceof AltarBlockInventory) {
        	AltarBlockInventory containerTileEntity = (AltarBlockInventory) te;
            return new AltarGUI(containerTileEntity, new AltarContainer(player.inventory, containerTileEntity));
        }
        return null;
    }
}
