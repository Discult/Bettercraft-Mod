package jordan.bettercraft.init.mobs.renderers;

import java.util.Map;

import javax.annotation.Nullable;

import jordan.bettercraft.init.mobs.entitys.EntityZebra;
import jordan.bettercraft.init.mobs.models.ModelZebra;
import jordan.bettercraft.main.Reference;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.HorseType;
import net.minecraft.util.ResourceLocation;

public class RenderZebra extends RenderLiving<EntityZebra>
{

	private static final ResourceLocation ZebraTexture = new ResourceLocation(Reference.MODID, "textures/entity/zebra/zebra.png");

    public RenderZebra(RenderManager rendermanagerIn, ModelZebra model, float shadowSizeIn)
    {
        super(rendermanagerIn, model, shadowSizeIn);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityZebra entitylivingbaseIn, float partialTickTime)
    {
        float f = 1.0F;
        HorseType horsearmortype = entitylivingbaseIn.getType();

        GlStateManager.scale(f, f, f);
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */

	@Override
	protected ResourceLocation getEntityTexture(EntityZebra entity) {

		return ZebraTexture;
	}

    
}