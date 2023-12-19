public class Pattching_array_Q330 {
    public int minPatches(int[] nums, int n) {
        int patches = 0;
        long currentSum = 0;

        int i = 0;
        while (currentSum < n) {
            if (i < nums.length && nums[i] <= currentSum + 1) {
                
                currentSum += nums[i];
                i++;
            } else {
                currentSum += currentSum + 1;
                patches++;
            }
        }

        return patches;
    }

    public static void main(String[] args) {
        Pattching_array_Q330 solution = new Pattching_array_Q330();

        int[] nums1 = {1, 3};
        int n1 = 6;
        System.out.println(solution.minPatches(nums1, n1)); // Output: 1

        int[] nums2 = {1, 5, 10};
        int n2 = 20;
        System.out.println(solution.minPatches(nums2, n2)); // Output: 2

        int[] nums3 = {1, 2, 2};
        int n3 = 5;
        System.out.println(solution.minPatches(nums3, n3)); // Output: 0
    }
}
