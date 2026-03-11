package creational.builder;

public class LevelBuilder{
    protected String name;
    protected int width = 100;
    protected int height = 100;
    protected int enemyCount = 0;
    protected String weatherEffect = "Sunny";
    protected String ambientMusic = "None";
    protected boolean hasBoss = false;

    public LevelBuilder(String name) {
        this.name = name;
    }

    public LevelBuilder withSize(int width, int height) {
        this.width = width;
        this.height = height;
        return this;
    }

    public LevelBuilder withEnemies(int count) {
        this.enemyCount = count;
        return this;
    }

    public LevelBuilder withWeather(String weather) {
        this.weatherEffect = weather;
        return this;
    }

    public LevelBuilder withBoss() {
        this.hasBoss = true;
        return this;
    }

    public Level build() {
        return new Level(this);
    }
}
