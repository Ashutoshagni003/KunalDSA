package AllElse;

import java.util.ArrayList;

public class LongestIncreasingSubSequenceLeet300 {
    public static void main(String[] args) {
        int[] arr = {18,55,66,2,3,54};
        System.out.println(lengthOfLIS(arr));

    }
//    public static int lengthOfLIS(int[] nums) {
//        ArrayList<Integer> list = new ArrayList<>();
//        int count = 0;
//        list.add(nums[0]);
//        count++;
//        System.out.println(list);
//
//        for (int i = 1; i < nums.length; i++) {
//            if(count == 0){
//                list.add(nums[i] );
//                continue;
//            }
//            int currentValue = nums[i];
//            System.out.println("current value -> "+currentValue);
//
//            if((currentValue < list.get(count-1))){
//                System.out.println(currentValue +"<"+ list.get(count-1));
//                if((list.size()-2 >= 0) && (currentValue > list.get(count-2))){
//                    list.remove(count-1);
//                    list.add(currentValue);
//                    System.out.println(list);
//                    continue;
//                } else if ((list.size()-2 >= 0) && (currentValue == list.get(count-2))) {
//                    continue;
//                } else if ((list.size()-2 >= 0) && (currentValue < list.get(count-2))) {
//                    list.remove(count-1);
//                    list.remove(count-2);
//                    count = count -2;
//                    list.add(currentValue);
//                    System.out.println(list);
//                    continue;
//                }
//                list.remove(count-1);
//                list.add(currentValue);
//                System.out.println(list);
//            } else if ((currentValue == list.get(count-1))) {
//                continue;
//            } else{
//                list.add(currentValue);
//                count++;
//                System.out.println(list);
//            }
//        }
//        return list.size();
//    }

    public static int lengthOfLIS(int[] nums) {
        int[] temp = new int[nums.length];
        for(int i=1; i<nums.length; i++){

            for(int j =0; j<i; j++){
                if(nums[i]>nums[j]){
                    if(temp[j] + 1 > temp[i]){
                        temp[i] = temp[j]+1;
                    }
                }
            }
        }

        int maxIndex = 0;
        for(int i=0; i<temp.length; i++){
            if(temp[i] > temp[maxIndex]){
                maxIndex = i;
            }
        }
        return temp[maxIndex] +1;
    }
}

