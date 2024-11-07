package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PhoneKeyPad {
    public static void main(String[] args) {
        System.out.println(letterCombinations("9"));
    }
    public static List<String> letterCombinations(String digits) {
        return padRet("",digits);
    }
    public static List<String> padRet(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            if(p.isEmpty()){
                return list;
            }
            list.add(p);
            return list;
        }
        List<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        int limit = (digit-1)*3;
        int startLimit = (digit-2)*3;
        if(digit == 7){
            limit = limit + 1;
        }
        if(digit == 9){
            startLimit = startLimit +1;
            limit = limit +2;
        }
        if(digit == 8){
            startLimit = startLimit + 1;
            limit = limit + 1;
        }

        for (int i = startLimit; i < limit; i++) {
            char ch = (char)('a' + i);
            list.addAll(padRet(p+ch,up.substring(1)));
        }
        return list;
    }













    public static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1)*3; i < digit*3; i++) {
            char ch = (char)('a' + i);
            pad(p+ch,up.substring(1));
        }
    }

    public static int padCount(String p,String up){
        if(up.isEmpty()){
//            System.out.println(p);
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1)*3; i < digit*3; i++) {
            char ch = (char)('a' + i);
            count = count+padCount(p+ch,up.substring(1));
        }
        return count;
    }

}
