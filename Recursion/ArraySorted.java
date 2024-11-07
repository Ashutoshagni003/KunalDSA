package Recursion;

public class ArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        SortedArray(arr,0,1);
//        System.out.println(NewSort(arr,0,1));
//        FindElement(arr,18,0);
        System.out.println(BooleanFind(arr,1,0));
    }

    private static void FindElement(int[] arr, int target, int index) {
        if(index>=arr.length){
                System.out.println("Not Found");
            return;
        }
        if(arr[index] == target){
            System.out.println("Found");
            return;
        }
        FindElement(arr,target,index+1);
    }
    public static boolean BooleanFind(int[] arr, int target, int index){
        if(index>=arr.length){
            return false;
        }
        return ((arr[index] == target) || BooleanFind(arr,target,index+1));
    }

    public static void SortedArray(int[] arr, int currentIndex, int nextIndex){
        if(nextIndex >= arr.length){
            System.out.println("true");
            return;
        }
        if(arr[currentIndex] > arr[nextIndex]){
            System.out.println("false");
            return;
        }
        SortedArray(arr,currentIndex+1,nextIndex+1);
    }
    public static boolean NewSort(int[] arr, int currentIndex, int nextIndex){
        if (nextIndex>= arr.length){
            return true;
        }
        return ( (arr[currentIndex] < arr[nextIndex] && (NewSort(arr,currentIndex+1,nextIndex+1))));
    }



}
