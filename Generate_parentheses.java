import java.util.ArrayList;
import java.util.List;

public class Generate_parentheses {
     public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, "", n, n);
        return result;
    }

    private void generate(List<String> result, String partial, int left, int right) {
        if (left == 0 && right == 0) {
            result.add(partial);
            return;
        }
        if (left > 0) {
            generate(result, partial + '(', left - 1, right);
        }
        if (right > left) {
            generate(result, partial + ')', left, right - 1);
    }
    }
    public static void main(String[] args) {
        Generate_parentheses solution = new Generate_parentheses();

        // Example 1
        int n1 = 3;
        List<String> result1 = solution.generateParenthesis(n1);
        System.out.println(result1);  // Output: ["((()))", "(()())", "(())()", "()(())", "()()()"]

        // Example 2
        int n2 = 1;
        List<String> result2 = solution.generateParenthesis(n2);
        System.out.println(result2);  // Output: ["()"]
    }

}
