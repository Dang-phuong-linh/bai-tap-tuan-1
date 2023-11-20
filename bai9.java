//Bài 9: Tính T(n) = 1 x 2 x 3…x N

import java.util.Scanner;
public class bai9 {
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
        System.out.println("So nguyen n ban vua nhap la: "+ n);
        long T = 1;
        int i=1;
        while (i<=n) {
                T=T*i;
                i++;
            }

        System.out.println("Tich T(" + n + ") = " + T);
    }
}