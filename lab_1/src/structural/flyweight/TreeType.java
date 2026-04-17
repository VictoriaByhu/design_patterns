package structural.flyweight;

public class TreeType {
    private String name;
    private String color;
    private String textureData;

    public TreeType(String name, String color, String textureData) {
        this.name = name;
        this.color = color;
        this.textureData = textureData;
    }

    public void draw(int x, int y) {
        System.out.println("Draw " + name + " at the point (" + x + "," + y + ")");
    }
}
