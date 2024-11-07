package SortingAlgo;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        CycleSort(arr);
    }
    public static void CycleSort(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            if((arr[i]-1) == i){
                continue;
            } else {
                swap(arr,i,arr[i]-1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
