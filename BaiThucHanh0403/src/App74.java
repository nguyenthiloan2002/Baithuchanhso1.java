import java.util.Scanner;

public class App74 {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so phan tu cua mang: ");
            n = scanner.nextInt();
        } while (n < 0);
        int A[] = new int[n];
        System.out.println("Nhap cac phan tu cho mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu "+i + ": ");
            A[i] = scanner.nextInt();
        }
    }
}
