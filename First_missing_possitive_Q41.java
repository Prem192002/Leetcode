public class First_missing_possitive_Q41 {

        public static int firstMissingPositive(int[] nums) {
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                while (nums[i] >= 1 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                    int temp = nums[nums[i] - 1];
                    nums[nums[i] - 1] = nums[i];
                    nums[i] = temp;
                }
            }
            for (int i = 0; i < n; i++) {
                if (nums[i] != i + 1) {
                    return i + 1;
                }
            }
            return n + 1;
        }

        public static void main(String[] args) {

            System.out.println(firstMissingPositive(new int[]{1, 2, 0}));  // Output: 3
            System.out.println(firstMissingPositive(new int[]{3, 4, -1, 1}));  // Output: 2
            System.out.println(firstMissingPositive(new int[]{7, 8, 9, 11, 12}));  // Output: 1
        }
    
}
