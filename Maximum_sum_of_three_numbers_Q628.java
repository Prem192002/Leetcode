import java.util.Arrays;

public class Maximum_sum_of_three_numbers_Q628 {
    public static int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int option2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(option1, option2);
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {-1, -2, -3};

        System.out.println("Example 1: " + maximumProduct(nums1));
        System.out.println("Example 2: " + maximumProduct(nums2));
        System.out.println("Example 3: " + maximumProduct(nums3));
    }
}
