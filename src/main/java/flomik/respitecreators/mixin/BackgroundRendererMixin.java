package flomik.respitecreators.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import flomik.respitecreators.init.ModFluidsRegister;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.client.renderer.FogRenderer.FogMode;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.level.material.FluidState;

@Mixin(FogRenderer.class)
public abstract class BackgroundRendererMixin {
    @Shadow
    private static float fogRed;

    @Shadow
    private static float fogGreen;

    @Shadow
    private static float fogBlue;

    @ModifyArgs(method = "setupColor", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;clearColor(FFFF)V", remap = false))
    private static void respitecreators$modifyFogColors(Args args, Camera camera, float partialTicks, ClientLevel level, int renderDistanceChunks, float bossColorModifier) {
        FluidState state = level.getFluidState(camera.getBlockPosition());
        if (ModFluidsRegister.isCoffee(state)) {
            fogRed = (float) 78 / 255;
            fogGreen = (float) 46 / 255;
            fogBlue = (float) 29 / 255;
        }
        if (ModFluidsRegister.isPurulentTea(state)) {
            fogRed = (float) 166 / 255;
            fogGreen = (float) 37 / 255;
            fogBlue = (float) 48 / 255;
        }
        if (ModFluidsRegister.isDandelionTea(state)) {
            fogRed = (float) 230 / 255;
            fogGreen = (float) 205 / 255;
            fogBlue = (float) 108 / 255;
        }
        if (ModFluidsRegister.isRoseHipTea(state)) {
            fogRed = (float) 134 / 255;
            fogGreen = (float) 32 / 255;
            fogBlue = (float) 14 / 255;
        }
        if (ModFluidsRegister.isBlackTea(state)) {
            fogRed = (float) 78 / 255;
            fogGreen = (float) 46 / 255;
            fogBlue = (float) 29 / 255;
        }
        if (ModFluidsRegister.isGreenTea(state)) {
            fogRed = (float) 161 / 255;
            fogGreen = (float) 168 / 255;
            fogBlue = (float) 60 / 255;
        }
        if (ModFluidsRegister.isYellowTea(state)) {
            fogRed = (float) 171 / 255;
            fogGreen = (float) 133 / 255;
            fogBlue = (float) 66 / 255;
        }
        if (ModFluidsRegister.isLongCoffee(state)) {
            fogRed = (float) 78 / 255;
            fogGreen = (float) 46 / 255;
            fogBlue = (float) 29 / 255;
        }
        if (ModFluidsRegister.isLongDandelionTea(state)) {
            fogRed = (float) 230 / 255;
            fogGreen = (float) 205 / 255;
            fogBlue = (float) 108 / 255;
        }
        if (ModFluidsRegister.isLongBlackTea(state)) {
            fogRed = (float) 78 / 255;
            fogGreen = (float) 46 / 255;
            fogBlue = (float) 29 / 255;
        }
        if (ModFluidsRegister.isLongGreenTea(state)) {
            fogRed = (float) 161 / 255;
            fogGreen = (float) 168 / 255;
            fogBlue = (float) 60 / 255;
        }
        if (ModFluidsRegister.isLongYellowTea(state)) {
            fogRed = (float) 171 / 255;
            fogGreen = (float) 133 / 255;
            fogBlue = (float) 66 / 255;
        }
        if (ModFluidsRegister.isStrongCoffee(state)) {
            fogRed = (float) 78 / 255;
            fogGreen = (float) 46 / 255;
            fogBlue = (float) 29 / 255;
        }
        if (ModFluidsRegister.isStrongPurulentTea(state)) {
            fogRed = (float) 166 / 255;
            fogGreen = (float) 37 / 255;
            fogBlue = (float) 48 / 255;
        }
        if (ModFluidsRegister.isStrongRoseHipTea(state)) {
            fogRed = (float) 134 / 255;
            fogGreen = (float) 32 / 255;
            fogBlue = (float) 14 / 255;
        }
        if (ModFluidsRegister.isStrongBlackTea(state)) {
            fogRed = (float) 78 / 255;
            fogGreen = (float) 46 / 255;
            fogBlue = (float) 29 / 255;
        }
        if (ModFluidsRegister.isStrongGreenTea(state)) {
            fogRed = (float) 161 / 255;
            fogGreen = (float) 168 / 255;
            fogBlue = (float) 60 / 255;
        }
        if (ModFluidsRegister.isStrongYellowTea(state)) {
            fogRed = (float) 171 / 255;
            fogGreen = (float) 133 / 255;
            fogBlue = (float) 66 / 255;
        }
        if (ModFluidsRegister.isRoseHipJam(state)) {
            fogRed = (float) 134 / 255;
            fogGreen = (float) 32 / 255;
            fogBlue = (float) 14 / 255;
        }
        if (ModFluidsRegister.isBlazingChili(state)) {
            fogRed = (float) 135 / 255;
            fogGreen = (float) 36 / 255;
            fogBlue = (float) 35 / 255;
        }
        if (ModFluidsRegister.isTeaCurry(state)) {
            fogRed = (float) 126 / 255;
            fogGreen = (float) 84 / 255;
            fogBlue = (float) 45 / 255;
        }
    }

    @Inject(method = "setupFog", at = @At("HEAD"), cancellable = true)
    private static void respitecreators$applyFog(Camera camera, FogMode fogMode, float viewDistance, boolean thickFog, float tickDelta, CallbackInfo ci) {
        assert Minecraft.getInstance().level != null;
        FluidState state = Minecraft.getInstance().level.getFluidState(camera.getBlockPosition());
        if (ModFluidsRegister.isTeaCurry(state)) {
            RenderSystem.setShaderFogStart(-8);
            RenderSystem.setShaderFogEnd(5);
            ci.cancel();
        }
        if (ModFluidsRegister.isBlazingChili(state)) {
            RenderSystem.setShaderFogStart(-8);
            RenderSystem.setShaderFogEnd(5);
            ci.cancel();
        }
    }
}
