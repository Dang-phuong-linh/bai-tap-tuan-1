public class bai23 {
  public static int countDivisors(int n) {
    int count = 0;
    
    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            count++;
        }
    }
    
    return count;
}

public static void main(String[] args) {
    int n = 12;
    int divisorCount = countDivisors(n);
    System.out.println("Số lượng ước số của " + n + " là " + divisorCount);
}
}
