package AllElse;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SearchInRotatedSortedArrayLeet81 {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target= 7;
        System.out.println(search(arr,target));

    }
public static Set<Integer> convertArrayToSet(int array[])
{

    // Create an empty Set
    Set<Integer> set = new HashSet<>();

    // Iterate through the array
    for (Integer t : array) {
        // Add each element into the set
        set.add(t);
    }

    // Return the converted Set
    return set;
}
    public static boolean search(int[] nums, int target) {
        Set<Integer> set = convertArrayToSet(nums);
        Integer[] arr = set.toArray(new Integer[set.size()]);
        System.out.println(set);
        int res = binarySearch(arr,target);
        if(res == -1){
            return false;
        }
        return true;
    }
    public static int binarySearch(Integer[] arr ,int target){
        int start = 0;
        int end = arr.length-1;
        Arrays.sort(arr);

        while (start <= end){
            int mid = start+(end-start)/2;
            if (target == arr[mid]){
                return mid;
            } else if (arr[mid] > target) {
                end = mid-1;
            } else if(arr[mid]<target){
                start = mid+1;
            }

        }
        return -1;
    }

}


//    public boolean search(int[] nums, int target) {
//
//        for(int i =0; i< nums.length; i++){
//            if(nums[i]==target){
//                return true;
//            }
//        }
//        return false;
//    }

