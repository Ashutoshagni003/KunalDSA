package LinkedList;


import org.w3c.dom.Node;

public class LL {
    private Node head;
    private Node tail;
    public int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        if(tail == null){
            tail = head;
        }
        head = node;
        size++;
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
    public void InsertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
//        node.next = null;

            tail.next = node;

        tail = node;
        size++;
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
    public void insertRec(int value,int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        Node node = head;
        recInsert(value,index,node);

    }
    public void recInsert(int value,int index,Node node){
        if(node.next != null){
            if(index == 1){
                Node newNode = new Node(value);
                newNode.next = node.next;
                node.next = newNode;
                return;
            }
            recInsert(value,index-1,node.next);
        }
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

    public void deleteRec(int value){
        Node node = head;
        if(node.val == value){
            head = head.next;
            return;
        }
        rec(value,node);

    }
    public void rec(int value, Node node){
        if(node.next != null){
            if(node.next.val == value){
                node.next = node.next.next;
                return;
            }
            rec(value, node.next);
        }
    }



    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }



}
