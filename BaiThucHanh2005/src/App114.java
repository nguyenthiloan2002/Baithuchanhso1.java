import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class App114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hashMap = new HashMap<>();
        String msv, hoten;
        System.out.print("Nhap so sinh vien can nhap: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + i);
            System.out.print("Nhap ma sinh vien: ");
            msv = sc.nextLine();
            System.out.print("\nNhap ho ten sinh vien: ");
            hoten = sc.nextLine();
            hashMap.put(msv, hoten);
        }
        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}
