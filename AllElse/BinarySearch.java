package AllElse;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18,-12,0,3,5,8,12,45,67};
        int target = -17;
        System.out.println(binarySearch(arr,target));
    }
    public static int binarySearch(int[] arr ,int target){
        int start = 0;
        int end = arr.length-1;

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
