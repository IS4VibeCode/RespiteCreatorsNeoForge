package flomik.respitecreators.fluids;

import flomik.respitecreators.init.ModFluidsRegister;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.StateDefinition;

public abstract class LongYellowTeaFluid extends ModFluidsTemplate {

    @Override
    public Fluid getFlowing() {
        return ModFluidsRegister.FLOWING_LONG_YELLOW_TEA.get();
    }

    @Override
    public Fluid getSource() {
        return ModFluidsRegister.STILL_LONG_YELLOW_TEA.get();
    }

    @Override
    public Item getBucket() {
        return ModFluidsRegister.LONG_YELLOW_TEA_BUCKET.get();
    }

    @Override
    public BlockState createLegacyBlock(FluidState state) {
        return ModFluidsRegister.LONG_YELLOW_TEA_BLOCK.get().defaultBlockState().setValue(BlockStateProperties.LEVEL, getLegacyLevel(state));
    }

    @Override
    public net.neoforged.neoforge.fluids.FluidType getFluidType() {
        return flomik.respitecreators.init.ModFluidTypesRegister.LONG_YELLOW_TEA_TYPE.get();
    }

    public static class Flowing extends LongYellowTeaFluid {
        @Override
        protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getAmount(FluidState state) {
            return state.getValue(LEVEL);
        }

        @Override
        public boolean isSource(FluidState state) {
            return false;
        }

    }

    public static class Still extends LongYellowTeaFluid {
        @Override
        public int getAmount(FluidState state) {
            return 8;
        }

        @Override
        public boolean isSource(FluidState state) {
            return true;
        }
    }
}
