public class Search_Insert_Position_Q35 {
    public static int searchInsert(int[] nums,int target){
    int j = 0;
    for(int i = 0;i<nums.length;i++){
            if(nums[i]!=target && nums[i]>target){
                nums[i]=target;
                j = i;
                break;
            }

            else if(nums[i]==target){
                j = i;
                
                break;
            }

            else if(target>nums[nums.length-1]){
                j=nums.length;
                break;
            }
        }
    return j;

    }
    public static void main (String[] args){
        int[] nums = {1,2,5,7,9};
        int result=searchInsert(nums,10);
        System.out.println(result);
    }
}
