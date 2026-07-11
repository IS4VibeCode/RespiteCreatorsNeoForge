package flomik.respitecreators;

import flomik.respitecreators.init.ModFluidsRegister;
import flomik.respitecreators.init.ModFluidTypesRegister;
import flomik.respitecreators.init.ModItemsRegister;
import flomik.respitecreators.item.ModItemsGroup;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(RespiteCreatorsMod.MOD_ID)
public class RespiteCreatorsMod {
    public static final String MOD_ID = "respitecreators";
    public static final Logger LOGGER = LoggerFactory.getLogger("Respite Creators");

    public RespiteCreatorsMod(IEventBus modEventBus) {
        ModFluidTypesRegister.FLUID_TYPES.register(modEventBus);
        ModFluidsRegister.FLUIDS.register(modEventBus);
        ModFluidsRegister.BLOCKS.register(modEventBus);
        ModFluidsRegister.ITEMS.register(modEventBus);
        ModItemsGroup.REGISTRY.register(modEventBus);

        ModItemsRegister.registerModItems();
        ModItemsGroup.registerModItemGroup();
    }
}
