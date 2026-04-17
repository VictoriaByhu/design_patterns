package structural.composite;
import java.util.ArrayList;
import java.util.List;

public class Squad implements GameUnit {
    private List<GameUnit> units = new ArrayList<>();

    public void addUnit(GameUnit unit) {
        units.add(unit);
    }

    @Override
    public void move() {
        System.out.println("--- The squad begins to move. ---");
        for (GameUnit unit : units) {
            unit.move();
        }
        System.out.println("--- The squad arrived at the position. ---");
    }
}
