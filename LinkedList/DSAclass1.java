package LinkedList;

import java.util.LinkedList;

public class DSAclass1 {
    private Node head;
    private Node tail;
    public int size;

    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;

        head = node;

    }
    public void display(){
        Node temp = head;
        System.out.print("HEAD -> ");
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print(" END");
        System.out.println();
    }
    public void insert(int value, int index){
        Node node = new Node(value);
        Node temp = head;
        if(head == null){
            insertFirst(value);
            return;
        }
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            node.next = head;
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }
    public void delete(int value){
        Node node = head;
        if(head == null){
            return;
        }
        if(node.val == value){
            head = head.next;
            return;
        }
        while(node != null){
            if(node.next.val == value){
                node.next = node.next.next;
                return;
            }
            node = node.next;
        }

    }

    public static void main(String[] args) {
//        DSAclass1 linkedList = new DSAclass1();
//        linkedList.insertFirst(10);
//        linkedList.insertLast(20);
//        linkedList.insertLast(30);
//        linkedList.insert(15,3);
//        linkedList.delete(15);
//        System.out.println(linkedList.head.val);
//        linkedList.display();

//        CLL circular = new CLL();
//        circular.insert(10);
//        circular.insert(20);
//        circular.insert(30);
//        circular.display();

//        DLL doubly = new DLL();
//        doubly.insertFirst(10);
//        doubly.insertFirst(20);
//        doubly.insertFirst(30);
//        doubly.insertLast(40);
//        doubly.display();

        LeetCode list = new LeetCode();
        list.insertFirst(5);
        list.insertFirst(5);
        list.insertFirst(5);
        list.insertFirst(5);
        list.insertFirst(5);


        list.display();
        list.removeNodes(list.head);
//        list.deleteDuplicates(list.head);





    }


}
