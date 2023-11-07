public class Plus_One_Q66 {
    public static int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;
            
            
            
        }

        digits=new int[n+1];
        digits[0]=1;
        return digits;
            
        }


    

    public static void main(String[] args){
        int[] num = {9,9,9};
        int[] answer = plusOne(num);
        for(int i=0;i<answer.length;i++){
        System.out.print(answer[i]+" ");
        }
    
    
}
}
