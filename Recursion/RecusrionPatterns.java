package Recursion;

public class RecusrionPatterns {
    public static void main(String[] args) {
        pattern(1,4);
    }
    public static void pattern(int count,int limit){
        if(limit == 0){
            return;
        }
        if(count < limit){
            pattern(count+1,limit);
            System.out.print("*");

        } else if (count == limit) {
            pattern(0,limit-1);
            System.out.print("*");
            System.out.println();

        }

    }
}
