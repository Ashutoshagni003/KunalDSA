package backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
//        path("",3,3);
        ArrayList<String> res = new ArrayList<>();
        res = DiagonalpathRet("",3,3);
        System.out.println(res);
        Diagonalpath("",3,3);
    }

    public static int count(int row,int col){
        if(row == 1 || col == 1){
            return 1;
        }
        int left = count(row-1,col);
        int right = count(row,col-1);

        return left+right;
    }
    public static void path(String p, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(row > 1){
            path(p+'D',row-1,col);
        }
        if(col > 1){
            path(p+'R',row,col-1);
        }
    }
    public static ArrayList<String> pathRet(String p, int row, int col){
        if(row == 1 && col == 1){
//            System.out.println(p);
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1){
            list.addAll(pathRet(p+'D',row-1,col));
        }
        if(col > 1){
            list.addAll(pathRet(p+'R',row,col-1));
        }
        return list;
    }
    public static ArrayList<String> DiagonalpathRet(String p, int row, int col){
        if(row == 1 && col == 1){
//            System.out.println(p);
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1 && col > 1){
            list.addAll(DiagonalpathRet(p+'A',row-1,col-1));
        }
        if(row > 1){
            list.addAll(DiagonalpathRet(p+'D',row-1,col));
        }
        if(col > 1){
            list.addAll(DiagonalpathRet(p+'R',row,col-1));
        }
        return list;
    }
    public static void Diagonalpath(String p, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(row > 1 && col > 1){
            Diagonalpath(p+'A',row-1,col-1);
        }
        if(row > 1){
            Diagonalpath(p+'D',row-1,col);
        }
        if(col > 1){
            Diagonalpath(p+'R',row,col-1);
        }

    }
}
