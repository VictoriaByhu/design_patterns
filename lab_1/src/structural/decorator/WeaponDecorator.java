package structural.decorator;

public abstract class WeaponDecorator implements Weapon {
    protected Weapon decoratedWeapon;

    public WeaponDecorator(Weapon weapon){
        this.decoratedWeapon = weapon;
    }

    public int getDamage(){
        return decoratedWeapon.getDamage();
    }

    public String getDescription(){
        return decoratedWeapon.getDescription();
    }
}
