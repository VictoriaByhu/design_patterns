package behavioral.visitor;

public class Warship implements Ship {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void checkWeapons() {
        System.out.println("Checking guns on a warship...");
    }
}
