import java.util.HashSet;

public class Contains_Duplicate_II_Q219 {
        public static boolean containsNearbyDuplicate(int[] nums, int k) {
       HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums={1,2,3,1,8};
        boolean result = containsNearbyDuplicate(nums,3);
        System.out.println(result);
    }
    
}
