package creational.abstract_factory;

public class IceLevelFactory implements LevelFactory{
    public Monster createMonster(){
        return new IceGolem();
    }
    public Trap createTrap(){
        return new SpikyIce();
    }
    public TreasureChest createChest(){
        return new IceChest();
    }
}
