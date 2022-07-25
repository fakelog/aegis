package com.github.fakelog.aegis.common.block;

import net.minecraft.block.*;

public class AppleBlock extends GourdBlock {

    public AppleBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    public StemBlock getStem() {
        return (StemBlock) AegisBlocks.APPLE_STEM;
    }

    public AttachedStemBlock getAttachedStem() {
        return (AttachedStemBlock) AegisBlocks.ATTACHED_APPLE_STEM;
    }
}
