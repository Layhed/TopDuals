package topduals.topduals.models;

import org.bukkit.entity.Player;

public class Duel {
    private final Player owner;
    private final Player enemy;
    private final String name;
    private Player winner;

    public Duel(Player owner, Player enemy, String name) {
        this.owner = owner;
        this.enemy = enemy;
        this.name = name;
    }

    public void SetWinner(Player player) {
        winner = player;
    }

    public Player getOwner() {
        return owner;
    }

    public Player getEnemy() {
        return enemy;
    }

    public String getName() {
        return name;
    }

    public Player getWinner() {
        return winner;
    }
}
