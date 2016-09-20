package jordan.bettercraft.init.blocks.furnaces;

import jordan.bettercraft.init.BetterTabs;
import jordan.bettercraft.init.tileentitys.blocks.AltarBlockInventory;
import jordan.bettercraft.main.Bettercraft;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AltarBlock extends Block implements ITileEntityProvider {

    public static final int GUI_ID = 1;

    public AltarBlock(String name) {
    	
    		super(Material.ROCK);
    		setRegistryName(name);
    		setUnlocalizedName(name);
    		this.setCreativeTab(BetterTabs.tabBetterDecorationBlocks);
    	}
    	

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new AltarBlockInventory();
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, ItemStack heldItem, EnumFacing side,
                float hitX, float hitY, float hitZ) {
        // Only execute on the server
        if (world.isRemote) {
            return true;
        }
        TileEntity te = world.getTileEntity(pos);
        if (!(te instanceof AltarBlockInventory)) {
            return false;
        }
        player.openGui(Bettercraft.instance, GUI_ID, world, pos.getX(), pos.getY(), pos.getZ());
        return true;
    }
}