package furnygo.arttp;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArtTpMain implements ModInitializer {
	public static final furnygo.arttp.ArtTpConfig CONFIG = furnygo.arttp.ArtTpConfig.createAndLoad();
	public static final Logger LOGGER = LoggerFactory.getLogger("arttp");
	@Override
	public void onInitialize() {
		LOGGER.info("ArtTeleport Started!");
	}
}
