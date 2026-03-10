package creational.abstract_factory;

public class GameArea {
    private Monster monster;
    private Trap trap;

    public GameArea(LevelFactory factory) {
        this.monster = factory.createMonster();
        this.trap = factory.createTrap();
    }

    public void play() {
        monster.roar();
        trap.activate();
    }
}
