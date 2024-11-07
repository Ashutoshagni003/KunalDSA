package LinkedList;

public class CLL {

    private Node head;
    private Node tail;

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            System.out.println(node.value);
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        System.out.println(node.value);

    }
    public void delete(int target){
        Node node = head;
        if(head == null){
            return;
        }
        if(node.value == target){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.value == target){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);
    }
    public void display(){
        Node temp = head;
        if(head!=null){
            do{
                System.out.print(temp.value+" -> ");
                temp = temp.next;
            }while (temp != head);
        }
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }
}
