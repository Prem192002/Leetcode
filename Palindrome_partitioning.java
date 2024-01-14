import java.util.ArrayList;
import java.util.List;

public class Palindrome_partitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, s, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, String s, List<String> path, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String currentSubstring = s.substring(start, end);
            if (isPalindrome(currentSubstring)) {
                path.add(currentSubstring);
                backtrack(end, s, path, result);
                path.remove(path.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    // Example usage:
    public static void main(String[] args) {
        Palindrome_partitioning  solution = new Palindrome_partitioning ();
        String s1 = "aab";
        System.out.println(solution.partition(s1));  // Output: [["a","a","b"],["aa","b"]]

        String s2 = "a";
        System.out.println(solution.partition(s2));  // Output: [["a"]]
    }
}
