import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class App86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("CSLT", "Co so lap trinh");
        hashMap.put("C++", "C++");
        hashMap.put("Java", "Java");
        System.out.print("Nhap so phan tu can them: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu can them: ");
            System.out.print("Nhap key: ");
            String key = sc.nextLine();
            System.out.print("Nhap value: ");
            String value = sc.nextLine();
            if (hashMap.containsKey(key))
                System.out.print("Da ton tai " + key);
            else {
                hashMap.put(key, value);
                System.out.print("Them thanh cong.");
            }
        }
        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
        System.out.println("Cac entry co trong setHashMap: " + setHashMap);
    }
}
