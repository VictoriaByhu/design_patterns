package behavioral.visitor;

public class Inspector implements Visitor {
    @Override
    public void visit(Warship warship) {
        System.out.print("Inspector on the bridge: ");
        warship.checkWeapons();
    }

    @Override
    public void visit(CivilianShip civilianShip) {
        System.out.print("Port inspector: ");
        civilianShip.checkCargo();
    }
}
