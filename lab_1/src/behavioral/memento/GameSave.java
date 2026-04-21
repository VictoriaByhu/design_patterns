package behavioral.memento;

public class GameSave {
    public final String level; // public для простоти прикладу
    public final int health;

    public GameSave(String level, int health) {
        this.level = level;
        this.health = health;
    }
}
