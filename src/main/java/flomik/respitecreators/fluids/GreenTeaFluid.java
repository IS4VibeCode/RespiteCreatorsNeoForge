package flomik.respitecreators.fluids;

import flomik.respitecreators.init.ModFluidsRegister;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.LevelReader;

public abstract class GreenTeaFluid extends ModFluidsTemplate {

    @Override
    public Fluid getFlowing() {
        return ModFluidsRegister.FLOWING_GREEN_TEA.get();
    }

    @Override
    public Fluid getSource() {
        return ModFluidsRegister.STILL_GREEN_TEA.get();
    }

    @Override
    public Item getBucket() {
        return ModFluidsRegister.GREEN_TEA_BUCKET.get();
    }

    @Override
    public BlockState createLegacyBlock(FluidState state) {
        return ModFluidsRegister.GREEN_TEA_BLOCK.get().defaultBlockState().setValue(BlockStateProperties.LEVEL, getLegacyLevel(state));
    }

    @Override
    public net.neoforged.neoforge.fluids.FluidType getFluidType() {
        return flomik.respitecreators.init.ModFluidTypesRegister.GREEN_TEA_TYPE.get();
    }

    @Override
    public int getSlopeFindDistance(LevelReader levelReader) {
        return 4;
    }

    @Override
    public int getDropOff(LevelReader levelReader) {
        return 1;
    }

    @Override
    public int getTickDelay(LevelReader levelReader) {
        return 5;
    }

    public static class Flowing extends GreenTeaFluid {
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

    public static class Still extends GreenTeaFluid {
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
