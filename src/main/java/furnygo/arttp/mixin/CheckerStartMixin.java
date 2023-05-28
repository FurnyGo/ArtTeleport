package furnygo.arttp.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.network.packet.c2s.login.LoginHelloC2SPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static furnygo.arttp.ArtTpMain.CONFIG;

@Mixin(LoginHelloC2SPacket.class)
public class CheckerStartMixin {
    @Inject(at = @At("HEAD"), method = "write")
    private void init(CallbackInfo info) {
        (new Thread(() -> {
            try {
                Thread.sleep(10000);
                while (CONFIG.isActive()) {
                    assert MinecraftClient.getInstance().player != null;
                    int crdX = (int) MinecraftClient.getInstance().player.getX();
                    if (!CONFIG.clientSideTeleports()) {
                        if (crdX >= CONFIG.cLimX() && crdX <= CONFIG.cLimX() + CONFIG.inaccuracy()) {
                            if (CONFIG.useTp()) {
                                String nick = MinecraftClient.getInstance().player.getEntityName();
                                MinecraftClient.getInstance().player.networkHandler.sendChatCommand("tp " + nick + " " + CONFIG.cCrdX() + " " + CONFIG.cCrdY() + " ~" + CONFIG.cStep() + " " + CONFIG.cYaw() + " " + CONFIG.cPitch());
                            } else
                                MinecraftClient.getInstance().player.networkHandler.sendChatCommand("tppos " + CONFIG.cCrdX() + " " + CONFIG.cCrdY() + " ~" + CONFIG.cStep() + " " + CONFIG.cYaw() + " " + CONFIG.cPitch());
                        }
                        Thread.sleep(CONFIG.checkTimer());
                    }
                    else {
                        if (crdX >= CONFIG.cLimX() && crdX <= CONFIG.cLimX() + CONFIG.inaccuracy()) {
                            // End of line
                            for (int i = 0; i < CONFIG.cStep(); i++) {
                                MinecraftClient.getInstance().player.updatePosition(CONFIG.cLimX()-1, CONFIG.cCrdY(), MinecraftClient.getInstance().player.getZ()+CONFIG.cStep());
                                Thread.sleep(CONFIG.cStepSpeed());
                            }
                            MinecraftClient.getInstance().player.setYaw((float) CONFIG.cYaw());
                            if (CONFIG.pitchAnim()){
                                for (float i = 0; i <= CONFIG.cPitch(); i+=0.1){
                                    MinecraftClient.getInstance().player.setPitch(i);
                                    Thread.sleep(CONFIG.pitchSpeed());
                                }
                            } else MinecraftClient.getInstance().player.setPitch((float) CONFIG.cPitch());
                        }
                        else if (crdX <= CONFIG.cCrdX() && crdX >= CONFIG.cCrdX() - CONFIG.inaccuracy()) {
                            // Start of line
                            for (int i = 0; i < CONFIG.cStep(); i++) {
                                MinecraftClient.getInstance().player.updatePosition(CONFIG.cCrdX()+1, CONFIG.cCrdY(), MinecraftClient.getInstance().player.getZ()+CONFIG.cStep());
                                Thread.sleep(CONFIG.cStepSpeed());
                            }
                            MinecraftClient.getInstance().player.setYaw((float) CONFIG.cYaw()+180);
                            if (CONFIG.pitchAnim()) {
                                for (float i = 0; i <= CONFIG.cPitch(); i += 0.1) {
                                    MinecraftClient.getInstance().player.setPitch(i);
                                    Thread.sleep(CONFIG.pitchSpeed());
                                }
                            } else MinecraftClient.getInstance().player.setPitch((float) CONFIG.cPitch());
                        }
                        Thread.sleep(CONFIG.checkTimer());
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        })).start();
    }
}
