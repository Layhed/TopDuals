package topduals.topduals.core;

import org.bukkit.entity.Player;
import topduals.topduals.models.Duel;
import topduals.topduals.models.Result;

import java.util.HashMap;
import java.util.UUID;

public class DuelCore implements IDuelCore {

    private HashMap<UUID, Duel> duels;

    @Override
    public Result tryCreateDuel(Player owner, Player vs) {
        if(duels.get(owner.getUniqueId()) !=null || duels.get(vs.getUniqueId()) != null) {
            return new Result(false, "игроки уже в дуэли");
        }
        Duel duel = new Duel(owner, vs, "random_name");
        duels.put(owner.getUniqueId(), duel);
        duels.put(vs.getUniqueId(), duel);

        return new Result(true, "дуэль создана");
    }

    @Override
    public Result leaveDuel(Player player) {
        Duel duel = duels.get(player.getUniqueId());
        if(duel == null) {
            return new Result(false, "игрок не участвует в дуэли!");
        }
        Player enemy = duel.getEnemy(player);
        duels.remove(player.getUniqueId());
        duels.remove(enemy.getUniqueId());
        return new Result(true, "игрок покинул дуэль!");
    }

    @Override
    public Duel getDuel(Player player) {
        return duels.get(player.getUniqueId());
    }
}
