package behavioral.visitor;

public interface Visitor {
    void visit(Warship warship);
    void visit(CivilianShip civilianShip);
}
