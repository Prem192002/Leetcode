import java.util.Stack;

public class simplify_path {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        for (String component : components) {
            if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!component.isEmpty() && !component.equals(".")) {
                stack.push(component);
            }
        }

        StringBuilder result = new StringBuilder("/");
        for (String dir : stack) {
            result.append(dir).append("/");
        }
        if (result.length() > 1) {
            result.deleteCharAt(result.length() - 1);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        simplify_path solution = new simplify_path();
        System.out.println(solution.simplifyPath("/home/"));      // Output: "/home"
        System.out.println(solution.simplifyPath("/../"));        // Output: "/"
        System.out.println(solution.simplifyPath("/home//foo/"));  // Output: "/home/foo"
    }
}
