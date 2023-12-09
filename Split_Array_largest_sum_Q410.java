public class Split_Array_largest_sum_Q410 {
    public int splitArray(int[] nums, int k) {
        long left = 0;
        long right = 0;

        // Find the range of possible largest sums
        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }

        // Use binary search to find the minimum largest sum
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (isValid(nums, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return (int) left;
    }

    private static boolean isValid(int[] nums, int k, long maxSum) {
        int count = 1;
        long currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSum) {
                count++;
                currentSum = num;
                if (count > k) {
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args){
        
    }
}
