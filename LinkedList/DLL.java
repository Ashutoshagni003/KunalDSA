package LinkedList;

public class DLL {

        private int value;
        private Node head;
        private Node tail;

        public void insertFirst(int value){
            Node node = new Node(value);
            node.next = head;
            node.prev = null;

            if(node.next != null){
                node.next.prev = node;
            }
            head = node;
            System.out.println(node.value);
        }

        public void insertLast(int value){
            Node node = new Node(value);
            if(head == null){
                insertFirst(value);
                return;
            }
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            node.next = null;
            temp.next = node;
            node.prev = temp;
        }
        public Node find(int target){
            Node temp = head;
            if(head == null){
                return null;
            }
            while(temp.next != null){
                if(temp.value == target){
                    System.out.println("\n"+temp.value);
                    return temp;
                }
                temp = temp.next;
            }
            return null;
        }

        public void insert(int value, int index){
            Node node = new Node(value);
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                if(temp != null){
                    temp = temp.next;
                }
            }

            if(temp.next == null){

                node.next = null;
            }else{
                node.next = temp.next;
                node.next.prev = node;
            }

            node.prev = temp;
            temp.next = node;


        }
        public void display(){
            Node temp = head;
            if(head == null){
                return;
            }
            int count = 0;
            System.out.print("HEAD -> ");
            while (temp != null){
                count++;
                System.out.print(temp.value+" -> ");
                temp = temp.next;
            }

            System.out.print("END");
            System.out.println();
            System.out.println("COUNT -> "+count);
        }

    public void revDisplay(){
        Node Tailtemp = head;

        if(head == null){
            return;
        }

        while(Tailtemp.next != null){
            Tailtemp = Tailtemp.next;
        }

        System.out.print("HEAD -> ");
        while (Tailtemp != null){
            System.out.print(Tailtemp.value+" -> ");
            Tailtemp = Tailtemp.prev;
        }
        System.out.print("END");
    }

        private class Node{
            private int value;
            private Node next;
            private Node prev;

            public Node(int value){
                this.value = value;
            }
            public Node(int value,Node next,Node prev){
                this.value = value;
                this.next = next;
                this.prev = prev;

            }

        }




}
