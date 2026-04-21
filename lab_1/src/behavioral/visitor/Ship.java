package behavioral.visitor;

public interface Ship {
    void accept(Visitor visitor);
}
