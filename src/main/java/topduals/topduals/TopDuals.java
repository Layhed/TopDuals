package topduals.topduals;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class TopDuals extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

    }

    @Override
    public void onDisable() {
        saveDefaultConfig();
        Player layhed = Bukkit.getPlayer("Layhed");
        layhed.sendMessage("test");
    }
}
