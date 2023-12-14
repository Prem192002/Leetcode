import java.util.Arrays;
import java.util.Comparator;

public class Largest_number_Q179 {
    public String largestNumber(int[] nums) {
        String[] numStrings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrings[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numStrings, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                                return (b + a).compareTo(a + b);
            }
        });
        StringBuilder result = new StringBuilder();
        for (String numString : numStrings) {
            result.append(numString);
        }

        int startIndex = 0;
        while (startIndex < result.length() - 1 && result.charAt(startIndex) == '0') {
            startIndex++;
        }

        return result.substring(startIndex);
    }
    public static void main(String[] args){
        Largest_number_Q179 solution = new Largest_number_Q179();
        int[] nums1 = {10, 2};
        System.out.println(solution.largestNumber(nums1));  

        int[] nums2 = {3, 30, 34, 5, 9};
        System.out.println(solution.largestNumber(nums2));
    }
}
