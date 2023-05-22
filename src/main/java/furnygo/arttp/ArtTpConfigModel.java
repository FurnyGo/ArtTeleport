package furnygo.arttp;

import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;

@Modmenu(modId = "arttp")
@Config(name = "arttp-config", wrapperName = "ArtTpConfig")
public class ArtTpConfigModel {
    public boolean isActive = false;
    public boolean clientSideTeleports = true;
    public boolean useTp = false;
    public int cLimX = 99999;
    public int cCrdX = 99999;
    public int cCrdY = 99999;
    public int cYaw = -90;
    public int cPitch = 75;
    public int cStep = 1;
    public int checkTimer = 200;
    public int inaccuracy = 10;
}
