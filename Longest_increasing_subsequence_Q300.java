import java.util.*;
public class Longest_increasing_subsequence_Q300 {
        public static int lengthOfLIS(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
    
            int n = nums.length;
            int[] dp = new int[n];
            int maxLen = 1;
    
            for (int i = 0; i < n; i++) {
                dp[i] = 1; // Initialize each element with a minimum length of 1
    
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
    
                maxLen = Math.max(maxLen, dp[i]);
            }
    
            return maxLen;
        }
    
        public static void main(String[] args) {
            int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
            System.out.println("Example 1: " + lengthOfLIS(nums1)); // Output: 4
    
            int[] nums2 = {0, 1, 0, 3, 2, 3};
            System.out.println("Example 2: " + lengthOfLIS(nums2)); // Output: 4
    
            int[] nums3 = {7, 7, 7, 7, 7, 7, 7};
            System.out.println("Example 3: " + lengthOfLIS(nums3)); // Output: 1
        }
}
