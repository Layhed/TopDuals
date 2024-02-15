package topduals.topduals;

import org.bukkit.command.CommandExecutor;
import org.bukkit.material.Command;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("duals").setExecutor(new Duals());
    }

    @Override
    public void onDisable() {
    }
}
