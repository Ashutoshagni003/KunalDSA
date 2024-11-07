package TREES;

public class BST {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;

    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        tree.populateSorted(nums);
        tree.display();
        System.out.println(tree.balanced());
    }

    public BST(){

    }
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public void display(){
        display(root, 0);
    }
//    public void display(Node node, String details){
//        if(node == null){
//            return;
//        }
//        System.out.println(details + node.getValue());
//        display(node.left , "Left child of "+node.getValue()+" : ");
//        display(node.right , "Right child of "+node.getValue()+" : ");
//    }

    private static void display(Node node, int level){
        if(node == null){
            return;
        }
        display(node.right,level+1);

        if(level != 0 ){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------> "+node.value);
        }else {
            System.out.println(node.value);
        }

        display(node.left,level+1);


    }
    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }
    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }
    public void populateSorted(int[] nums,int start,int end){
        if(start>= end){
            return;
        }
        int mid = (start + end) /2;
        this.insert(nums[mid]);
        populateSorted(nums,start,mid);
        populateSorted(nums,mid+1,end);
    }

    public void insert(int value){
        root = insert(value,root);
    }
    public Node insert (int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value,node.left);
        }
        if(value > node.value){
            node.right = insert(value,node.right  );
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }


}
