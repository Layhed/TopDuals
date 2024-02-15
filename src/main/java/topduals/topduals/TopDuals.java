package topduals.topduals;

import org.bukkit.plugin.java.JavaPlugin;

public final class TopDuals extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

    }

    @Override
    public void onDisable() {
        saveDefaultConfig();
        getConfig();
    }
}
