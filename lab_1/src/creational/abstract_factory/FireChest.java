package creational.abstract_factory;

public class FireChest implements TreasureChest{
    @Override
    public void open() {
        System.out.println("You open a hot metal chest. Inside is a flaming sword!");
    }
}
