import java.util.Scanner;

public class bai19 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao gia tri cua x: ");
        int x = sc.nextInt();
        System.out.println("nhap vao gia tri cua n: ");
        int n = sc.nextInt();
        if (n<0){
            System.out.println("nhap lai gia tri n:");
        }while(n<=0);

    double sum = 1.0;
    int giaithua=1;

    for (int i=1; i<=n; i++) {
        giaithua*=(2 * i + 1) * (2 * i);
        sum= sum+x+ Math.pow(x,2*i+1)/giaithua;
    }
    System.out.println("S(n) = "+sum);
    }
}
