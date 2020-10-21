/*
 * This class is distributed as part of the Psi Mod.
 * Get the Source Code in github:
 * https://github.com/Vazkii/Psi
 *
 * Psi is Open Source and distributed under the
 * Psi License: https://psi.vazkii.net/license.php
 */
package vazkii.psi.mixin.client;

import net.minecraft.client.renderer.RenderState;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(RenderState.class)
public interface AccessorRenderState {
	@Accessor("TRANSLUCENT_TRANSPARENCY")
	static RenderState.TransparencyState getTranslucentTransprency() {
		throw new IllegalStateException();
	}
}
