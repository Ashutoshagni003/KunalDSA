package AllElse;

public class ChalkProblemLeet1894 {
    public static void main(String[] args) {
        int[] chalk = {5,1,5,6};
        int k = 5;
        System.out.println(chalkReplacer(chalk,k));
    }
    public static int chalkReplacer(int[] chalk, int k) {
        int total = findTotal(chalk);

        int Remainder = k%total;
        if(Remainder == 0){
            return 0;
        }
        System.out.println("Remainder -> "+Remainder);
        for (int i = 0; i < chalk.length; i++) {
            if(Remainder >= chalk[i]){
                Remainder = Remainder - chalk[i];
                System.out.println("Remainder ->"+Remainder);
            }else {
                return i;
            }
        }


        return 0;
    }
    public static int findTotal(int[] chalk){
        int sum = 0;
        for (int i=0;i<chalk.length;i++){
            sum = sum + chalk[i];
        }
        return sum;
    }
}
