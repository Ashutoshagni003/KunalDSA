package TREES;

public class DSATree {
    public static void main(String[] args) {
        binaryInsertion tree = new binaryInsertion();
//        tree.insert(4);
//        tree.insert(5);
//        tree.insert(6);
//        tree.insert(1);
//        tree.insert(2);
//        tree.insert(3);
        tree.display();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        binaryInsertion popTree = new binaryInsertion();
        popTree.populateSorted(nums);
        popTree.display();



    }
}
