package net.jimhasaburger.jimhasaburgersmusicmod.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.server.level.ServerPlayer;

import net.jimhasaburger.jimhasaburgersmusicmod.event.PlayerEvents;

@Mixin(ExperienceOrb.class)
public abstract class ExperienceOrbMixin {
	@Inject(method = "playerTouch", at = @At("HEAD"), cancellable = true)
	public void playerTouch(Player player, CallbackInfo ci) {
		if (player instanceof ServerPlayer serverPlayer)
			if (serverPlayer.takeXpDelay == 0)
				if (!PlayerEvents.PICKUP_XP.invoker().onPickupXp(serverPlayer))
					ci.cancel();
	}
}