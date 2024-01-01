import java.util.Stack;

public class Longest_valid_parentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek()); 
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        Longest_valid_parentheses solution = new Longest_valid_parentheses();

        String s1 = "(()";
        System.out.println(solution.longestValidParentheses(s1)); // Output: 2

        String s2 = ")()())";
        System.out.println(solution.longestValidParentheses(s2)); // Output: 4

        String s3 = "";
        System.out.println(solution.longestValidParentheses(s3)); // Output: 0
    }
}
