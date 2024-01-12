public class Decode_Ways {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0 || s.charAt(0) == '0') {
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));
            if (10 <= twoDigits && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }

    // Test cases
    public static void main(String[] args) {
        Decode_Ways solution = new Decode_Ways();
        System.out.println(solution.numDecodings("12"));  // Output: 2
        System.out.println(solution.numDecodings("226")); // Output: 3
        System.out.println(solution.numDecodings("06"));  // Output: 0
    }
}
