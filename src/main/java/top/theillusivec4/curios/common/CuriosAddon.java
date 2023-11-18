package top.theillusivec4.curios.common;

import btw.AddonHandler;
import btw.BTWAddon;

public class CuriosAddon extends BTWAddon {
    private static CuriosAddon instance;

    private CuriosAddon() {
        super("Curios", "1.0", "BWC");
    }

    @Override
    public void initialize() {
        AddonHandler.logMessage(this.getName() + " Version " + this.getVersionString() + " Initializing...");
    }

    public static CuriosAddon getInstance() {
        if (instance == null)
            instance = new CuriosAddon();
        return instance;
    }
}
