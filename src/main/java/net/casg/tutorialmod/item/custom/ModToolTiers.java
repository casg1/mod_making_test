package net.casg.tutorialmod.item.custom;

import net.casg.tutorialmod.TutorialMod;
import net.casg.tutorialmod.block.ModBlocks;
import net.casg.tutorialmod.item.ModItems;
import net.casg.tutorialmod.util.ModTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier HILLISH = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000,5f,8.5f,25,
                    ModTag.Blocks.NEEDS_HELLISH_TOOL, ()-> Ingredient.of(ModItems.dismantle.get())),
            new ResourceLocation(TutorialMod.MODID, "dismantle"), List.of(Tiers.NETHERITE), List.of());
}
