package furnygo.arttp;

import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;

@Modmenu(modId = "arttp")
@Config(name = "arttp-config", wrapperName = "ArtTpConfig")
public class ArtTpConfigModel {
    public boolean isActive = false;
    public boolean clientSideTeleports = true;
    public boolean useTp = false;
    public double cLimX = 99999;
    public double cCrdX = 99999;
    public double cCrdY = 99999;
    public double cYaw = -90;
    public double cPitch = 14;
    public int cStep = 1;
    public int cStepSpeed = 1;
    public int checkTimer = 50;
    public boolean pitchAnim = true;
    public int pitchSpeed = 0;
    public int inaccuracy = 10;
}
