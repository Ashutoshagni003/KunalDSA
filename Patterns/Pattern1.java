package Patterns;

public class Pattern1 {
    public static void main(String[] args) {
//        *****
//        *****
//        *****
//        *****
//        *****


//        for (int i = 1; i <= 5 ; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//    *
//    **
//    ***
//    ****
//    *****

//        for (int i = 1; i <= 5 ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }



//        *****
    //    ****
    //    ***
    //    **
    //    *

//        for (int i = 0; i < 5 ; i++) {
//            for (int j = 1; j <= (5 - i); j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }




//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5


//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }



//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *

//        for (int i = 1; i <= 5 ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < 4 ; i++) {
//            for (int j = 1; j <= (4 - i); j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }


//         *
//        **
//       ***
//      ****
//     *****

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j < (5-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//         *****
//          ****
//           ***
//            **
//             *


//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j < i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <=(5-i) ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        *
//       ***
//      *****
//     *******
//    *********

//        for (int i = 0; i < 5 ; i++) {
//            for (int j = 1; j < (5-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=(2*i + 1) ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//        *********
//         *******
//          *****
//           ***
//            *


//        for (int i = 4; i >= 0; i--) {
//            for (int j = 1; j < (5-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=(2*i + 1) ; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }


//             *
//            * *
//           * * *
//          * * * *
//         * * * * *

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j < (5-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



//         * * * * *
//          * * * *
//           * * *
//            * *
//             *



//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j < i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <=(5-i) ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//         * * * * *
//          * * * *
//           * * *
//            * *
//             *
//             *
//            * *
//           * * *
//          * * * *
//         * * * * *


//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j < i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <=(5-i) ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j < (5-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



//         *
//        * *
//       *   *
//      *     *
//     *********

//        for (int i = 0; i < 5 ; i++) {
//            if(i == 4){
//                for (int j = 0; j < 2*5-1; j++) {
//                    System.out.print("*");
//                }
//                break;
//            }
//
//            for (int j = 1; j < (5-i); j++) {
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for (int j = 1; j <=(2*i-1); j++) {
//                System.out.print(" ");
//            }
//            if (i != 0){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

//         *********
//          *     *
//           *   *
//            * *
//             *


//        for (int i = 1; i <= 5; i++) {
//            if(i == 1){
//                for (int j = 0; j < 2*5 - 1 ; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//                continue;
//            }
//            for (int j = 1; j < i; j++) {
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            int betweenSpace = (2*5 -1) - (2*i);
//            if (betweenSpace == -1){
//                break;
//            }
//            for (int j = 1; j <= betweenSpace ; j++) {
//                System.out.print(" ");
//            }
//
//            System.out.println("*");
//        }


//                 *
//                * *
//               *   *
//              *     *
//             *       *
//              *     *
//               *   *
//                * *
//                 *

//        for (int i = 0; i < 4 ; i++) {
//
//
//            for (int j = 1; j < (5-i); j++) {
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for (int j = 1; j <=(2*i-1); j++) {
//                System.out.print(" ");
//            }
//            if (i != 0){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//        for (int i = 1; i <= 5; i++) {
//
//            for (int j = 1; j < i; j++) {
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            int betweenSpace = (2*5 -1) - (2*i);
//            if (betweenSpace == -1){
//                break;
//            }
//            for (int j = 1; j <= betweenSpace ; j++) {
//                System.out.print(" ");
//            }
//
//            System.out.println("*");
//        }

//              1
//            1   1
//          1   2   1
//        1   3   3   1 
//      1   4   6   4   1

//        int n = 5;
//
//        for (int i = 0; i < n; i++) {
//            int number = 1;
//            System.out.printf("%" + (n - i) * 2 + "s", "");
//            for (int j = 0; j <= i; j++) {
//                System.out.printf("%4d", number);
//                number = number * (i - j) / (j + 1);
//            }
//            System.out.println();
//        }


//         1
//        212
//       32123
//      4321234
//       32123
//        212
//         1

//        for (int i = 1; i <= 4; i++) {
//
//            for (int j = 0; j <= (4-i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j > 1 ; j--) {
//                System.out.print(j);
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(j);
//            }
//            for (int j = 0; j <= (4-i); j++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//        for (int i = 3; i >= 1; i--) {
//
//            for (int j = 0; j <= (4-i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j > 1 ; j--) {
//                System.out.print(j);
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(j);
//            }
//            for (int j = 0; j <= (4-i); j++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

//        .     **********
//              ****  ****
//              ***    ***
//              **      **
//              *        *
//              *        *
//              **      **
//              ***    ***
//              ****  ****
//              **********


//        for (int i = 5; i > 0; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <= 2*(5-i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <= 2*(5-i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }



//               *        *
//               **      **
//               ***    ***
//               ****  ****
//               **********
//               ****  ****
//               ***    ***
//               **      **
//               *        *

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <= 2*(5-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 4; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <= 2*(5-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//       ****
//       *  *
//       *  *
//       *  *
//       ****

//        for (int i = 1; i <= 5; i++) {
//
//            for (int j = 1; j <= 4 ; j++) {
//                if(i == 1 || i == 5 || j==1 || j == 4){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


//        1
//        2  3
//        4  5  6
//        7  8  9  10
//        11 12 13 14 15

//        int k = 1;
//        for (int i = 1; i <= 5 ; i++) {
//
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(k+" ");
//                k++;
//            }
//            System.out.println();
//        }



//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1


//        for (int i = 1; i <= 5 ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                if((i+j)%2 == 0){
//                    System.out.print(1+" ");
//                }else {
//                    System.out.print(0+" ");
//                }
//            }
//            System.out.println();
//        }





//           *      *
//         *   *  *   *
//       *      *      *


//        for (int i = 3; i >=1 ; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            int spaceBetween = (2*(3-i))-1;
//            if(spaceBetween > 0){
//                for (int j = 1; j <= spaceBetween; j++) {
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//            }
//            int innerSpace = (3-spaceBetween)-1;
//            if(innerSpace>0){
//                for (int j = 1; j <= innerSpace; j++) {
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//            }
//            if(spaceBetween > 0){
//                for (int j = 1; j <= spaceBetween; j++) {
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//            }
//
//            System.out.println();
//
//        }

//               *        *
//               **      **
//               * *    * *
//               *  *  *  *
//               *   **   *
//               *   **   *
//               *  *  *  *
//               * *    * *
//               **      **
//               *        *

//        for (int i = 0; i < 5; i++) {
//            System.out.print("*");
//            int spacebetween = i-1;
//            for (int j = 0; j < spacebetween; j++) {
//                System.out.print(" ");
//            }
//            if(spacebetween >= 0){
//                System.out.print("*");
//            }
//            for (int j = 1; j <= 2*(4-i) ; j++) {
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for (int j = 0; j < spacebetween; j++) {
//                System.out.print(" ");
//            }
//
//            if(spacebetween >= 0){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//        for (int i = 5; i >= 1; i--) {
//            System.out.print("*");
//            int spacebetween = i-2;
//            for (int j = 0; j < spacebetween; j++) {
//                System.out.print(" ");
//            }
//            if(spacebetween >= 0){
//                System.out.print("*");
//            }
//            for (int j = 1; j <= 2*(5-i) ; j++) {
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for (int j = 0; j < spacebetween; j++) {
//                System.out.print(" ");
//            }
////
//            if(spacebetween >= 0){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }


//          *****
//         *   *
//        *   *
//       *   *
//      *****

//        for (int i = 5; i >= 1; i--) {
//            for (int j = 1; j < i; j++) {
//                System.out.print(" ");
//            }
//            if( i == 5 || i == 1){
//                for (int j = 1; j <= 5 ; j++) {
//                    System.out.print("*");
//                }
//            }
//            else{
//                System.out.print("*");
//                for (int j = 1; j < 4; j++) {
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }


//        1 1 1 1 1 1
//        2 2 2 2 2
//        3 3 3 3
//        4 4 4
//        5 5
//        6


//        for (int i = 1; i <= 6 ; i++) {
//            for (int j = 6; j >= i; j--) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }


//        1 2 3 4  17 18 19 20
//          5 6 7  14 15 16
//            8 9  12 13
//              10 11
//        int k = 1;
//        for (int i = 4; i >= 1 ; i--){
//            for (int j = 1; j <= 2*(4-i); j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < i ; j++) {
//                System.out.print(k+" ");
//                k++;
//            }
//
//            System.out.print(" ");
//            int num = (2*(AllSum(i-1)) + k);
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(num+" ");
//                num++;
//            }
////            System.out.println(" ... "+num);
//
//            System.out.println();
//        }

//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4

//        for (int i =  (2*4 - 1); i >= 1; i--) {
//            for (int j = 1; j <= 2*4 - 1; j++) {
//                System.out.print((i+j)/2);
//            }
//            System.out.println();
//        }

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        E
//        D E
//        C D E
//        B C D E
//        A B C D E

//        for (int i = 69; i >= 65; i--) {
//            for (int j = i; j <= 69 ; j++) {
//                System.out.print((char)(j));
//            }
//            System.out.println();
//        }


//        a
//        B c
//        D e F
//        g H i J
//        k L m N o

//        int num = 65;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i ; j++) {
//
//                char ch = (char)(num);
//                if((i+j)%2 == 0){
//                    System.out.print((char)(num+32));
//                }else{
//                    System.out.print(ch);
//                }
//
//                num++;
//            }
//            System.out.println();
//        }
//
//        System.out.println((int)('a'));


//        E D C B A
//        D C B A
//        C B A
//        B A
//        A

//        int alpha = 65;
//        for (int i = 69; i >= 65 ; i--) {
//            for (int j = i; j >= 65 ; j--) {
//                System.out.print((char)(j));
//            }
//            System.out.println();
//        }

//        1      1
//        12    21
//        123  321
//        12344321

//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(j);
//            }
//            for (int j = 1; j <= 2*(4-i) ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }


    }
//    public static int AllSum(int n){
//        if(n == 0){
//            return 0;
//        }
//        int sum = n+AllSum(n-1);
//        return sum;
//    }
}
