import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class App108 {
    public static void main(String[] args) {
        TreeMap<Integer, Character> treeMap = new TreeMap<>();
        treeMap.put(6, 'A');
        treeMap.put(5, 'B');
        treeMap.put(1, 'C');
        Set<Map.Entry<Integer, Character>> setTreeMap = treeMap.entrySet();
        System.out.println("Cac entry co trong setTreeMap: " + setTreeMap);
    }
}
