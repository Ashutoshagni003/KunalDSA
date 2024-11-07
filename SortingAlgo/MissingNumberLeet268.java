package SortingAlgo;

import java.util.Arrays;

public class MissingNumberLeet268 {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
//    public static int missingNumber(int[] arr) {
//        int length = arr.length;
//        int[] result = new int[length+2];
//        for (int i = 0; i < arr.length; i++) {
//            if((arr[i]<0) || (arr[i] > length)){
//                continue;
//            }else{
//                result[arr[i]] = -1;
//            }
//        }
//        System.out.println(Arrays.toString(result));
//        int i;
//        for (i = 0; i < result.length; i++) {
//            if(result[i] == 0){
//                return i;
//            }
//        }
//        return i+1;
//    }



























    public static int missingNumber(int[] arr) {
        int i = 0;
        while ( i < arr.length) {
            if((arr[i]) > arr.length-1){
                System.out.println(Arrays.toString(arr));
                i++;
            }
            if(i > arr.length-1){
                break;
            }
            if (arr[i] == i) {
                System.out.println(Arrays.toString(arr));
                i++;
            } else{
                System.out.println(Arrays.toString(arr));
                swap(arr,i,arr[i]);
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        System.out.println(Arrays.toString(arr));
        return (arr[arr.length-1]+1);
    }
    public static void swap(int[] arr,int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
