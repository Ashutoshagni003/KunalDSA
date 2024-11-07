package SortingAlgo;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicatesInAnArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        findDuplicates(arr);
    }
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> result= new ArrayList<>();
        boolean[] numbers = new boolean[arr.length+2];
        for (int i = 0; i < arr.length; i++) {
            if(numbers[arr[i]]){
                System.out.println(arr[i]);
                result.add(arr[i] );
            }else{
                numbers[arr[i]] = true;
            }
        }
        return result;
    }
}
