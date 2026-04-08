package structural.decorator;

public class Sword implements Weapon{
    @Override
    public int getDamage(){
        return 10;
    }

    @Override
    public String getDescription(){
        return "Ordinary steel sword";
    }
}
