package creational.factory_method;

public abstract class GameWorld {
    public abstract Vehicle spawnVehicle();

    public void startJourney(){
        Vehicle v = spawnVehicle();
        System.out.println("Your journey's started!");
        v.move();
    }
}
