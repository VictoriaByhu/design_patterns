package creational.abstract_factory;

public class GameArea {
    private Monster monster;
    private Trap trap;
    private TreasureChest chest;

    public GameArea(LevelFactory factory) {
        this.monster = factory.createMonster();
        this.trap = factory.createTrap();
        this.chest = factory.createChest();
    }

    public void play() {
        monster.roar();
        trap.activate();
        chest.open();
    }
}
