public class Max_consequtive_ones_Q485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int currentOnes = 0;

        for (int num : nums) {
            if (num == 1) {
                currentOnes++;
                maxOnes = Math.max(maxOnes, currentOnes);
            } else {
                currentOnes = 0;
            }
        }

        return maxOnes;
    }
    public static void amin(String[] args){
        
    }
}
