//Bài 8: Tính S(n) = 1/2 + 3/4 + 5/6 + … + 2n + 1/ 2n + 2

import java.util.Scanner;
public class bai8 {
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
        float i=0.0f;
        while (i<=n) {
                sum = sum + ((2*i)+1)/(2*i+2);
                i++;
            }

        System.out.println("Tong S(" + n + ") = " + sum);
    }
}