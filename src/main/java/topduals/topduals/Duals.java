package topduals.topduals;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import sun.management.Sensor;

public class Duals implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
        }
        if (args.length < 1) {
            return true;
        }
        String name = args[0];
        Player enemy = Bukkit.getPlayer(name);

        return true;
    }
}
