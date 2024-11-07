package Recursion;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        ArrayList<String> ans = permList("","123");
        System.out.println(ans);
        System.out.println(permCount("","1234"));

    }
    public static void perm(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            perm(f+ch+s,up.substring(1));

        }
    }
    public static ArrayList<String> permList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permList(f+ch+s,up.substring(1)));

        }
        return ans;
    }

    public static int permCount(String p, String up){
        if(up.isEmpty()){

            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count  = count  + permCount(f+ch+s,up.substring(1));

        }
        return count;
    }
}
