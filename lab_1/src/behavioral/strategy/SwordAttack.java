package behavioral.strategy;

public class SwordAttack implements AttackStrategy{
    public void attack() {
        System.out.println("Strikes with a sword! -10 HP");
    }
}
