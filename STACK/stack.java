package STACK;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("((("));
    }
    public static int minAddToMakeValid(String s) {

        Stack<Character> stk = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char presentChar = s.charAt(i);
            if(presentChar == '('){
                stk.push(presentChar);
            } else if (!stk.isEmpty() && presentChar == ')') {
                stk.pop();
            } else{
                count++;
            }
        }
        return stk.size()+count;

    }
}
