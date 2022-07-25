package com.github.fakelog.aegis.common.mixin;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerChunkManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {

    @Redirect(method = "prepareStartRegion", at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/server/world/ServerChunkManager;getTotalChunksLoadedCount()I"))

    public int onPrepareStartReg_redirectChunksLoaded(ServerChunkManager scm) {
        return 441;
    }
}
