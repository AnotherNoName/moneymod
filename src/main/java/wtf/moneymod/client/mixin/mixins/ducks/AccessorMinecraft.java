package wtf.moneymod.client.mixin.mixins.ducks;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Minecraft.class)
public interface AccessorMinecraft {

    @Accessor("rightClickDelayTimer")
    void setRightClickDelayTimer(int rightClickDelayTimer);

    @Accessor("jumpTicks")
    void setJumpTicks(int jumpTicks);

    @Accessor( value = "leftClickCounter" )
    void mm_setLeftClickCounter( int val );

    @Invoker( value = "sendClickBlockToController" )
    void mm_invokeSendClickBlockToController( boolean val );
}
