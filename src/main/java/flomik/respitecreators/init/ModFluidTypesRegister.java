package flomik.respitecreators.init;

import flomik.respitecreators.RespiteCreatorsMod;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModFluidTypesRegister {

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, RespiteCreatorsMod.MOD_ID);

    private static DeferredHolder<FluidType, FluidType> register(String name) {
        return FLUID_TYPES.register(name, () -> new FluidType(FluidType.Properties.create()));
    }

    public static final DeferredHolder<FluidType, FluidType> PURULENT_TEA_TYPE = register("purulent_tea");
    public static final DeferredHolder<FluidType, FluidType> DANDELION_TEA_TYPE = register("dandelion_tea");
    public static final DeferredHolder<FluidType, FluidType> ROSE_HIP_TEA_TYPE = register("rose_hip_tea");
    public static final DeferredHolder<FluidType, FluidType> BLACK_TEA_TYPE = register("black_tea");
    public static final DeferredHolder<FluidType, FluidType> YELLOW_TEA_TYPE = register("yellow_tea");
    public static final DeferredHolder<FluidType, FluidType> GREEN_TEA_TYPE = register("green_tea");
    public static final DeferredHolder<FluidType, FluidType> COFFEE_TYPE = register("coffee");
    public static final DeferredHolder<FluidType, FluidType> LONG_DANDELION_TEA_TYPE = register("long_dandelion_tea");
    public static final DeferredHolder<FluidType, FluidType> LONG_BLACK_TEA_TYPE = register("long_black_tea");
    public static final DeferredHolder<FluidType, FluidType> LONG_YELLOW_TEA_TYPE = register("long_yellow_tea");
    public static final DeferredHolder<FluidType, FluidType> LONG_GREEN_TEA_TYPE = register("long_green_tea");
    public static final DeferredHolder<FluidType, FluidType> LONG_COFFEE_TYPE = register("long_coffee");
    public static final DeferredHolder<FluidType, FluidType> STRONG_PURULENT_TEA_TYPE = register("strong_purulent_tea");
    public static final DeferredHolder<FluidType, FluidType> STRONG_ROSE_HIP_TEA_TYPE = register("strong_rose_hip_tea");
    public static final DeferredHolder<FluidType, FluidType> STRONG_BLACK_TEA_TYPE = register("strong_black_tea");
    public static final DeferredHolder<FluidType, FluidType> STRONG_YELLOW_TEA_TYPE = register("strong_yellow_tea");
    public static final DeferredHolder<FluidType, FluidType> STRONG_GREEN_TEA_TYPE = register("strong_green_tea");
    public static final DeferredHolder<FluidType, FluidType> STRONG_COFFEE_TYPE = register("strong_coffee");
    public static final DeferredHolder<FluidType, FluidType> ROSE_HIP_JAM_TYPE = register("rose_hip_jam");
    public static final DeferredHolder<FluidType, FluidType> BLAZING_CHILI_TYPE = register("blazing_chili");
    public static final DeferredHolder<FluidType, FluidType> TEA_CURRY_TYPE = register("tea_curry");
}
