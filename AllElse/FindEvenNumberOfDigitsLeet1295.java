package AllElse;

import java.util.Arrays;

public class FindEvenNumberOfDigitsLeet1295 {
    public static void main(String[] args) {
        int[] arr = {555,901,482,1771,0};
        int ans = findNumbers(arr);
        System.out.println(ans);
    }
    public static int findNumbers(int[] nums) {

        int[] countValue = new int[nums.length];
        for (int i = 0; i < nums.length;i++){
            int num = nums[i];
            countValue[i] = (int)(Math.log10(num)+1);

        }
        System.out.println(Arrays.toString(countValue));
        int result = 0;
        for (int i = 0; i < countValue.length;i++){
            if (countValue[i] %2 == 0){
                result++;
            }
        }
        return result;
    }

}
