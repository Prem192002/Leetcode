class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = findStart(nums, target);
        if (start == -1 || nums[start] != target) {
            return new int[] { -1, -1 };
        }

        int end = findEnd(nums, target);

        return new int[] { start, end };
    }

    private int findStart(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] >= target) {
                end = mid - 1;
                result = mid;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    private int findEnd(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] <= target) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {4, 5, 7, 7, 8, 8, 8};
        int[] result = obj.searchRange(nums, 8);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}