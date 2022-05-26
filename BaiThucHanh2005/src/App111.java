import java.util.LinkedList;
import java.util.Scanner;

public class App111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> listInt = new LinkedList<>();

        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            int e = sc.nextInt();
            listInt.add(e);
        }

        int s = 0, c = 0;
        float a = 0;
        for (int i : listInt) {
            if (i % 2 == 0) {
                s += i;
                c++;
            }
        }
        System.out.println("Trung binh cong = " + (a = s / c));
    }
}
