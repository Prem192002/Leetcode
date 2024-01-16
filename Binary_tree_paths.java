import java.util.ArrayList;
import java.util.List;

public class Binary_tree_paths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        dfs(root, new ArrayList<>(), result);
        return result;
    }

    private void dfs(TreeNode node, List<String> path, List<String> result) {
        if (node == null) {
            return;
        }

        path.add(String.valueOf(node.val));

        if (node.left == null && node.right == null) {
            result.add(String.join("->", path));
        } else {
            dfs(node.left, path, result);
            dfs(node.right, path, result);
        }

        path.remove(path.size() - 1); 
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        Binary_tree_paths solution = new Binary_tree_paths();

        // Example 1
        TreeNode root1 = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));
        List<String> paths1 = solution.binaryTreePaths(root1);
        System.out.println(paths1);  // Output: ["1->2->5", "1->3"]

        // Example 2
        TreeNode root2 = new TreeNode(1);
        List<String> paths2 = solution.binaryTreePaths(root2);
        System.out.println(paths2);  // Output: ["1"]
    }
}
