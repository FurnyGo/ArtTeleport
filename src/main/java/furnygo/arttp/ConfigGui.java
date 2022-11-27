package furnygo.arttp;

import fi.dy.masa.malilib.gui.GuiConfigsBase;
import org.apache.logging.log4j.LogManager;

import java.util.List;

public class ConfigGui extends GuiConfigsBase {
    public ConfigGui() {
        super(10, 50, "arttp", null, "Конфигурация ArtTeleport");
    }

    @Override
    public List<ConfigOptionWrapper> getConfigs() {
        return ConfigOptionWrapper.createFor(ArtTpConfig.OPTIONS);
    }

    @Override
    protected void onSettingsChanged() {
        super.onSettingsChanged();
        ArtTpConfig.saveToFile();
        ArtTpConfig.loadFromFile();
        LogManager.getLogger().info("Настройки сохранены.");
    }
}
