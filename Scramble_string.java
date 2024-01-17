import java.util.*;


public class Scramble_string {
    public boolean isScramble(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        if (!Arrays.equals(s1Array, s2Array)) {
            return false;
        }
        Map<String, Boolean> memo = new HashMap<>();
        return scrambleHelper(s1, s2, memo);
    }

    private boolean scrambleHelper(String x, String y, Map<String, Boolean> memo) {
        String key = x + "-" + y;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if (x.equals(y)) {
            memo.put(key, true);
            return true;
        }
        for (int i = 1; i < x.length(); i++) {
            if ((scrambleHelper(x.substring(0, i), y.substring(0, i), memo) &&
                 scrambleHelper(x.substring(i), y.substring(i), memo)) ||
                (scrambleHelper(x.substring(0, i), y.substring(y.length() - i), memo) &&
                 scrambleHelper(x.substring(i), y.substring(0, y.length() - i), memo))) {
                memo.put(key, true);
                return true;
            }
        }

        memo.put(key, false);
        return false;
    }
    public static void main(String[] args) {
        Scramble_string solution = new Scramble_string();
        String s1 = "great";
        String s2 = "rgeat";
        System.out.println(solution.isScramble(s1, s2));  // Output: true

        s1 = "abcde";
        s2 = "caebd";
        System.out.println(solution.isScramble(s1, s2));  // Output: false

        s1 = "a";
        s2 = "a";
        System.out.println(solution.isScramble(s1, s2));  // Output: true
    }
}
