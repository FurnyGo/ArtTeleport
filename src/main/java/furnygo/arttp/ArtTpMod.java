package furnygo.arttp;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;

public class ArtTpMod implements ModInitializer {
    @Override
    public void onInitialize() {
        // To prevent HeadlessExceptions when copying to clipboard.
        System.setProperty("java.awt.headless", "false");
        ArtTpConfig.loadFromFile();
        LogManager.getLogger().info("§aArtTeleport activated!");
    }
}
