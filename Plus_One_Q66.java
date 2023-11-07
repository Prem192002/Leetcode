public class Plus_One_Q66 {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                
                digits[i]++;
                return digits;
            } else {
                
                digits[i] = 0;
            }
        }
        
        
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        int[] answer = plusOne(num);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
        }
    }
}
