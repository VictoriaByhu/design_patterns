package structural.decorator;

public class SharpnessEnchantment extends WeaponDecorator{
    public SharpnessEnchantment(Weapon weapon){
        super(weapon);
    }

    @Override
    public int getDamage(){
        return super.getDamage() + 3;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", very sharp";
    }
}
