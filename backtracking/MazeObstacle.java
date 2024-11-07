package backtracking;

public class MazeObstacle {
    public static void main(String[] args) {
        System.out.println(mazeObs(1,1));
        mazeObsPath("",1,1);
    }
    public static int mazeObs(int row,int col){
        if(row == 4 || col == 4){
            return 1;
        }
        int left=0,right=0;
        if(row != 2){
            left= mazeObs(row,col+1);
        }
        if(col != 2){
            right= mazeObs(row+1,col);
        }

        return left+right;
    }
    public static void mazeObsPath(String p,int row,int col){
        if(row == 4 && col == 4){
            System.out.println(p);
            return;
        }
        if(col < 4){
            if(row != 2){
                mazeObsPath(p+'R',row,col+1);
            }
        }
        if(row<4){
            if(col != 2){
                mazeObsPath(p+'D',row+1,col);
            }
        }



    }
}
