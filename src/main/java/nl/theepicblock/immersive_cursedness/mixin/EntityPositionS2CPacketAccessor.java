package nl.theepicblock.immersive_cursedness.mixin;

import net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(EntityPositionS2CPacket.class)
public interface EntityPositionS2CPacketAccessor {
    @Mutable
    @Accessor("x")
    void ic$setX(double x);
}
