public class Missing_number_Q268 {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
       
       int expectedSum = n * (n + 1) / 2;
       int actualSum = 0;
       for (int num : nums) {
           actualSum += num;
       }

       return expectedSum - actualSum;
   }
   public static void main(String[] args) {
        int[] nums1 = {3, 0, 1};
        System.out.println("Output for nums1: " + missingNumber(nums1)); 

        int[] nums2 = {0, 1};
        System.out.println("Output for nums2: " + missingNumber(nums2));
}
}
