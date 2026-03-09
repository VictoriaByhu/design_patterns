package creational.factory_method;

public class DesertWorld extends GameWorld{
    @Override
    public Vehicle spawnVehicle(){
        return new DuneBuggy();
    }
}

