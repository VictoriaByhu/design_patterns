package creational.factory_method;

public class WaterWorld extends GameWorld{
    @Override
    public Vehicle spawnVehicle(){
        return new SpeedBoat();
    }
}
