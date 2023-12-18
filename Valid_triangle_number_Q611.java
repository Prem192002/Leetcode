import java.util.Arrays;

public class Valid_triangle_number_Q611 {
        public static int triangleNumber(int[] nums) {
        Arrays.sort(nums);


  int count = 0;


  for (int i = 2; i < nums.length; i++) {

    int left = 0;
    int right = i - 1;

    while (left < right) {

      int sumLr = nums[left] + nums[right];

     
      if (sumLr > nums[i]) {

        count += right - left;
        right--;
      } else {
        left++;
      }
    }
  }

  return count;
    }
    public static void main(String[] args){
        
        // Example 1
        int[] nums1 = {2, 2, 3, 4};
        int output1 = triangleNumber(nums1);
        System.out.println("Example 1: " + output1);  // Output: 3

        // Example 2
        int[] nums2 = {4, 2, 3, 4};
        int output2 = triangleNumber(nums2);
        System.out.println("Example 2: " + output2);  // Output: 4
    
    }
}
