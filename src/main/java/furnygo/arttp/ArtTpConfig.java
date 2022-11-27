package furnygo.arttp;

import com.google.common.collect.ImmutableList;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import fi.dy.masa.malilib.config.ConfigUtils;
import fi.dy.masa.malilib.config.IConfigBase;
import fi.dy.masa.malilib.config.IConfigHandler;
import fi.dy.masa.malilib.config.options.ConfigBoolean;
import fi.dy.masa.malilib.config.options.ConfigString;
import fi.dy.masa.malilib.util.FileUtils;
import fi.dy.masa.malilib.util.JsonUtils;

import java.io.File;

public class ArtTpConfig implements IConfigHandler {
    public static final ImmutableList<IConfigBase> OPTIONS = getConfig();

    private static ImmutableList<IConfigBase> getConfig() {
        return ImmutableList.of(
                new ConfigString("LimiterX", Value.LIMITERX.getAsString(), "На какой координате будет тепать обратно (по иксу)"),
                new ConfigString("StartX", Value.STARTX.getAsString(), "Какая координата является началом (по иксу)"),
                new ConfigString("StartY", Value.STARTY.getAsString(), "Какая координата является началом (по игрику)"),
                new ConfigBoolean("Tppos?", Value.TPPOS.getAsBoolean(), "Использовать ли /tppos вместо /tp?"),
                new ConfigBoolean("Active", Value.ACTIVE.getAsBoolean(), "Запустить мод?")
        );
    }

    public static void loadFromFile() {
        File configFile = new File(FileUtils.getConfigDirectory(), "arttp.json");

        if (configFile.exists() && configFile.isFile() && configFile.canRead()) {
            JsonElement element = JsonUtils.parseJsonFile(configFile);

            if (element != null && element.isJsonObject()) {
                JsonObject root = element.getAsJsonObject();
                ConfigUtils.readConfigBase(root, "ArtTP", OPTIONS);
            }
        }
    }

    public static void saveToFile() {
        File dir = FileUtils.getConfigDirectory();

        if ((dir.exists() && dir.isDirectory()) || dir.mkdirs()) {
            JsonObject root = new JsonObject();
            ConfigUtils.writeConfigBase(root, "ArtTP", OPTIONS);
            JsonUtils.writeJsonToFile(root, new File(dir, "arttp.json"));
        }
    }

    @Override
    public void load() {
        loadFromFile();
    }

    @Override
    public void save() {
        saveToFile();
    }

    public enum Value {
        LIMITERX("10100"),
        STARTX("10000"),
        STARTY("10000"),
        TPPOS("TRUE"),
        ACTIVE("FALSE");


        private final String value;

        Value(String value) {
            this.value = value;
        }

        public String getAsString() {
            return value;
        }

        public boolean getAsBoolean() {
            return Boolean.parseBoolean(value);
        }
    }
}
