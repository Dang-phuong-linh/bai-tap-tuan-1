//Bài 2: Tính S(n) = 1^2 + 2^2 + … + n^2

import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
            int n;
            System.out.print("Nhap vao so nguyen n: ");
            do{ 
                Scanner scanner = new Scanner(System.in);
                n = scanner.nextInt();
                if(n<1){
                    System.out.print("Hay nhap lai so nguyen n (n>=1): ");
                }
            }while(n<1);
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i*i;
        }
        
        System.out.println("Tong S(" + n + ") = " + sum);
    }
}