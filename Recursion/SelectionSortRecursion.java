package Recursion;

import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,6,9,0,2,1};
        selectionSort(arr,0, arr.length, 0);
    }
    public static void selectionSort(int[] arr,int index,int limit,int max){
        if(limit == 0){
            System.out.println(Arrays.toString(arr));
            return ;
        }
        if((index) == limit){
            swap(arr, limit-1, max);
            selectionSort(arr,0,limit-1,0);
        }else{
            if(arr[index] > arr[max]){
                max = index;
                selectionSort(arr,index+1,limit,max);
            }else{
                selectionSort(arr,index+1,limit,max);
            }
        }
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
