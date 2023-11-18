public class Maximun_product_subarray_Q152 {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }


        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {

                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            
            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1
        Maximun_product_subarray_Q152 solution = new Maximun_product_subarray_Q152();
        int[] nums1 = {2, 3, -2, 4};
        System.out.println(solution.maxProduct(nums1));  // Output: 6

        // Example 2
        int[] nums2 = {-2, 0, -1};
        System.out.println(solution.maxProduct(nums2));  // Output: 0
    }
}
