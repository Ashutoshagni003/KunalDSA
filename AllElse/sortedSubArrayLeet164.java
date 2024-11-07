package AllElse;

import java.util.Arrays;

public class sortedSubArrayLeet164 {
    public static void main(String[] args) {
        int[] array = {-1,-1,1,1,1};
        int target = -2;
        System.out.println(Arrays.toString(twoSum(array,target)));
    }
    public static int[] twoSum(int[] numbers, int target) {

        int[] solution = new int[2];
        for (int i = 0; i < numbers.length; i++) {
//            currentNumber <= target
            int currentNumber = numbers[i];
            if((currentNumber >= 0 && currentNumber <= target)||(currentNumber<0)){
                int tar = target - currentNumber;
                System.out.println("tar -> "+tar);
                if(i == numbers.length-1){
                    solution[0] = -1;
                    solution[1] = -1;
                    System.out.println(Arrays.toString(solution));
                    return solution;
                }
                int res = binarySearch(numbers,tar,i+1,numbers.length-1);
                System.out.println("res -> "+res );
                if(res != -1){
                    solution[0] = i+1;
                    solution[1] = res+1;
                    System.out.println(Arrays.toString(solution));
                    return solution;
                }
            }
        }
        System.out.println(Arrays.toString(solution));
        return solution;
    }
    public static int binarySearch(int[] arr ,int target, int start,int end){


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
