package AllElse;

import java.util.ArrayList;

public class MinimumLengthOfSubArrayLeet {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1};
        int target = 11;
        System.out.println(minSubArrayLen(target,arr));

    }
    public static int minSubArrayLen(int target, int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int res = search(nums,target,i);
            System.out.println("res -> "+res);
            if (res== 0){
                continue;
            }
            list.add(res);
        }

        System.out.println(list);
        if(list.isEmpty()){
            return 0;
        }
        int output = findMinimum(list);
        System.out.println(output);


        return output;
    }

    private static int findMinimum(ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size();i++){
            if(list.get(i) < min){
                min = list.get(i);
            }
        }
        return min;
    }

    public static int search(int[] nums, int target,int start){
        ArrayList<Integer> list = new ArrayList<>();
        int sum=0;
        for (int i = start; i < nums.length; i++) {
            if((sum+nums[i])<target){
                sum = sum+nums[i];
            }else{
                int length = i-start+1;
                System.out.println("length -> "+length);
                System.out.println("sum -> "+sum);
                return length;
            }
        }
        return 0;
    }
}
