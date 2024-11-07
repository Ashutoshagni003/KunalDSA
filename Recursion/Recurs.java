package Recursion;

public class Recurs {
    public static void main(String[] args) {


        int num = 123454321;
        int res = (reverse(num,0));
        System.out.println(palindrome(num, res));

    }
    public static boolean palindrome(int num, int res){
        if(num == res){
            return true;
        }
        return false;
    }
    public static int reverse(int num,int ans){
        if(num<=0){
            return ans;
        }

        int rem = num%10;
        int n = num/10;
        ans = ans*10 + rem;

        return reverse(n,ans);
    }


    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        int div = n%10;
        int newNumber = n/10;
        int ans = div + sum(newNumber);

        return ans;

    }







//    public static int fact(int n){
//        if ( n == 1){
//            System.out.print(n+" -> ");
//            return 1;
//        }
//        System.out.print(n+" X ");
//        int ans = n * fact(n-1);
//
//        return ans;
//    }
}
