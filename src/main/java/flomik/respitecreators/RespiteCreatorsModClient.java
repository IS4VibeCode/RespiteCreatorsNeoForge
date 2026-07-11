package flomik.respitecreators;

import flomik.respitecreators.init.ModFluidTypesRegister;
import flomik.respitecreators.init.ModFluidsRegister;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;

@EventBusSubscriber(modid = RespiteCreatorsMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RespiteCreatorsModClient {

    private static final ResourceLocation WATER_STILL = ResourceLocation.withDefaultNamespace("block/water_still");
    private static final ResourceLocation WATER_FLOW = ResourceLocation.withDefaultNamespace("block/water_flow");

    private static IClientFluidTypeExtensions waterLike(int tint) {
        return new IClientFluidTypeExtensions() {
            @Override
            public ResourceLocation getStillTexture() {
                return WATER_STILL;
            }

            @Override
            public ResourceLocation getFlowingTexture() {
                return WATER_FLOW;
            }

            @Override
            public int getTintColor() {
                return 0xFF000000 | tint;
            }
        };
    }

    private static IClientFluidTypeExtensions customTextured(String stillPath, String flowPath) {
        ResourceLocation still = ResourceLocation.fromNamespaceAndPath(RespiteCreatorsMod.MOD_ID, stillPath);
        ResourceLocation flow = ResourceLocation.fromNamespaceAndPath(RespiteCreatorsMod.MOD_ID, flowPath);
        return new IClientFluidTypeExtensions() {
            @Override
            public ResourceLocation getStillTexture() {
                return still;
            }

            @Override
            public ResourceLocation getFlowingTexture() {
                return flow;
            }
        };
    }

    @SubscribeEvent
    public static void onRegisterClientExtensions(RegisterClientExtensionsEvent event) {
        event.registerFluidType(waterLike(0xa62530), ModFluidTypesRegister.PURULENT_TEA_TYPE.get());
        event.registerFluidType(waterLike(0xe6cd6c), ModFluidTypesRegister.DANDELION_TEA_TYPE.get());
        event.registerFluidType(waterLike(0x86200e), ModFluidTypesRegister.ROSE_HIP_TEA_TYPE.get());
        event.registerFluidType(waterLike(0x783e27), ModFluidTypesRegister.BLACK_TEA_TYPE.get());
        event.registerFluidType(waterLike(0xab8542), ModFluidTypesRegister.YELLOW_TEA_TYPE.get());
        event.registerFluidType(waterLike(0xa1a83c), ModFluidTypesRegister.GREEN_TEA_TYPE.get());
        event.registerFluidType(waterLike(0x321f13), ModFluidTypesRegister.COFFEE_TYPE.get());
        event.registerFluidType(waterLike(0xe6cd6c), ModFluidTypesRegister.LONG_DANDELION_TEA_TYPE.get());
        event.registerFluidType(waterLike(0x783e27), ModFluidTypesRegister.LONG_BLACK_TEA_TYPE.get());
        event.registerFluidType(waterLike(0xab8542), ModFluidTypesRegister.LONG_YELLOW_TEA_TYPE.get());
        event.registerFluidType(waterLike(0xa1a83c), ModFluidTypesRegister.LONG_GREEN_TEA_TYPE.get());
        event.registerFluidType(waterLike(0x321f13), ModFluidTypesRegister.LONG_COFFEE_TYPE.get());
        event.registerFluidType(waterLike(0xa62530), ModFluidTypesRegister.STRONG_PURULENT_TEA_TYPE.get());
        event.registerFluidType(waterLike(0x86200e), ModFluidTypesRegister.STRONG_ROSE_HIP_TEA_TYPE.get());
        event.registerFluidType(waterLike(0x783e27), ModFluidTypesRegister.STRONG_BLACK_TEA_TYPE.get());
        event.registerFluidType(waterLike(0xab8542), ModFluidTypesRegister.STRONG_YELLOW_TEA_TYPE.get());
        event.registerFluidType(waterLike(0xa1a83c), ModFluidTypesRegister.STRONG_GREEN_TEA_TYPE.get());
        event.registerFluidType(waterLike(0x321f13), ModFluidTypesRegister.STRONG_COFFEE_TYPE.get());
        event.registerFluidType(customTextured("block/rose_hip_jam_still", "block/rose_hip_jam_flow"), ModFluidTypesRegister.ROSE_HIP_JAM_TYPE.get());
        event.registerFluidType(customTextured("block/blazing_chili_still", "block/blazing_chili_flow"), ModFluidTypesRegister.BLAZING_CHILI_TYPE.get());
        event.registerFluidType(customTextured("block/tea_curry_still", "block/tea_curry_flow"), ModFluidTypesRegister.TEA_CURRY_TYPE.get());
    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        setTranslucent(ModFluidsRegister.STILL_PURULENT_TEA.get(), ModFluidsRegister.FLOWING_PURULENT_TEA.get());
        setTranslucent(ModFluidsRegister.STILL_DANDELION_TEA.get(), ModFluidsRegister.FLOWING_DANDELION_TEA.get());
        setTranslucent(ModFluidsRegister.STILL_ROSE_HIP_TEA.get(), ModFluidsRegister.FLOWING_ROSE_HIP_TEA.get());
        setTranslucent(ModFluidsRegister.STILL_BLACK_TEA.get(), ModFluidsRegister.FLOWING_BLACK_TEA.get());
        setTranslucent(ModFluidsRegister.STILL_YELLOW_TEA.get(), ModFluidsRegister.FLOWING_YELLOW_TEA.get());
        setTranslucent(ModFluidsRegister.STILL_GREEN_TEA.get(), ModFluidsRegister.FLOWING_GREEN_TEA.get());
        setTranslucent(ModFluidsRegister.STILL_COFFEE.get(), ModFluidsRegister.FLOWING_COFFEE.get());
        setTranslucent(ModFluidsRegister.STILL_LONG_DANDELION_TEA.get(), ModFluidsRegister.FLOWING_LONG_DANDELION_TEA.get());
        setTranslucent(ModFluidsRegister.STILL_LONG_BLACK_TEA.get(), ModFluidsRegister.FLOWING_LONG_BLACK_TEA.get());
        setTranslucent(ModFluidsRegister.STILL_LONG_YELLOW_TEA.get(), ModFluidsRegister.FLOWING_LONG_YELLOW_TEA.get());
        setTranslucent(ModFluidsRegister.STILL_LONG_GREEN_TEA.get(), ModFluidsRegister.FLOWING_LONG_GREEN_TEA.get());
        setTranslucent(ModFluidsRegister.STILL_LONG_COFFEE.get(), ModFluidsRegister.FLOWING_LONG_COFFEE.get());
        setTranslucent(ModFluidsRegister.STILL_STRONG_PURULENT_TEA.get(), ModFluidsRegister.FLOWING_STRONG_PURULENT_TEA.get());
        setTranslucent(ModFluidsRegister.STILL_STRONG_ROSE_HIP_TEA.get(), ModFluidsRegister.FLOWING_STRONG_ROSE_HIP_TEA.get());
        setTranslucent(ModFluidsRegister.STILL_STRONG_BLACK_TEA.get(), ModFluidsRegister.FLOWING_STRONG_BLACK_TEA.get());
        setTranslucent(ModFluidsRegister.STILL_STRONG_YELLOW_TEA.get(), ModFluidsRegister.FLOWING_STRONG_YELLOW_TEA.get());
        setTranslucent(ModFluidsRegister.STILL_STRONG_GREEN_TEA.get(), ModFluidsRegister.FLOWING_STRONG_GREEN_TEA.get());
        setTranslucent(ModFluidsRegister.STILL_STRONG_COFFEE.get(), ModFluidsRegister.FLOWING_STRONG_COFFEE.get());
        setTranslucent(ModFluidsRegister.STILL_ROSE_HIP_JAM.get(), ModFluidsRegister.FLOWING_ROSE_HIP_JAM.get());
        setTranslucent(ModFluidsRegister.STILL_BLAZING_CHILI.get(), ModFluidsRegister.FLOWING_BLAZING_CHILI.get());
        setTranslucent(ModFluidsRegister.STILL_TEA_CURRY.get(), ModFluidsRegister.FLOWING_TEA_CURRY.get());
    }

    private static void setTranslucent(net.minecraft.world.level.material.Fluid still, net.minecraft.world.level.material.Fluid flowing) {
        ItemBlockRenderTypes.setRenderLayer(still, RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(flowing, RenderType.translucent());
    }
}
