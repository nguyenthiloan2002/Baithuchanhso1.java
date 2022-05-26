import java.util.Scanner;
import java.util.HashSet;

public class App54 {
    public static void main(String[] args) {
        HashSet<Integer> hashSetInt = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetInt.add(0);
        hashSetInt.add(1);
        hashSetInt.add(2);
        hashSetInt.add(3);
        System.out.println("Cac phan tu trong hashSetInt: " + hashSetInt);
        System.out.print("Nhap so phan tu can them: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu can them: ");
            int number = sc.nextInt();
            if (hashSetInt.contains(number))
                System.out.println("Phan tu " + number + " da ton tai.");
            else {
                hashSetInt.add(number);
                System.out.println("Them thanh cong.");
            }
        }
        System.out.println("Cac phan tu trong hashSetInt sau khi them: " + hashSetInt);
    }
}