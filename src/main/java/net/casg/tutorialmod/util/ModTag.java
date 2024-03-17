package net.casg.tutorialmod.util;

import net.casg.tutorialmod.TutorialMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTag {
    public static class Blocks{
        public static final TagKey<Block> HELLISH_TAG = tag("hellish_tag");
        public static final TagKey<Block> NEEDS_HELLISH_TOOL= tag("needs_hellish_tool");
        private static TagKey<Block>tag(String name) {
            return BlockTags.create(new ResourceLocation(TutorialMod.MODID, name));
        }

    }
    public static class Items{
        private static TagKey<Item>tag(String name) {
            return ItemTags.create(new ResourceLocation(TutorialMod.MODID, name));
        }
    }
}
