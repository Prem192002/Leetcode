import java.util.*;
class Happy_number {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
       while (n != 1 && !seen.contains(n)) {
           seen.add(n);
           n = digitSquareSum(n);
       }
       return n == 1;
   }

   private int digitSquareSum(int n) {
       int sum = 0;
       while (n > 0) {
           int digit = n % 10;
           sum += digit * digit;
           n /= 10;
       }
       return sum;
   }
}
