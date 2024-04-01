public class sum_root_to_leaf_number {
    public int sumNumbers(TreeNode root) {
        int sum = 0;
    
    // Call the helper function to start the DFS traversal
    sum = dfs(root, 0);
    
    return sum;
  }

  private int dfs(TreeNode node, int currentSum) {
    if (node == null) {
      return 0;
    }

    currentSum = currentSum * 10 + node.val;
    if (node.left == null && node.right == null) {
      return currentSum;
    }

    int leftSum = dfs(node.left, currentSum);
    int rightSum = dfs(node.right, currentSum);

    return leftSum + rightSum;
    }
}
