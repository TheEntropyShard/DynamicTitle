package me.theentropyshard.dynamictitle.mixins;

import com.badlogic.gdx.Gdx;
import finalforeach.cosmicreach.gamestates.InGame;
import finalforeach.cosmicreach.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGame.class)
public class InGameMixin {
    @Inject(method = "setWorld(Lfinalforeach/cosmicreach/world/World;)V", at = @At("HEAD"))
    private void injected(World world, CallbackInfo ci) {
        Gdx.graphics.setTitle(world.getDisplayName());
    }
}
