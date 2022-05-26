import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class App112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        String ten, thongtin = null;
        double diem;
        do {
            System.out.print("Nhap ten sinh vien: ");
            ten = sc.nextLine();
            if (!ten.isEmpty()) {
                System.out.print("Nhap diem sinh vien: ");
                diem = sc.nextDouble();
                sc.nextLine();
                thongtin = ten + "\t" + diem;
                list.add(thongtin);
            }
        } while (!ten.isEmpty());

        System.out.print("So sinh vien co trong danh sach: " + list.size());
        System.out.print("\nThong tin cac sinh vien: ");
        System.out.println("\nTen sinh vien" + "\t" + "diem ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}