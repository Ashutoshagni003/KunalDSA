package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        comb("",4);
    }
    public static void comb(String p,int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 ; i++) {
            if( i <= target){
                comb(p + i,target-i);
            }
        }
    }
}
