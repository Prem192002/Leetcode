class Solution {
    public int removeDuplicates(int[] nums) {
         if (nums.length == 0) {
            return 0;
        }

        int j = 0; // Pointer to the current unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i]; // Move the unique element to the next position
            }
        }

        return j + 1;
        
    }
}