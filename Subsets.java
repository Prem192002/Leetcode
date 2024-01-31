import java.util.*;
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int[] nums, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));

        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(i + 1, nums, path, result);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args){
        Subsets solution = new Subsets();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {0};

        List<List<Integer>> output1 = solution.subsets(nums1);
        List<List<Integer>> output2 = solution.subsets(nums2);

        System.out.println("Output 1: " + output1);
        System.out.println("Output 2: " + output2);
    }
}
