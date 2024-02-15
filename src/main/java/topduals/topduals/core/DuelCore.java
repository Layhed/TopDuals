package topduals.topduals.core;

import org.apache.commons.lang.NotImplementedException;
import org.bukkit.entity.Player;
import topduals.topduals.models.Duel;
import topduals.topduals.models.Result;

import java.util.HashMap;
import java.util.UUID;

public class DuelCore implements IDuelCore {

    public HashMap<UUID, Duel> duels;

    @Override
    public Result tryCreateDuel(Player owner, Player vs) {
        throw new NotImplementedException("Not supported yet");

    }

    @Override
    public Result leaveDuel(Player player) {
        throw new NotImplementedException("Not supported yet");

    }

    @Override
    public Duel getDuel(Player player) {
        throw new NotImplementedException("Not supported yet");

    }
}
