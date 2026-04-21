package behavioral.strategy;

public class Hero {
    private AttackStrategy strategy;

    public void setStrategy(AttackStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeAttack() {
        if (strategy == null) {
            System.out.println("Герой не може битися без зброї!");
        } else {
            strategy.attack();
        }
    }
}
