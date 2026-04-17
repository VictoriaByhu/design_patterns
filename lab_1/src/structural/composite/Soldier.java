package structural.composite;

public class Soldier implements GameUnit {
    private String name;

    public Soldier(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Soldier " + name + " steps forward.");
    }
}
