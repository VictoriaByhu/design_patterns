package behavioral.memento;

public class MementoHero { // Нова унікальна назва
    private String level;
    private int health;

    // Метод, який ти викликаєш у Main
    public void set(String level, int health) {
        this.level = level;
        this.health = health;
        System.out.println("Hero on the stand: " + level + ", HP: " + health);
    }

    public GameSave save() {
        return new GameSave(level, health);
    }

    public void load(GameSave save) {
        this.level = save.level; // Прямий доступ або через геттер
        this.health = save.health;
        System.out.println("--- Status restored: " + level + " ---");
    }
}
