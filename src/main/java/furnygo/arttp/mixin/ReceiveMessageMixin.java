package furnygo.arttp.mixin;

import fi.dy.masa.malilib.config.options.ConfigBoolean;
import fi.dy.masa.malilib.config.options.ConfigString;
import furnygo.arttp.ArtTpConfig;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.BossBarHud;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.network.packet.s2c.play.BossBarS2CPacket;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(BossBarHud.class)
public class ReceiveMessageMixin {
    @Inject(method = "handlePacket", at = @At("HEAD"))
    public void obnova(BossBarS2CPacket packet, CallbackInfo ci) {
        if(((ConfigBoolean) ArtTpConfig.OPTIONS.get(4)).getBooleanValue()) {
            int posX = MinecraftClient.getInstance().player.getBlockPos().getX();
            int limiterx = Integer.parseInt(((ConfigString) ArtTpConfig.OPTIONS.get(0)).getStringValue());
            int startx = Integer.parseInt(((ConfigString) ArtTpConfig.OPTIONS.get(1)).getStringValue());
            int starty = Integer.parseInt(((ConfigString) ArtTpConfig.OPTIONS.get(2)).getStringValue());
            String nick = MinecraftClient.getInstance().player.getEntityName();
            if (posX == limiterx) {
                if (((ConfigBoolean) ArtTpConfig.OPTIONS.get(3)).getBooleanValue()) {
                    MinecraftClient.getInstance().player.sendChatMessage("/tppos " + startx + " " + starty + " ~1 -90 90");
                } else {
                    MinecraftClient.getInstance().player.sendChatMessage("/tp " + nick + " " + startx + " " + starty + " ~1 -90 90");
                }
            }
        }
    }
}
