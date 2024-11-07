package AllElse;

import java.util.Arrays;

public class Search2dMatrixLeet74 {
    public static void main(String[] args) {
//        [[1,3,5,7],[10,11,16,20],[23,30,34,60]]
        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 60;
        System.out.println(searchMatrix(matrix,target));

    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int result = -1;
        for (int i = 0;i < matrix.length;i++){
            if(target <= matrix[i][matrix[i].length-1] ){
                result = binarySearch(matrix[i], target, 0 , matrix[i].length-1 );
                break;
            }
        }
        System.out.println("result -> "+result);
        if(result == -1){
            return false;
        }
        return true;

    }
    public static int binarySearch(int[] arr,int target,int start,int end){
        System.out.println(Arrays.toString(arr));
        System.out.println("start ->" +start+" end -> "+end);
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            } else if (target < arr[mid]) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
