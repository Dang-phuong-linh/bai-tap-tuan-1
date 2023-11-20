public public static int calculateEvenDivisorSum(int n) {
  int sum = 0;
  
  for (int i = 1; i <= n; i++) {
      if (n % i == 0 && i % 2 == 0) {
          sum += i;
      }
  }
  
  return sum;
}

public static void main(String[] args) {
  int n = 12;
  int evenDivisorSum = calculateEvenDivisorSum(n);
  System.out.println("Tổng các ước số chẵn của " + n + " là " + evenDivisorSum);
} {
  
}
