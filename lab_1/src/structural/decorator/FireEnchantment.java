package structural.decorator;

public class FireEnchantment extends WeaponDecorator{
    public FireEnchantment(Weapon weapon){
        super(weapon);
    }

    @Override
    public int getDamage(){
        return super.getDamage() + 5;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", with ignite effect";
    }
}
