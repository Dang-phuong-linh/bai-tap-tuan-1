import java.util.Scanner;

public class bai11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị n: ");
        int n = scanner.nextInt();

        long ketQua = tinhSn(n);

        System.out.println("Giá trị của S(n) là: " + ketQua);

        scanner.close();
    }

    public static long tinhSn(int n) {
        long sn = 0;
        long tich = 1;

        for (int i = 1; i <= n; i++) {
            tich *= i;
            sn += tich;
        }

        return sn;
    }
}
