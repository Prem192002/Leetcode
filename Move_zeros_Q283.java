public class Move_zeros_Q283 {
    public static void moveZeros(int[] nums) {
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
 
                int temp = nums[i];
                nums[i] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
    }
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeros(nums1);
        printArray(nums1); 

        int[] nums2 = {0};
        moveZeros(nums2);
        printArray(nums2);
    }
}
