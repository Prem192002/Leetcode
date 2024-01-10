import java.util.List;

public class Word_break {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        // dp[i] represents whether the substring s.substring(0, i) can be segmented into words from the dictionary
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;  // Empty string can always be segmented

        for (int i = 1; i <= n; i++) {
            for (String word : wordDict) {
                if (i - word.length() >= 0 && dp[i - word.length()] && s.substring(i - word.length(), i).equals(word)) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }

    // Example usage:
    public static void main(String[] args) {
        Word_break solution = new Word_break();

        String s1 = "leetcode";
        List<String> wordDict1 = List.of("leet", "code");
        System.out.println(solution.wordBreak(s1, wordDict1));  // Output: true

        String s2 = "applepenapple";
        List<String> wordDict2 = List.of("apple", "pen");
        System.out.println(solution.wordBreak(s2, wordDict2));  // Output: true

        String s3 = "catsandog";
        List<String> wordDict3 = List.of("cats", "dog", "sand", "and", "cat");
        System.out.println(solution.wordBreak(s3, wordDict3));  // Output: false
    }
}
