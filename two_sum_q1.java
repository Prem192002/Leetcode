import java.util.*;

public class two_sum_q1 {
    public int[] twoSum(int[] num, int target) {
        int[] result = new int[2];
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15};
        int target = 9;

        two_sum_q1 solution = new two_sum_q1();
        int[] result = solution.twoSum(num, target);

        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}
