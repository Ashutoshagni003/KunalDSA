package SortingAlgo;

import java.util.Arrays;

public class SetMisMatchLeet645 {
    public static void main(String[] args) {
        int[] arr = {3,2,2};
        findErrorNums(arr);
    }
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int rep=0;
        boolean[] arr = new boolean[nums.length+1];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
            if(arr[nums[i]]){
                rep = nums[i];
                result[0] = nums[i];

            }else{
                arr[nums[i]] = true;
            }
        }
        int n = arr.length-1;
        int total = (n *(n+1))/2;
        int realValue = total-sum+rep;
        if(realValue<0){
            realValue = sum-total+rep;
        }
        System.out.println("sum -> "+sum);
        System.out.println("total -> "+total);
        System.out.println("real Value ->"+realValue);
        result[1] = realValue;


        System.out.println(Arrays.toString(result));

        return result;
    }
}
