import java.util.Arrays;

public class Maximum_gap_Q164 {
     public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }

        Arrays.sort(nums);
        int maxGap = 0;
        for (int i = 1; i < nums.length; i++) {
            maxGap = Math.max(maxGap, nums[i] - nums[i - 1]);
        }

        return maxGap;
    }

    public static void main(String[] args){
         Maximum_gap_Q164 solution = new  Maximum_gap_Q164();

        int[] nums1 = {3, 6, 9, 1};
        System.out.println("Example 1: " + solution.maximumGap(nums1));

        int[] nums2 = {10};
        System.out.println("Example 2: " + solution.maximumGap(nums2));
    }
}
