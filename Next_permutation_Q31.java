import java.util.Arrays;

public class Next_permutation_Q31 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Next_permutation_Q31 solution = new Next_permutation_Q31();

        int[] nums1 = {1, 2, 3};
        solution.nextPermutation(nums1);
        System.out.println(Arrays.toString(nums1));  // Output: [1, 3, 2]

        int[] nums2 = {3, 2, 1};
        solution.nextPermutation(nums2);
        System.out.println(Arrays.toString(nums2));  // Output: [1, 2, 3]

        int[] nums3 = {1, 1, 5};
        solution.nextPermutation(nums3);
        System.out.println(Arrays.toString(nums3));  // Output: [1, 5, 1]
    }
}
