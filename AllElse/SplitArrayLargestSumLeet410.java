package AllElse;

public class SplitArrayLargestSumLeet410 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int k = 5;
        System.out.println(splitArray(arr,k));
    }

    public static int splitArray(int[] nums, int k) {

        int midIndex = (nums.length)/k;
        System.out.println("midIndex -> "+midIndex);
        int selectedElements = midIndex;
        System.out.println("selectedElements -> "+selectedElements);
        int targetIndex = selectedElements*(k);
        System.out.println(targetIndex);
        int sum = 0;
        for (int i = targetIndex; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }
}
