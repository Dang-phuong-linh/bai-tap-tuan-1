//Bài 7: Tính S(n) = 1/2 + 2/3 + 3/4 + …. + n / n + 1

import java.util.Scanner;
public class bai7 {
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
        double sum = 0;
        float i=1.0f;
        while (i<=n) {
                sum = sum + i/(i+1);
                i++;
            }

        System.out.println("Tong S(" + n + ") = " + sum);
    }
}