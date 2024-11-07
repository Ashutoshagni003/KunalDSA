package AllElse;

import java.util.Arrays;

public class FindDuplicateLeet287 {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }
//    public static int findDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for(int i = 0;i < nums.length-1;i++){
//            if(nums[i] == nums[i+1]){
//                return nums[i];
//            }
//        }
//        return -1;
//    }
    public static int findDuplicate(int[] nums) {
        boolean[] arr = new boolean[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if(arr[val]){
                return val;
            }else{
                arr[val] = true;
            }
        }
        return -1;
    }
}
