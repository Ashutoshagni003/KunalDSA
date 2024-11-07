package AllElse;

import java.util.ArrayList;

public class RichestCustomerWealthLeetcode1672 {
    public static void main(String[] args) {
        int[][] acc = {{1,5},{7,3},{3,5}};

        System.out.println(maximumWealth(acc));
    }
    public static int maximumWealth(int[][] accounts) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < accounts.length;i++){
            int[] currentArr = accounts[i];
            int sum=0;
            for (int j = 0; j < currentArr.length; j++) {
                sum = sum+currentArr[j];
            }
            list.add(sum);
        }
        System.out.println(list);
        int max = Integer.MIN_VALUE;
        for (int k = 0 ;k < list.size();k++){
            if (max < list.get(k)){
                max = list.get(k);
            }
        }
        return max;
    }
}
