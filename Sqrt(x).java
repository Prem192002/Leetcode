public class Sqrt(x) {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
           return x;
       }
       long left = 1, right = x;
       while (left <= right) {
           long mid = left + (right - left) / 2;
           if (mid * mid == x) {
               return (int)mid;
           } else if (mid * mid < x) {
               left = mid + 1;
           } else {
               right = mid - 1;
           }
       }
       return (int)right;
   }
   public static void main(String[] args) {
    mySqrt sol = new mySqrt();
    
    // Test cases
    System.out.println(sol.mySqrt(4));  // Output: 2
    System.out.println(sol.mySqrt(8));  // Output: 2
}
}
