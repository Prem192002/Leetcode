import java.util.Arrays;

public class Sort_an_array {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args){
        Sort_an_array sol = new Sort_an_array();
        int[] num= {2,7,1,0,9,10};
        int[] result = new int[num.length];
        result = sol.sortArray(num);
    }
}
