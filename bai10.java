public class bai10 {
    public static double calculatePower(double x, int n) {
        if (n == 0) {
            return 1;
        }
        
        double result = 1;
        
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result *= x;
            }
        } else {
            for (int i = 1; i <= -n; i++) {
                result /= x;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        double x = 2.5;
        int n = 3;
        double result = calculatePower(x, n);
        System.out.println(x + " ^ " + n + " = " + result);
    }
}