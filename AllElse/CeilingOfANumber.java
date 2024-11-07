package AllElse;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
    FindCeiling(arr,11);
    }
    public static void FindCeiling(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;

            if (arr[mid] == target){
                System.out.println( arr[mid]);
                return;
            }else if(arr[mid]<target){
//
                start = mid+1;
            } else  {
                end = mid-1;
            }
        }
        System.out.println(arr[start]);
//        System.out.println("Number equal or greater is not found");
    }
}
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

