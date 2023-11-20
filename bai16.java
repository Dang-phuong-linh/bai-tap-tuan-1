import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap vao gia tri cua x: ");
    int x = sc.nextInt();
    System.out.println("nhap vao gia tri cua n: ");
    int n = sc.nextInt();

    double sum = 0.0;
    double A = 0.0;
    double B = 0.0;

    for (int i = 1; i <= n; i++) {
        A=Math.pow(x,i);
        B=B+i;
        sum+=A/B;
    }
    System.out.println("S(n)= "+sum);

}
}
