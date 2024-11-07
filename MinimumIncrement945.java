import java.util.Arrays;
import java.util.HashSet;

public class MinimumIncrement945 {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(minIncrementForUnique(nums));

    }
    public static int minIncrementForUnique(int[] nums) {

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int count = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if((nums[i] == nums[i+1]) ){
                 nums[i+1] = nums[i]+1;
                 count++;
                 continue;
            }
            if(nums[i] > nums[i+1]){
                while(nums[i+1] <= nums[i]){
                    nums[i+1] = nums[i+1]+1;
                    count++;
                }
            }

        }
        System.out.println(Arrays.toString(nums));

        return count;
    }
}
