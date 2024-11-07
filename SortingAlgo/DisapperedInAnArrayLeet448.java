package SortingAlgo;

import java.util.*;

public class DisapperedInAnArrayLeet448 {
    public static void main(String[] args) {
        int[] arr = {1,1};
        findDisappearedNumbers(arr);
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> result= new ArrayList<>();
        int i=0;
        while(i < arr.length){

            if(((arr[i]-1) != i)&&(!check(arr,i,(arr[i]-1)))){
                System.out.println(Arrays.toString(arr));
                swap(arr,i,(arr[i]-1));
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if((arr[j]-1) != j){
                System.out.println(j+1);

                result.add(j+1);
            }
        }


        return result;
    }
    public static void swap(int[] arr,int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
    public static boolean check(int[] arr,int i ,int target){
        if(arr[i] == arr[target]){
            return true;
        }
        return false;
    }
}
