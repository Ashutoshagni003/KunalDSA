package Recursion;

import java.util.Arrays;

public class QuickSortRecursion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,7,9};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
    public static void quickSort(int[] numbers, int low, int high){
//        if(low>=high){
//            return;
//        }
//        int start = low;
//        int end = high;
//        int m = start + (end - start)/2;
//        int pivot = arr[m];
//
//        while (start<=end){
//            while(arr[start] < pivot){
//                start++;
//            }
//            while(arr[end] > pivot){
//                end--;
//            }
//            if(start<=end){
//                int temp = arr[start];
//                arr[start] = arr[end];
//                arr[end] = temp;
//                start++;
//                end--;
//            }
//        }

        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high-low)/2];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(numbers,i, j);
                i++;
                j--;
            }
        }
        // Recursion
//        if (low < j)
//            quickSort(numbers,low, j);
//        if (i < high)
//            quickSort(numbers,i, high);
    }
    public static void exchange(int[] numbers,int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
