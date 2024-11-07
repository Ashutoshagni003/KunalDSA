package Recursion;

public class ReduceStepsLeet1342 {
    static int count = 0;
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }
    public static int numberOfSteps(int num) {
        if(num == 0){
            return count;
        }
        if((num % 2) == 0){
            num = num/2;
            count++;
            numberOfSteps(num);
        }else{
            num = num - 1;
            count++;
            numberOfSteps(num);
        }
        return count;
    }
}
