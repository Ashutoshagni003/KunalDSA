package LinkedList;

public class MergerSort {
    private ListNode head;

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left,right);
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void insertLast(int val){
        ListNode node = new ListNode(val);
        if(head == null){
            node.next = head;
            head = node;
            return;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
//        node.next = null;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node1 = list1;
        ListNode node2 = list2;
        MergerSort merge = new MergerSort();

        while(node1 != null && node2 != null){
            if(node1.val <= node2.val){
                merge.insertLast(node1.val);
                node1 = node1.next;
            }else{
                merge.insertLast(node2.val);
                node2 = node2.next;
            }

        }

        while(node2 != null){
            merge.insertLast(node2.val);
            node2 = node2.next;
        }


        while(node1 != null){
            merge.insertLast(node1.val);
            node1 = node1.next;
        }

        merge.display();
        return merge.head;
    }
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int nodeIndex = size/2;
        temp = head;
        for (int i = 0; i < nodeIndex; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display(){
        ListNode temp = head;
        System.out.print("HEAD -> ");
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print(" END");
        System.out.println();
    }
}
