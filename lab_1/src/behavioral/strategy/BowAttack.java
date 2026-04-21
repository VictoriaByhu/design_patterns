package behavioral.strategy;

public class BowAttack implements AttackStrategy{
    public void attack() {
        System.out.println("Shoots a bow! -5 HP");
    }
}
