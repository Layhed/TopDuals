package topduals.topduals.core;

import org.bukkit.entity.Player;
import topduals.topduals.models.Duel;
import topduals.topduals.models.Result;

public interface IDuelCore {
    Result tryCreateDuel(Player owner, Player vs);
    Result leaveDuel(Player player);
    Duel getDuel(Player player);
}
