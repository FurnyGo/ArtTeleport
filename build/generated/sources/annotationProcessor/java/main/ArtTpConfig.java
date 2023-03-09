package furnygo.arttp;

import blue.endless.jankson.Jankson;
import io.wispforest.owo.config.ConfigWrapper;
import io.wispforest.owo.config.Option;
import io.wispforest.owo.util.Observable;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ArtTpConfig extends ConfigWrapper<furnygo.arttp.ArtTpConfigModel> {

    private final Option<java.lang.Boolean> isActive = this.optionForKey(new Option.Key("isActive"));
    private final Option<java.lang.Boolean> useTp = this.optionForKey(new Option.Key("useTp"));
    private final Option<java.lang.Integer> cLimX = this.optionForKey(new Option.Key("cLimX"));
    private final Option<java.lang.Integer> cCrdX = this.optionForKey(new Option.Key("cCrdX"));
    private final Option<java.lang.Integer> cCrdY = this.optionForKey(new Option.Key("cCrdY"));
    private final Option<java.lang.Integer> cYaw = this.optionForKey(new Option.Key("cYaw"));
    private final Option<java.lang.Integer> cPitch = this.optionForKey(new Option.Key("cPitch"));
    private final Option<java.lang.Integer> cStep = this.optionForKey(new Option.Key("cStep"));
    private final Option<java.lang.Integer> checkTimer = this.optionForKey(new Option.Key("checkTimer"));
    private final Option<java.lang.Integer> inaccuracy = this.optionForKey(new Option.Key("inaccuracy"));

    private ArtTpConfig() {
        super(furnygo.arttp.ArtTpConfigModel.class);
    }

    private ArtTpConfig(Consumer<Jankson.Builder> janksonBuilder) {
        super(furnygo.arttp.ArtTpConfigModel.class, janksonBuilder);
    }

    public static ArtTpConfig createAndLoad() {
        var wrapper = new ArtTpConfig();
        wrapper.load();
        return wrapper;
    }

    public static ArtTpConfig createAndLoad(Consumer<Jankson.Builder> janksonBuilder) {
        var wrapper = new ArtTpConfig(janksonBuilder);
        wrapper.load();
        return wrapper;
    }

    public boolean isActive() {
        return isActive.value();
    }

    public void isActive(boolean value) {
        isActive.set(value);
    }

    public boolean useTp() {
        return useTp.value();
    }

    public void useTp(boolean value) {
        useTp.set(value);
    }

    public int cLimX() {
        return cLimX.value();
    }

    public void cLimX(int value) {
        cLimX.set(value);
    }

    public int cCrdX() {
        return cCrdX.value();
    }

    public void cCrdX(int value) {
        cCrdX.set(value);
    }

    public int cCrdY() {
        return cCrdY.value();
    }

    public void cCrdY(int value) {
        cCrdY.set(value);
    }

    public int cYaw() {
        return cYaw.value();
    }

    public void cYaw(int value) {
        cYaw.set(value);
    }

    public int cPitch() {
        return cPitch.value();
    }

    public void cPitch(int value) {
        cPitch.set(value);
    }

    public int cStep() {
        return cStep.value();
    }

    public void cStep(int value) {
        cStep.set(value);
    }

    public int checkTimer() {
        return checkTimer.value();
    }

    public void checkTimer(int value) {
        checkTimer.set(value);
    }

    public int inaccuracy() {
        return inaccuracy.value();
    }

    public void inaccuracy(int value) {
        inaccuracy.set(value);
    }




}

