package TREES;

public class binaryInsertion {
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

//    public static void main(String[] args) {
//        binaryInsertion tr = new binaryInsertion();
//
//
//    }
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
    private Node root;

    public void insert(int value){
        root = insert(value,root);
    }
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
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
            node.right = insert(value,node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }
    public void display(){
        display(root, 0);
    }
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
}
