import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao gia tri cua x: ");
        int x = sc.nextInt();
        System.out.println("nhap vao gia tri cua n: ");
        int n = sc.nextInt();
        if (n<0){
            System.out.println("nhap lai gia tri n:");
        }while(n<=0);

        double sum=0.0 ;
        int giaithua = 1 ;

        for (int i=1; i<=n; i++){
            giaithua*=i;
            sum+=Math.pow(x,i)/giaithua;
        }
        System.out.println("S(n) = " + sum);
    
    }
}
