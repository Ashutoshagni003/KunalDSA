package TREES;

public class Traversals {
    private class Node{
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value){
            this.value = value;
        }

        public int getValue(int value){
            return value;
        }
    }
    private Node root;

    public static void main(String[] args) {

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
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void InOrder(){
        InOrder(root);
    }
    private void InOrder(Node node){
        if(node == null){
            return;
        }

        InOrder(node.left);
        System.out.println(node.value+" ");
        InOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+" ");
    }


}
