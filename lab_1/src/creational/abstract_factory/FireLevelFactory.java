package creational.abstract_factory;

public class FireLevelFactory implements LevelFactory{
    public Monster createMonster(){
        return new FireDemon();
    }
    public Trap createTrap() {
        return new LavaPit();
    }
    public TreasureChest createChest() {
        return new FireChest();
    }
}
