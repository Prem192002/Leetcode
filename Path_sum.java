class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Path_sum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum - root.val == 0;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        // Set the target sum
        int targetSum1 = 22;
        int targetSum2 = 5;
        int targetSum3 = 0;

        // Create an instance of the Solution class
        Path_sum solution = new Path_sum();

        // Test cases
        System.out.println(solution.hasPathSum(root, targetSum1));  // Output: true
        System.out.println(solution.hasPathSum(root, targetSum2));  // Output: false
        System.out.println(solution.hasPathSum(null, targetSum3));  // Output: false
    }
}