package flomik.respitecreators.init;

import flomik.respitecreators.RespiteCreatorsMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModItemsRegister {

    public static final DeferredHolder<Item, Item> INCOMPLETE_BLACK_COD = ModFluidsRegister.ITEMS.register("incomplete_black_cod",
            () -> new Item(new Item.Properties().craftRemainder(Items.BOWL).food(new FoodProperties.Builder().nutrition(3).saturationModifier(0.3f).build())));
    public static final DeferredHolder<Item, Item> INCOMPLETE_ROSE_HIP_PIE = ModFluidsRegister.ITEMS.register("incomplete_rose_hip_pie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationModifier(0.3f).build())));
    public static final DeferredHolder<Item, Item> INCOMPLETE_COFFEE_CAKE = ModFluidsRegister.ITEMS.register("incomplete_coffee_cake",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationModifier(0.3f).build())));
    public static final DeferredHolder<Item, Item> COFFEE_CAKE_SPONGE = ModFluidsRegister.ITEMS.register("coffee_cake_sponge",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationModifier(0.3f).build())));
    public static final DeferredHolder<Item, Item> COFFEE_CAKE_COATING = ModFluidsRegister.ITEMS.register("coffee_cake_coating",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationModifier(0.3f).build())));

    public static void registerModItems() {
        RespiteCreatorsMod.LOGGER.debug("Registering Mod Items for " + RespiteCreatorsMod.MOD_ID);
    }
}
