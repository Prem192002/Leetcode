public class Climbing_stairs {
    public int climbStairs(int n) {
        if (n == 1)
           return 1;
       if (n == 2)
           return 2;
       
       int[] dp = new int[n + 1];
       dp[1] = 1;
       dp[2] = 2;
       
       for (int i = 3; i <= n; i++) {
           dp[i] = dp[i-1] + dp[i-2];
       }
       
       return dp[n];
   }
   public static void main(String[] args) {
    Climbing_stairs solution = new Climbing_stairs();
    
    int n1 = 2;
    System.out.println("Ways to climb " + n1 + " stairs: " + solution.climbStairs(n1));
    
    int n2 = 3;
    System.out.println("Ways to climb " + n2 + " stairs: " + solution.climbStairs(n2));
}

}
