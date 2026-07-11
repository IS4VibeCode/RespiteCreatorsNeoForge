package flomik.respitecreators.init;

import flomik.respitecreators.RespiteCreatorsMod;
import flomik.respitecreators.fluids.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModFluidsRegister {

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(Registries.FLUID, RespiteCreatorsMod.MOD_ID);
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(RespiteCreatorsMod.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RespiteCreatorsMod.MOD_ID);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_PURULENT_TEA = registerFluid("purulent_tea", PurulentTeaFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_PURULENT_TEA = registerFluid("flowing_purulent_tea", PurulentTeaFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> PURULENT_TEA_BLOCK = registerFluidBlock("purulent_tea_block", STILL_PURULENT_TEA);
    public static final DeferredHolder<Item, BucketItem> PURULENT_TEA_BUCKET = registerBucket("purulent_tea_bucket", STILL_PURULENT_TEA);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_DANDELION_TEA = registerFluid("dandelion_tea", DandelionTeaFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_DANDELION_TEA = registerFluid("flowing_dandelion_tea", DandelionTeaFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> DANDELION_TEA_BLOCK = registerFluidBlock("dandelion_tea_block", STILL_DANDELION_TEA);
    public static final DeferredHolder<Item, BucketItem> DANDELION_TEA_BUCKET = registerBucket("dandelion_tea_bucket", STILL_DANDELION_TEA);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_ROSE_HIP_TEA = registerFluid("rose_hip_tea", RoseHipTeaFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_ROSE_HIP_TEA = registerFluid("flowing_rose_hip_tea", RoseHipTeaFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> ROSE_HIP_TEA_BLOCK = registerFluidBlock("rose_hip_tea_block", STILL_ROSE_HIP_TEA);
    public static final DeferredHolder<Item, BucketItem> ROSE_HIP_TEA_BUCKET = registerBucket("rose_hip_tea_bucket", STILL_ROSE_HIP_TEA);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_BLACK_TEA = registerFluid("black_tea", BlackTeaFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_BLACK_TEA = registerFluid("flowing_black_tea", BlackTeaFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> BLACK_TEA_BLOCK = registerFluidBlock("black_tea_block", STILL_BLACK_TEA);
    public static final DeferredHolder<Item, BucketItem> BLACK_TEA_BUCKET = registerBucket("black_tea_bucket", STILL_BLACK_TEA);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_YELLOW_TEA = registerFluid("yellow_tea", YellowTeaFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_YELLOW_TEA = registerFluid("flowing_yellow_tea", YellowTeaFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> YELLOW_TEA_BLOCK = registerFluidBlock("yellow_tea_block", STILL_YELLOW_TEA);
    public static final DeferredHolder<Item, BucketItem> YELLOW_TEA_BUCKET = registerBucket("yellow_tea_bucket", STILL_YELLOW_TEA);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_GREEN_TEA = registerFluid("green_tea", GreenTeaFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_GREEN_TEA = registerFluid("flowing_green_tea", GreenTeaFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> GREEN_TEA_BLOCK = registerFluidBlock("green_tea_block", STILL_GREEN_TEA);
    public static final DeferredHolder<Item, BucketItem> GREEN_TEA_BUCKET = registerBucket("green_tea_bucket", STILL_GREEN_TEA);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_COFFEE = registerFluid("coffee", CoffeeFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_COFFEE = registerFluid("flowing_coffee", CoffeeFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> COFFEE_BLOCK = registerFluidBlock("coffee_block", STILL_COFFEE);
    public static final DeferredHolder<Item, BucketItem> COFFEE_BUCKET = registerBucket("coffee_bucket", STILL_COFFEE);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_LONG_DANDELION_TEA = registerFluid("long_dandelion_tea", LongDandelionTeaFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_LONG_DANDELION_TEA = registerFluid("flowing_long_dandelion_tea", LongDandelionTeaFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> LONG_DANDELION_TEA_BLOCK = registerFluidBlock("long_dandelion_tea_block", STILL_LONG_DANDELION_TEA);
    public static final DeferredHolder<Item, BucketItem> LONG_DANDELION_TEA_BUCKET = registerBucketNoTab("long_dandelion_tea_bucket", STILL_LONG_DANDELION_TEA);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_LONG_BLACK_TEA = registerFluid("long_black_tea", LongBlackTeaFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_LONG_BLACK_TEA = registerFluid("flowing_long_black_tea", LongBlackTeaFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> LONG_BLACK_TEA_BLOCK = registerFluidBlock("long_black_tea_block", STILL_LONG_BLACK_TEA);
    public static final DeferredHolder<Item, BucketItem> LONG_BLACK_TEA_BUCKET = registerBucketNoTab("long_black_tea_bucket", STILL_LONG_BLACK_TEA);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_LONG_YELLOW_TEA = registerFluid("long_yellow_tea", LongYellowTeaFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_LONG_YELLOW_TEA = registerFluid("flowing_long_yellow_tea", LongYellowTeaFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> LONG_YELLOW_TEA_BLOCK = registerFluidBlock("long_yellow_tea_block", STILL_LONG_YELLOW_TEA);
    public static final DeferredHolder<Item, BucketItem> LONG_YELLOW_TEA_BUCKET = registerBucketNoTab("long_yellow_tea_bucket", STILL_LONG_YELLOW_TEA);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_LONG_GREEN_TEA = registerFluid("long_green_tea", LongGreenTeaFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_LONG_GREEN_TEA = registerFluid("flowing_long_green_tea", LongGreenTeaFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> LONG_GREEN_TEA_BLOCK = registerFluidBlock("long_green_tea_block", STILL_LONG_GREEN_TEA);
    public static final DeferredHolder<Item, BucketItem> LONG_GREEN_TEA_BUCKET = registerBucketNoTab("long_green_tea_bucket", STILL_LONG_GREEN_TEA);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_LONG_COFFEE = registerFluid("long_coffee", LongCoffeeFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_LONG_COFFEE = registerFluid("flowing_long_coffee", LongCoffeeFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> LONG_COFFEE_BLOCK = registerFluidBlock("long_coffee_block", STILL_LONG_COFFEE);
    public static final DeferredHolder<Item, BucketItem> LONG_COFFEE_BUCKET = registerBucketNoTab("long_coffee_bucket", STILL_LONG_COFFEE);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_STRONG_PURULENT_TEA = registerFluid("strong_purulent_tea", StrongPurulentTeaFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_STRONG_PURULENT_TEA = registerFluid("flowing_strong_purulent_tea", StrongPurulentTeaFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> STRONG_PURULENT_TEA_BLOCK = registerFluidBlock("strong_purulent_tea_block", STILL_STRONG_PURULENT_TEA);
    public static final DeferredHolder<Item, BucketItem> STRONG_PURULENT_TEA_BUCKET = registerBucketNoTab("strong_purulent_tea_bucket", STILL_STRONG_PURULENT_TEA);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_STRONG_ROSE_HIP_TEA = registerFluid("strong_rose_hip_tea", StrongRoseHipTeaFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_STRONG_ROSE_HIP_TEA = registerFluid("flowing_strong_rose_hip_tea", StrongRoseHipTeaFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> STRONG_ROSE_HIP_TEA_BLOCK = registerFluidBlock("strong_rose_hip_tea_block", STILL_STRONG_ROSE_HIP_TEA);
    public static final DeferredHolder<Item, BucketItem> STRONG_ROSE_HIP_TEA_BUCKET = registerBucketNoTab("strong_rose_hip_tea_bucket", STILL_STRONG_ROSE_HIP_TEA);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_STRONG_BLACK_TEA = registerFluid("strong_black_tea", StrongBlackTeaFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_STRONG_BLACK_TEA = registerFluid("flowing_strong_black_tea", StrongBlackTeaFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> STRONG_BLACK_TEA_BLOCK = registerFluidBlock("strong_black_tea_block", STILL_STRONG_BLACK_TEA);
    public static final DeferredHolder<Item, BucketItem> STRONG_BLACK_TEA_BUCKET = registerBucketNoTab("strong_black_tea_bucket", STILL_STRONG_BLACK_TEA);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_STRONG_YELLOW_TEA = registerFluid("strong_yellow_tea", StrongYellowTeaFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_STRONG_YELLOW_TEA = registerFluid("flowing_strong_yellow_tea", StrongYellowTeaFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> STRONG_YELLOW_TEA_BLOCK = registerFluidBlock("strong_yellow_tea_block", STILL_STRONG_YELLOW_TEA);
    public static final DeferredHolder<Item, BucketItem> STRONG_YELLOW_TEA_BUCKET = registerBucketNoTab("strong_yellow_tea_bucket", STILL_STRONG_YELLOW_TEA);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_STRONG_GREEN_TEA = registerFluid("strong_green_tea", StrongGreenTeaFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_STRONG_GREEN_TEA = registerFluid("flowing_strong_green_tea", StrongGreenTeaFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> STRONG_GREEN_TEA_BLOCK = registerFluidBlock("strong_green_tea_block", STILL_STRONG_GREEN_TEA);
    public static final DeferredHolder<Item, BucketItem> STRONG_GREEN_TEA_BUCKET = registerBucketNoTab("strong_green_tea_bucket", STILL_STRONG_GREEN_TEA);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_STRONG_COFFEE = registerFluid("strong_coffee", StrongCoffeeFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_STRONG_COFFEE = registerFluid("flowing_strong_coffee", StrongCoffeeFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> STRONG_COFFEE_BLOCK = registerFluidBlock("strong_coffee_block", STILL_STRONG_COFFEE);
    public static final DeferredHolder<Item, BucketItem> STRONG_COFFEE_BUCKET = registerBucketNoTab("strong_coffee_bucket", STILL_STRONG_COFFEE);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_ROSE_HIP_JAM = registerFluid("rose_hip_jam", RoseHipJamFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_ROSE_HIP_JAM = registerFluid("flowing_rose_hip_jam", RoseHipJamFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> ROSE_HIP_JAM_BLOCK = registerFluidBlock("rose_hip_jam_block", STILL_ROSE_HIP_JAM);
    public static final DeferredHolder<Item, BucketItem> ROSE_HIP_JAM_BUCKET = registerBucket("rose_hip_jam_bucket", STILL_ROSE_HIP_JAM);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_BLAZING_CHILI = registerFluid("blazing_chili", BlazingChiliFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_BLAZING_CHILI = registerFluid("flowing_blazing_chili", BlazingChiliFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> BLAZING_CHILI_BLOCK = registerFluidBlock("blazing_chili_block", STILL_BLAZING_CHILI);
    public static final DeferredHolder<Item, BucketItem> BLAZING_CHILI_BUCKET = registerBucket("blazing_chili_bucket", STILL_BLAZING_CHILI);

    public static final DeferredHolder<Fluid, FlowingFluid> STILL_TEA_CURRY = registerFluid("tea_curry", TeaCurryFluid.Still::new);
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_TEA_CURRY = registerFluid("flowing_tea_curry", TeaCurryFluid.Flowing::new);
    public static final DeferredHolder<Block, LiquidBlock> TEA_CURRY_BLOCK = registerFluidBlock("tea_curry_block", STILL_TEA_CURRY);
    public static final DeferredHolder<Item, BucketItem> TEA_CURRY_BUCKET = registerBucket("tea_curry_bucket", STILL_TEA_CURRY);

    private static DeferredHolder<Fluid, FlowingFluid> registerFluid(String name, Supplier<FlowingFluid> supplier) {
        return FLUIDS.register(name, supplier);
    }

    private static DeferredHolder<Block, LiquidBlock> registerFluidBlock(String name, DeferredHolder<Fluid, FlowingFluid> fluid) {
        return BLOCKS.register(name, () -> new LiquidBlock(fluid.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    }

    private static DeferredHolder<Item, BucketItem> registerBucket(String name, DeferredHolder<Fluid, FlowingFluid> fluid) {
        return ITEMS.register(name, () -> new BucketItem(fluid.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    }

    private static DeferredHolder<Item, BucketItem> registerBucketNoTab(String name, DeferredHolder<Fluid, FlowingFluid> fluid) {
        return registerBucket(name, fluid);
    }

    public static boolean isCoffee(FluidState state) {
        return state.getType() == STILL_COFFEE.get() || state.getType() == FLOWING_COFFEE.get();
    }

    public static boolean isPurulentTea(FluidState state) {
        return state.getType() == STILL_PURULENT_TEA.get() || state.getType() == FLOWING_PURULENT_TEA.get();
    }

    public static boolean isDandelionTea(FluidState state) {
        return state.getType() == STILL_DANDELION_TEA.get() || state.getType() == FLOWING_DANDELION_TEA.get();
    }

    public static boolean isRoseHipTea(FluidState state) {
        return state.getType() == STILL_ROSE_HIP_TEA.get() || state.getType() == FLOWING_ROSE_HIP_TEA.get();
    }

    public static boolean isBlackTea(FluidState state) {
        return state.getType() == STILL_BLACK_TEA.get() || state.getType() == FLOWING_BLACK_TEA.get();
    }

    public static boolean isYellowTea(FluidState state) {
        return state.getType() == STILL_YELLOW_TEA.get() || state.getType() == FLOWING_YELLOW_TEA.get();
    }

    public static boolean isGreenTea(FluidState state) {
        return state.getType() == STILL_GREEN_TEA.get() || state.getType() == FLOWING_GREEN_TEA.get();
    }

    public static boolean isLongCoffee(FluidState state) {
        return state.getType() == STILL_LONG_COFFEE.get() || state.getType() == FLOWING_LONG_COFFEE.get();
    }

    public static boolean isLongDandelionTea(FluidState state) {
        return state.getType() == STILL_LONG_DANDELION_TEA.get() || state.getType() == FLOWING_LONG_DANDELION_TEA.get();
    }

    public static boolean isLongBlackTea(FluidState state) {
        return state.getType() == STILL_LONG_BLACK_TEA.get() || state.getType() == FLOWING_LONG_BLACK_TEA.get();
    }

    public static boolean isLongYellowTea(FluidState state) {
        return state.getType() == STILL_LONG_YELLOW_TEA.get() || state.getType() == FLOWING_LONG_YELLOW_TEA.get();
    }

    public static boolean isLongGreenTea(FluidState state) {
        return state.getType() == STILL_LONG_GREEN_TEA.get() || state.getType() == FLOWING_LONG_GREEN_TEA.get();
    }

    public static boolean isStrongCoffee(FluidState state) {
        return state.getType() == STILL_STRONG_COFFEE.get() || state.getType() == FLOWING_STRONG_COFFEE.get();
    }

    public static boolean isStrongPurulentTea(FluidState state) {
        return state.getType() == STILL_STRONG_PURULENT_TEA.get() || state.getType() == FLOWING_STRONG_PURULENT_TEA.get();
    }

    public static boolean isStrongRoseHipTea(FluidState state) {
        return state.getType() == STILL_STRONG_ROSE_HIP_TEA.get() || state.getType() == FLOWING_STRONG_ROSE_HIP_TEA.get();
    }

    public static boolean isStrongBlackTea(FluidState state) {
        return state.getType() == STILL_STRONG_BLACK_TEA.get() || state.getType() == FLOWING_STRONG_BLACK_TEA.get();
    }

    public static boolean isStrongYellowTea(FluidState state) {
        return state.getType() == STILL_STRONG_YELLOW_TEA.get() || state.getType() == FLOWING_STRONG_YELLOW_TEA.get();
    }

    public static boolean isStrongGreenTea(FluidState state) {
        return state.getType() == STILL_STRONG_GREEN_TEA.get() || state.getType() == FLOWING_STRONG_GREEN_TEA.get();
    }

    public static boolean isRoseHipJam(FluidState state) {
        return state.getType() == STILL_ROSE_HIP_JAM.get() || state.getType() == FLOWING_ROSE_HIP_JAM.get();
    }

    public static boolean isTeaCurry(FluidState state) {
        return state.getType() == STILL_TEA_CURRY.get() || state.getType() == FLOWING_TEA_CURRY.get();
    }

    public static boolean isBlazingChili(FluidState state) {
        return state.getType() == STILL_BLAZING_CHILI.get() || state.getType() == FLOWING_BLAZING_CHILI.get();
    }
}
