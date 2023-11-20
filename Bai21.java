public class Bai21 {
    public static int calculateDivisorSum(int n) {
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        int n = 12;
        int divisorSum = calculateDivisorSum(n);
        System.out.println("Tổng các ước số của " + n + " là " + divisorSum);
    }
}