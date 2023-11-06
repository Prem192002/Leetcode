
class Search_Insert_Position_Q35 {
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }


        return low;
        
    }

    public static void main(String[] args){
        int[] nums = {2,2,3,5,7,8};
        
        System.out.println(searchInsert(nums,5));
    }
}