
public class remove_element_Q27 {

        public int removeElement(int[] nums, int val) {
    
            
            int k = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=val){
                    nums[k]=nums[i];
                    
                    k++;
                }
            }
            return k;
        }
        
    

        //test case
        public static void main(String[] args){

        int[] nums = {3,2,2,3};
        remove_element_Q27 obj = new remove_element_Q27();
        int x=obj.removeElement(nums,3);
        System.out.println(x);
        
    }
}
