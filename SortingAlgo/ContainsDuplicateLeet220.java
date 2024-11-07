package SortingAlgo;

public class ContainsDuplicateLeet220 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1};
        int diff = 1;
        int target = 2;
        System.out.println(containsNearbyAlmostDuplicate(arr,diff,target));

    }
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        for (int i = 0; i < nums.length; i++) {
            if(((i+indexDiff)< nums.length)){
                int sub = nums[i] - nums[i+indexDiff];

                if(sub < 0){
                    sub = nums[i+indexDiff] - nums[i];
                }
                System.out.println(sub);
                if(sub == valueDiff){
                    return true;
                }
            }
        }
        return false;
    }
}
