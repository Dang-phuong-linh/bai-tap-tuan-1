public class bai24 {
  public static void listOddDivisors(int n) {
    System.out.print("Các ước số lẻ của " + n + ": ");
    
    for (int i = 1; i <= n; i++) {
        if (n % i == 0 && i % 2 == 1) {
            System.out.print(i + " ");
        }
    }
    
    System.out.println();
}

public static void main(String[] args) {
    int n = 12;
    listOddDivisors(n);
}
}
