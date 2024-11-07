package AllElse;

public class Search2dMatrixLeet240SortedmXn {
    public static void main(String[] args) {
        int[][] arr = {
//            {1,4,7,11,15},
//            {2,5,8,12,19},
//            {3,6,9,16,22},
//            {10,13,14,17,24},
//            {18,21,23,26,30}
               {-1,3}
        };
        int target = 3;
        System.out.println(searchMatrix(arr,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
//        if((target > matrix[matrix.length-1][matrix.length-1])||(target < matrix[0][0])){
//            return false;
//        }
        int row=0;
        int col = matrix[0].length-1;
        while((row < matrix.length) && (col >=0)){
            if(matrix[row][col] == target){
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}
