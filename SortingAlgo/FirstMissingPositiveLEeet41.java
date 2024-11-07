package SortingAlgo;

import java.util.Arrays;

public class FirstMissingPositiveLEeet41 {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] nums) {

        int length = nums.length;
        int[] result = new int[length+2];
        for (int i = 0; i < nums.length; i++) {
            if((nums[i]<0) || (nums[i]>length) ){
                continue;
            }else{
                result[nums[i]] = -1;
                System.out.println(Arrays.toString(result));
            }

        }
        System.out.println(Arrays.toString(result));
        int j;
        for (j = 1; j < result.length; j++) {
            if(result[j] == 0){
                System.out.println("j ->" +j);
                return j;
            }
        }
        System.out.println(j);
        return j+1;

    }

}
