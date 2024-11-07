package Recursion;

import java.util.Arrays;

public class bubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        bubbleSort(arr,0,arr.length);
    }
    public static void bubbleSort(int[] arr,int index,int limit){
        if(limit == 0){
            System.out.println(Arrays.toString(arr));
            return;
        }
        if((index+1) >= arr.length){
            bubbleSort(arr,0,limit-1);
            return;
        }
        if((arr[index] > arr[index+1])){
            swap(arr,index,index+1);
            bubbleSort(arr,index+1,limit);
        }else{
            bubbleSort(arr,index+1,limit);
        }
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
