package creational.factory;

public class Ghost implements Enemy{
    @Override
    public void attack(){
        System.out.println("A ghost passes through you... -10 MP");
    }
    @Override
    public void showStatus(){
        System.out.println("This is a ghost. It's hard to strike him with a physical weapon.");
    }
}
