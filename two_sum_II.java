public class two_sum_II {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            if (sum == target) {
                return new int[]{left + 1, right + 1}; // Adjust for 1-indexed
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        // No solution found
        return new int[]{};
    }
}
