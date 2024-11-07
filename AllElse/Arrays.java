package AllElse;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

                list.add(new ArrayList<>());

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add((sc.nextInt()));
            }
        }
        System.out.println(list);

        for (int i = 0; i < 3; i++) {
            swapElement(list.get(i));
        }
    }

    private static void swapElement(ArrayList<Integer> list) {
        ArrayList<Integer> newArr = new ArrayList<>();
        int i = 0;
        int j = list.size()-1;
        while(i<3){
            newArr.add(i, list.remove(j));
            i++;
            j--;



        }
        System.out.println(newArr);

    }

    public static void max(ArrayList<ArrayList<Integer>> list){
        int Max = list.get(0).get(0);
        System.out.println(Max);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int temp = list.get(i).get(j);

            }
        }
        System.out.println(Max);
    }
}
