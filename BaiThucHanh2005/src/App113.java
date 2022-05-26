import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class App113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();
        String traicay;
        System.out.print("Nhap so trai cay: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap loai trai cay thu " + i + ": ");
            traicay = sc.nextLine();
            hashSet.add(traicay);
        }
        System.out.print("\nSo trai cay co trong hashSet la: " + hashSet.size());

        System.out.print("\nNhap loai trai cay can tim: ");
        String timtraicay = sc.nextLine();
        if (hashSet.contains(timtraicay))
            System.out.println("Co " + timtraicay + " trong hashSet");
        else
            System.out.println("Khong co " + timtraicay + " trong hashSet");

        System.out.print("Nhap loai trai cay can xoa: ");
        String xoatraicay = sc.nextLine();
        if (hashSet.contains(xoatraicay))
            hashSet.remove(xoatraicay);
        System.out.print("Cac phan tu con lai trong hashSet: " + hashSet);

        List<String> list = new ArrayList<>();
        list.add("dua");
        list.add("nho");
        list.add("tao");
        hashSet.addAll(list);
        System.out.print("\nTrai cay co trong hashSet sau khi them: ");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + "\t");
        hashSet.removeAll(list);
        System.out.print("\nCac phan tu co trong hashSet sau khi xoa: " + hashSet);
    }
}
