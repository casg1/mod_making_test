package net.casg.tutorialmod.datagen;

import net.casg.tutorialmod.TutorialMod;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider  extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TutorialMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }
}
