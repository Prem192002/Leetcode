public class Single_number_Q136{
    public static int max(int[] nums){
        int result = 0;
        
        for (int num : nums) {
            result ^= num;
        }
        
        return result;
    }
    public static void main(String[] args){
        int[] num={-1};
        System.out.println(max(num));
    }
    
}
