package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subSequenceIteration {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subSequence(arr);
        System.out.println(ans);

    }
    public static List<List<Integer>> subSequence(int[] arr){

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num:arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);

            }
            
        }
        return outer;
        
    }
}
