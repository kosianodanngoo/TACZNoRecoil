package com.tacznorecoil.mixin;

import com.tacz.guns.client.event.CameraSetupEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = CameraSetupEvent.class, remap = false)
public class CameraSetupEventMixin {
    @Inject(method = "applyCameraRecoil", at = @At("HEAD"), cancellable = true)
    private static void applyCameraRecoilInject(CallbackInfo ci) {
        ci.cancel();
    }
}
