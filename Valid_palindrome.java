import java.util.Arrays;
import java.util.Stack;

class Valid_palindrome{
    public boolean isPalindrome(String s) {
        // Convert the string to lowercase and remove non-alphanumeric characters
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        s = sb.toString();

        // Check if the string is the same forwards and backwards
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Example 1
        Valid_palindrome Solution = new Valid_palindrome();
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(Solution.isPalindrome(s1));  // Output: true

        // Example 2
        String s2 = "race a car";
        System.out.println(Solution.isPalindrome(s2));  // Output: false

        // Example 3
        String s3 = " ";
        System.out.println(Solution.isPalindrome(s3));  // Output: true
    }
}