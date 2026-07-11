package flomik.respitecreators.item;

import flomik.respitecreators.RespiteCreatorsMod;
import flomik.respitecreators.init.ModFluidsRegister;
import flomik.respitecreators.init.ModItemsRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItemsGroup {

    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RespiteCreatorsMod.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RESPITE_CREATORS = REGISTRY.register("respite_creators", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItemsRegister.INCOMPLETE_ROSE_HIP_PIE.get()))
            .title(Component.translatable("itemgroup.respite_creators"))
            .displayItems((params, entries) -> {
                entries.accept(ModItemsRegister.INCOMPLETE_COFFEE_CAKE.get());
                entries.accept(ModItemsRegister.INCOMPLETE_BLACK_COD.get());
                entries.accept(ModItemsRegister.INCOMPLETE_ROSE_HIP_PIE.get());
                entries.accept(ModItemsRegister.COFFEE_CAKE_COATING.get());
                entries.accept(ModItemsRegister.COFFEE_CAKE_SPONGE.get());
                entries.accept(ModFluidsRegister.PURULENT_TEA_BUCKET.get());
                entries.accept(ModFluidsRegister.DANDELION_TEA_BUCKET.get());
                entries.accept(ModFluidsRegister.ROSE_HIP_TEA_BUCKET.get());
                entries.accept(ModFluidsRegister.BLACK_TEA_BUCKET.get());
                entries.accept(ModFluidsRegister.YELLOW_TEA_BUCKET.get());
                entries.accept(ModFluidsRegister.GREEN_TEA_BUCKET.get());
                entries.accept(ModFluidsRegister.COFFEE_BUCKET.get());
                entries.accept(ModFluidsRegister.LONG_DANDELION_TEA_BUCKET.get());
                entries.accept(ModFluidsRegister.LONG_BLACK_TEA_BUCKET.get());
                entries.accept(ModFluidsRegister.LONG_YELLOW_TEA_BUCKET.get());
                entries.accept(ModFluidsRegister.LONG_GREEN_TEA_BUCKET.get());
                entries.accept(ModFluidsRegister.LONG_COFFEE_BUCKET.get());
                entries.accept(ModFluidsRegister.STRONG_PURULENT_TEA_BUCKET.get());
                entries.accept(ModFluidsRegister.STRONG_ROSE_HIP_TEA_BUCKET.get());
                entries.accept(ModFluidsRegister.STRONG_BLACK_TEA_BUCKET.get());
                entries.accept(ModFluidsRegister.STRONG_YELLOW_TEA_BUCKET.get());
                entries.accept(ModFluidsRegister.STRONG_COFFEE_BUCKET.get());
                entries.accept(ModFluidsRegister.ROSE_HIP_JAM_BUCKET.get());
                entries.accept(ModFluidsRegister.TEA_CURRY_BUCKET.get());
                entries.accept(ModFluidsRegister.BLAZING_CHILI_BUCKET.get());
            })
            .build());

    public static void registerModItemGroup() {
        RespiteCreatorsMod.LOGGER.debug("Registering Mod Item Group for " + RespiteCreatorsMod.MOD_ID);
    }
}
