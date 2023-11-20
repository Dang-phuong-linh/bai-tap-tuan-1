import java.util.Scanner;

public class bai14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị x: ");
        double x = scanner.nextDouble();

        System.out.print("Nhập giá trị n: ");
        int n = scanner.nextInt();

        double ketQua = tinhSn(x, n);

        System.out.println("Giá trị của S(n) là: " + ketQua);

        scanner.close();
    }

    public static double tinhSn(double x, int n) {
        double sn = 0.0;

        for (int i = 0; i <= n; i++) {
            sn += Math.pow(x, 2 * i + 1);
        }

        return sn;
    }
}
