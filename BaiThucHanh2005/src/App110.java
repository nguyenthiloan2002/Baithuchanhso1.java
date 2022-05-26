import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class App110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listInt = new ArrayList<>();

        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            int e = sc.nextInt();
            listInt.add(e);
        }

        System.out.println("\n--- Tim so nguyen co gia tri lon nhat ---");
        int max = listInt.get(0);
        for (int a : listInt)
            if (a > max)
                max = a;
        System.out.println("So nguyen co gia tri lon nhat: " + max);

        System.out.println("\n--- Xoa khoi mang cac phan tu bang gia tri vua nhap ---");
        System.out.print("Nhap 1 so nguyen: ");
        int num = sc.nextInt();
        if (listInt.contains(num))
            listInt.removeAll(Arrays.asList(num));
        System.out.println("Sau khi xoa: " + listInt);

        System.out.println("\n--- Sap xep day so ---");
        listInt.sort(Comparator.comparingInt(o -> o));
        System.out.print("Sau khi sap xep: " + listInt);
    }
}