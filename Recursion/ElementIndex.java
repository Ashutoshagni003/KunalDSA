package Recursion;

import java.util.ArrayList;

public class ElementIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};
        System.out.println(findAllIndex(arr,5,0));

    }
//    public static int findIndex(int[] arr,int target, int index){
//        if(index == arr.length){
//            return -1;
//        }
//        if(arr[index] == target){
//            return index;
//        }else{
//            return findIndex(arr,target,index+1);
//        }
//
//    }
    public static void findIndex(int[] arr,int target, int index){
        if(index == arr.length){
            return ;
        }
        if(arr[index] == target){
            System.out.println(index);
            findIndex(arr,target,index+1);
//            return;
        }else{
            findIndex(arr,target,index+1);
        }

    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList findAllIndex(int[] arr,int target,int index){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
            findAllIndex(arr,target,index+1);
        }else{
            findAllIndex(arr,target,index+1);
        }
        return list;
    }
}
