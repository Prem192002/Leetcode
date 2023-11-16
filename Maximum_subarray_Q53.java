public class Maximum_subarray_Q53 {
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
           
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
        
    
    public static void main(String[] args0){
        int[] num={0,1,0,1,1,0,1,0,1};
        int result=maxSubArray(num);
        System.out.println(result);
    }
    
}
