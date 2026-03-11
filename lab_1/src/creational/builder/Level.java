package creational.builder;

public class Level {
    private final String name;
    private final int width;
    private final int height;
    private final int enemyCount;
    private final String weatherEffect;
    private final String ambientMusic;
    private final boolean hasBoss;

    Level(LevelBuilder builder) {
        this.name = builder.name;
        this.width = builder.width;
        this.height = builder.height;
        this.enemyCount = builder.enemyCount;
        this.weatherEffect = builder.weatherEffect;
        this.ambientMusic = builder.ambientMusic;
        this.hasBoss = builder.hasBoss;
    }

    @Override
    public String toString() {
        return "Level: " + name + " [" + width + "x" + height + "], Enemies: " + enemyCount +
                ", Weather: " + weatherEffect + ", Music: " + ambientMusic + ", Boss: " + hasBoss;
    }
}
