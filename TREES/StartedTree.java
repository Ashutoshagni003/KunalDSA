package TREES;

import org.w3c.dom.Node;

import java.util.Scanner;

public class StartedTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StartedTree tree = new StartedTree();
        tree.populate(scanner);
        tree.display();
    }
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }
    private static Node root;

    public static void populate(Scanner scanner){
        System.out.println("Insert Root Value : ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }
    private static void populate(Scanner scanner,Node node){
        System.out.println("Want to enter on left of "+node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of left node - > ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("Want to enter on right of "+node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of right node -> ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);
        }
    }
    public static void display(){
        display(root,0);
    }
    private static void display(Node node,int level){
        if(node == null){
            return;
        }
        display(node.right,level+1);

        if(level != 0 ){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|--------> "+node.value);
        }else {
            System.out.println(node.value);
        }

        display(node.left,level+1);


    }
}

