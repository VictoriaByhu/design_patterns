package behavioral.visitor;

public class CivilianShip implements Ship {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void checkCargo() {
        System.out.println("Inspection of the cargo compartment of a civilian vessel...");
    }
}
