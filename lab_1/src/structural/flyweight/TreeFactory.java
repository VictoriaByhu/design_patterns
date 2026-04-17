package structural.flyweight;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String textureData) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, textureData);
            treeTypes.put(name, result);
        }
        return result;
    }
}
