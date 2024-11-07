package AllElse;

import java.util.Arrays;

public class FirstAndLastPositionLeet34 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,8,8,8,10};
        int target = 2;
        searchRange(arr,target);
    }
    public static int[] searchRange(int[] arr, int target) {
        int[] result = new int[2];
        if(arr.length == 0){
            result[0] = -1;
            result[1] = -1;
            return result;
        }
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]<target){
//
                start = mid+1;
            } else  {
                end = mid-1;
            }
        }
//        System.out.println(end+1);
        int startingIndex = start;
        result[0] = start;
         start = 0;
         end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]>target){
//
                end = mid-1;
            } else  {
                start = mid+1;
            }
        }
        System.out.println(end);
        int endingIndex = end;

        result[1] = end;
        if(startingIndex>endingIndex){
            result[0] = -1;
            result[1] = -1;
            return result;
        }
        return result;
    }

}
