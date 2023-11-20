public class bai22 {
  public static long calculateDivisorProduct(int n) {
    long product = 1;
    
    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            product *= i;
        }
    }
    
    return product;
}

public static void main(String[] args) {
    int n = 12;
    long divisorProduct = calculateDivisorProduct(n);
    System.out.println("Tích các ước số của " + n + " là " + divisorProduct);
}
}
