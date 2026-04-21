package behavioral.strategy;

public class SpellAttack implements AttackStrategy{
    public void attack() {
        System.out.println("Releases a fireball! -20 HP");
    }
}
