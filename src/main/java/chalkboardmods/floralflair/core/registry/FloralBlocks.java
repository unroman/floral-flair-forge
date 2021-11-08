package chalkboardmods.floralflair.core.registry;

import chalkboardmods.floralflair.core.FloralFlair;
import com.teamabnormals.blueprint.common.block.BlueprintFlowerBlock;
import com.teamabnormals.blueprint.common.block.BlueprintTallFlowerBlock;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;

@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FloralBlocks {
    public static final BlockSubRegistryHelper HELPER = FloralFlair.REGISTRY_HELPER.getBlockSubHelper();

    public static final RegistryObject<Block> FOXNIP = HELPER.createBlock("foxnip", () -> new BlueprintFlowerBlock(() -> MobEffects.MOVEMENT_SLOWDOWN, 8, BlockBehaviour.Properties.copy(Blocks.POPPY)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> FROSTED_FOXNIP = HELPER.createBlock("frosted_foxnip", () -> new BlueprintFlowerBlock(() -> MobEffects.MOVEMENT_SLOWDOWN, 8, BlockBehaviour.Properties.copy(Blocks.POPPY)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PULSE_PETAL = HELPER.createBlock("pulse_petal", () -> new BlueprintFlowerBlock(() -> MobEffects.REGENERATION, 8, BlockBehaviour.Properties.copy(Blocks.POPPY)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> FAIRY_BLOSSOM = HELPER.createBlock("fairy_blossom", () -> new BlueprintTallFlowerBlock(Properties.FAIRY_BLOSSOM), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> POTTED_FOXNIP = HELPER.createBlockNoItem("potted_foxnip", () -> new FlowerPotBlock(FOXNIP.get(), Properties.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_FROSTED_FOXNIP = HELPER.createBlockNoItem("potted_frosted_foxnip", () -> new FlowerPotBlock(FROSTED_FOXNIP.get(), Properties.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_PULSE_PETAL = HELPER.createBlockNoItem("potted_pulse_petal", () -> new FlowerPotBlock(PULSE_PETAL.get(), Properties.FLOWER_POT));



    public static class Properties {
        public static final BlockBehaviour.Properties FLOWER_POT = BlockBehaviour.Properties.of(Material.DECORATION).strength(0.0F).noOcclusion();
        public static final BlockBehaviour.Properties FAIRY_BLOSSOM = BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().strength(0.0f).sound(SoundType.GRASS);
    }
}
