package creational.abstract_factory;

public class IceChest implements TreasureChest{
    @Override
    public void open() {
        System.out.println("You break the ice on the chest. Inside is a frozen shield!");
    }
}
