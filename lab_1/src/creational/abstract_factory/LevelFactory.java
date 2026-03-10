package creational.abstract_factory;

public interface LevelFactory {
    Monster createMonster();
    Trap createTrap();
    TreasureChest createChest();
}
