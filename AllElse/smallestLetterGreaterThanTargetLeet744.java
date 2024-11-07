package AllElse;

public class smallestLetterGreaterThanTargetLeet744 {
    public static void main(String[] args) {
        char[] arr = {'c','f','f','j'};
        nextGreatestLetter(arr,'z');


    }
    public static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length-1;
        if(target >= arr[end]){
            System.out.println(arr[start]);
            return arr[start];
        }
        while(start<end){
            int mid = start + (end-start)/2;
            if (arr[mid] > target){
                end = mid;
            }else{
                start = mid+1;
            }

        }
        System.out.println(arr[start]);
        return arr[start];
    }
}
