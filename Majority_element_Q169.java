import java.util.*;

public class Majority_element_Q169 {
    public static int majority(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array is empty");
        }

        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else if (count > 0) {
                count--;
            } else {
                candidate = nums[i];
                count = 1;
            }
        }
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        } else {
            throw new IllegalArgumentException("No majority element found");
        }
    }
    public static void main(String[] args){
        int[] num={-1,3,2,2,2};
        int x=majority(num);
        System.out.println(x);
    }
}
