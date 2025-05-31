package FlyweightDesignPattern.TreeExample;
import java.util.HashMap;

class TreeFactory {
    static HashMap<String, TreeType> types = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "-" + color + "-" + texture;
        if (!types.containsKey(key)) {
            types.put(key, new TreeType(name, color, texture));
            System.out.println("New TreeType created: " + key);
        }
        return types.get(key);
    }
}

