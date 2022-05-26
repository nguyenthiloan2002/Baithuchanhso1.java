import java.util.LinkedHashMap;
import java.util.Map;

public class App94 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<Integer, String>();
        hashMap.put(100, "Mo");
        hashMap.put(101, "Dia");
        hashMap.put(102, "Chat");
        for (Map.Entry<Integer, String> map : hashMap.entrySet())
            System.out.println(map.getKey() + " " + map.getValue());
        System.out.println("Before invoking remove method: " + hashMap);
        hashMap.remove(101);
        System.out.println("After invoking remove method: " + hashMap);
    }
}
