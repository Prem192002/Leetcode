import java.util.*;
class trial {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int con=0;
        
        if(nums1.length>m){
            
            for(int i=m;i<nums1.length;i++){
                nums1[i]=nums2[con];
                con++;
            }

    }
    Arrays.sort(nums1);
    for(int i = 0;i<nums1.length;i++){
        System.out.println(nums1[i]);
    }

}




    
    public static void main(String [] args){
        int[] num1 = {1,2,3};
        int[] num2 = {2,4,5};
        merge(num1,3,num2,3);

    }
}
