package chalkboardmods.floralflair.core.registry;

import chalkboardmods.floralflair.common.FloralProperties;
import chalkboardmods.floralflair.common.blocks.*;
import chalkboardmods.floralflair.core.FloralFlair;
import com.teamabnormals.blueprint.common.block.BlueprintFlowerBlock;
import com.teamabnormals.blueprint.common.block.BlueprintTallFlowerBlock;
import com.teamabnormals.blueprint.core.util.PropertyUtil;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.ToIntFunction;

@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FloralBlocks {
    private static ToIntFunction<BlockState> createLightLevelFromTimeBlockState(int litLevel) {
        return (state) -> state.getValue(FloralProperties.TIME) == 3 ? litLevel : 0;
    }

    //Flowers
    public static final BlockSubRegistryHelper HELPER = FloralFlair.REGISTRY_HELPER.getBlockSubHelper();

    public static final RegistryObject<Block> FOXNIP = HELPER.createBlock("foxnip", () -> new BlueprintFlowerBlock(() -> MobEffects.MOVEMENT_SLOWDOWN, 8, PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> FROSTED_FOXNIP = HELPER.createBlock("frosted_foxnip", () -> new BlueprintFlowerBlock(() -> MobEffects.MOVEMENT_SLOWDOWN, 5, PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PULSE_PETAL = HELPER.createBlock("pulse_petal", () -> new BlueprintFlowerBlock(() -> MobEffects.HEALTH_BOOST, 8, PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> FAIRY_BLOSSOM = HELPER.createBlock("fairy_blossom", () -> new BlueprintTallFlowerBlock(PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> JUNGLE_GEM = HELPER.createBlock("gem_of_the_jungle", () -> new BlueprintFlowerBlock(() -> MobEffects.GLOWING, 10, PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> ROSE = HELPER.createBlock("rose", () -> new BlueprintFlowerBlock(() -> MobEffects.REGENERATION, 9, PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> MUSCARI = HELPER.createBlock("muscari", () -> new BlueprintTallFlowerBlock(PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PURPUREUM = HELPER.createBlock("purpureum", () -> new BlueprintTallFlowerBlock(PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SCILLA = HELPER.createBlock("scilla", () -> new ScillaFlowerBlock(() -> MobEffects.WEAKNESS, 6, PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> MIDNIGHT_ORCHID = HELPER.createBlock("midnight_orchid", () -> new BlueprintFlowerBlock(() -> MobEffects.FIRE_RESISTANCE, 11, PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> HYACINTH = HELPER.createBlock("hyacinth", () -> new BlueprintFlowerBlock(() -> MobEffects.FIRE_RESISTANCE, 11, PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SPIKED_TULIP = HELPER.createBlock("spiked_tulip", () -> new SpikedTulipBlock(() -> MobEffects.MOVEMENT_SPEED, 9, PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> STONNETE = HELPER.createBlock("stonnete", () -> new StonetteBlock(() -> MobEffects.DIG_SPEED, 6, PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> LUNULA = HELPER.createBlock("lunula", () -> new LunulaBlock(() -> MobEffects.GLOWING, 10, Properties.LUNULA.lightLevel(createLightLevelFromTimeBlockState(5))), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> ORANGE_COSMOS = HELPER.createBlock("orange_cosmos", () -> new BlueprintFlowerBlock(() -> MobEffects.FIRE_RESISTANCE, 9, PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> WHITE_COSMOS = HELPER.createBlock("white_cosmos", () -> new BlueprintFlowerBlock(() -> MobEffects.SLOW_FALLING, 7, PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PINK_COSMOS = HELPER.createBlock("pink_cosmos", () -> new BlueprintFlowerBlock(() -> MobEffects.INVISIBILITY, 4, PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> CHOCOLATE_COSMOS = HELPER.createBlock("chocolate_cosmos", () -> new BlueprintFlowerBlock(() -> MobEffects.NIGHT_VISION, 12, PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);


    //Potted Flowers
    public static final RegistryObject<Block> POTTED_FOXNIP = HELPER.createBlockNoItem("potted_foxnip", () -> new FlowerPotBlock(FOXNIP.get(), PropertyUtil.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_FROSTED_FOXNIP = HELPER.createBlockNoItem("potted_frosted_foxnip", () -> new FlowerPotBlock(FROSTED_FOXNIP.get(), PropertyUtil.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_PULSE_PETAL = HELPER.createBlockNoItem("potted_pulse_petal", () -> new FlowerPotBlock(PULSE_PETAL.get(), PropertyUtil.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_JUNGLE_GEM = HELPER.createBlockNoItem("potted_gem_of_the_jungle", () -> new FlowerPotBlock(JUNGLE_GEM.get(), PropertyUtil.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_ROSE = HELPER.createBlockNoItem("potted_rose", () -> new FlowerPotBlock(ROSE.get(), PropertyUtil.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_SCILLA = HELPER.createBlockNoItem("potted_scilla", () -> new FlowerPotBlock(SCILLA.get(), PropertyUtil.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_MIDNIGHT_ORCHID = HELPER.createBlockNoItem("potted_midnight_orchid", () -> new FlowerPotBlock(MIDNIGHT_ORCHID.get(), PropertyUtil.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_HYACINTH = HELPER.createBlockNoItem("potted_hyacinth", () -> new FlowerPotBlock(HYACINTH.get(), PropertyUtil.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_SPIKED_TULIP = HELPER.createBlockNoItem("potted_spiked_tulip", () -> new FlowerPotBlock(SPIKED_TULIP.get(), PropertyUtil.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_STONNETE = HELPER.createBlockNoItem("potted_stonnete", () -> new FlowerPotBlock(STONNETE.get(), PropertyUtil.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_LUNULA = HELPER.createBlockNoItem("potted_lunula", () -> new PottedLunulaBlock(LUNULA.get(), Properties.POTTED_LUNULA.lightLevel(createLightLevelFromTimeBlockState(5))));
    public static final RegistryObject<Block> POTTED_ORANGE_COSMOS = HELPER.createBlockNoItem("potted_orange_cosmos", () -> new FlowerPotBlock(ORANGE_COSMOS.get(), PropertyUtil.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_WHITE_COSMOS = HELPER.createBlockNoItem("potted_white_cosmos", () -> new FlowerPotBlock(WHITE_COSMOS.get(), PropertyUtil.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_PINK_COSMOS = HELPER.createBlockNoItem("potted_pink_cosmos", () -> new FlowerPotBlock(PINK_COSMOS.get(), PropertyUtil.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_CHOCOLATE_COSMOS = HELPER.createBlockNoItem("potted_chocolate_cosmos", () -> new FlowerPotBlock(CHOCOLATE_COSMOS.get(), PropertyUtil.FLOWER_POT));

    public static class Properties {
        public static final BlockBehaviour.Properties LUNULA = Block.Properties.of(Material.PLANT).noCollission().instabreak().sound(SoundType.GRASS).lightLevel(createLightLevelFromTimeBlockState(5));
        public static final BlockBehaviour.Properties POTTED_LUNULA = Block.Properties.of(Material.DECORATION).instabreak().noOcclusion().lightLevel(createLightLevelFromTimeBlockState(5));
    }
}
