import java.util.Scanner;

public class bai15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập một số nguyên dương n: ");
        int n = scanner.nextInt();
        
        System.out.println("Các ước số của " + n + " là:");
        lietKeUocSo(n);
        
        scanner.close();
    }

    public static void lietKeUocSo(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}