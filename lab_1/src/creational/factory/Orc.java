package creational.factory;

public class Orc implements Enemy{
    @Override
    public void attack(){
        System.out.println("Orc hits with a huge club! -20 HP");
    }
    @Override
    public void showStatus(){
        System.out.println("This is a wild Orc. He has a lot of health.");
    }
}
