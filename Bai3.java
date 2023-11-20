
//Bài 3: Tính S(n) = 1 + ½ + 1/3 + … + 1/n

import java.util.Scanner;
public class Bai3 {
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
                sum = sum + 1.0f/i;
                i++;
            }

        System.out.println("Tong S(" + n + ") = " + sum);
    }
}
