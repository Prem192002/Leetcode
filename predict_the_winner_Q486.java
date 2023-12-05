public class predict_the_winner_Q486 {
     public static boolean predictTheWinner(int[] nums) {
        int length = nums.length;
        int[][] dp = new int[length][length];

        for (int i = 0; i < length; i++) {
            dp[i][i] = nums[i];
        }

        for (int len = 2; len <= length; len++) {
            for (int i = 0; i <= length - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
            }
        }

        return dp[0][length - 1] >= 0;
    }
    public static void main(String[] args){
        int[] nums1 = {1, 5, 2};
        System.out.println(predictTheWinner(nums1)); 

        int[] nums2 = {1, 5, 233, 7};
        System.out.println(predictTheWinner(nums2));
    }
}
