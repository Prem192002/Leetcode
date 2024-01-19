import java.util.ArrayList;
import java.util.List;

class Permutations{
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);
        return result;
    }

    private void backtrack(int[] nums, int start, List<List<Integer>> result) {
        if (start == nums.length - 1) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(permutation);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            backtrack(nums, start + 1, result);
            swap(nums, start, i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        Permutations solution = new Permutations();

        int[] nums1 = {1, 2, 3};
        System.out.println(solution.permute(nums1));

        int[] nums2 = {0, 1};
        System.out.println(solution.permute(nums2));

        int[] nums3 = {1};
        System.out.println(solution.permute(nums3));
    }
}