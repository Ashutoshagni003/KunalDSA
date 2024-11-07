import java.util.Arrays;

public class MinimumNumberMoves2037 {
    public static void main(String[] args) {
        int[] seats = {2,2,6,6};
        int[] students = {1,3,2,6};

        System.out.println(minMovesToSeat(seats,students));

    }
    public static int minMovesToSeat(int[] seats, int[] students) {

        int sum = 0;
        Arrays.sort(seats);
        Arrays.sort(students);

        int start = 0;
        while( start < seats.length){
            sum = sum + Math.abs(seats[start] - students[start]);
            start++;
        }
        return sum;

    }
}
