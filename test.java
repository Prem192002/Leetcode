import java.util.*;
class test{
    public static int search(int[]nums){
        Arrays.sort(nums);
        return nums[nums.length-3];
    }
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int answer = search(nums);
        System.out.println(answer);

    }
}