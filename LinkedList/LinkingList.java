package LinkedList;


import org.w3c.dom.Node;

import java.util.ArrayList;

public class LinkingList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(1);
//        list.insertFirst(1);
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(2);
//        list.insertFirst(3);
//
//        list.display();
//        ListNode listNode = new ListNode();


//        DLL list = new DLL();
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(4);
//        list.display();
//        System.out.println();
//        list.revDisplay();
//        list.find(3);
//        list.insert(10,4);
//        list.display();
//        System.out.println();
//        list.revDisplay();

//        CLL list = new CLL();
//        list.insert(1);
//        list.insert(2);
//        list.insert(3);
//        list.insert(4);
//        list.insert(5);
//        list.display();
//        System.out.println();
//        list.delete(3);
//        list.display();



//        LeetCode list1 = new LeetCode();
//        list1.insertLast(1);
//        list1.insertLast(2);
//        list1.insertLast(4);
//        list1.display();
//
//        LeetCode list2 = new LeetCode();
//        list2.insertFirst(4);
//        list2.insertFirst(3);
//        list2.insertFirst(1);
//        list2.display();
//        list1.mergeTwoLists(list1.head, list2.head);
//        LeetCode cycle = new LeetCode();
//        cycle.insertLast(3);
//        cycle.insertLast(2);
//        cycle.insertLast(0);
//        cycle.insertLast(1);
//        cycle.display();
//        cycle.sortList(cycle.head);
//        cycle.display();
        LeetCode list = new LeetCode();
//        list.insertFirst(7);
//        list.insertFirst(6);
//        list.insertFirst(5);
//        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);


        list.display();
        list.rotateRight(list.head, 10);



//        list.reorderList(list.head);
//        list.reverseBetween(list.head, 1,2);
//        list.reverseBetween(list.head, 1,2);
//        list.reverseList(list.head);
//        list.display();


//        System.out.println(list.isPalindrome(list.head));

//        System.out.println(isHappy(49));



    }
    public static boolean isHappy(int n) {

        int slow = n;
        int fast = n;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while (fast != slow);
        if(slow == 1){
            return true;
        }
        return false;


    }
    public static int findSquare(int num){
        int ans = 0;
        while (num > 0){
            int rem = num %10;
            ans = ans + rem*rem;
            num = num/10;
        }
        return ans;
    }



    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        if(head == null){
            return null;
        }
        while(node != null){
            if(node.next !=null){
                if(node.next.val == node.val){
                    ListNode temp = node;
                    temp.next = node.next.next;
                    continue;
                }else{
                    node = node.next;
                    continue;
                }
            }else {
                break;
            }
        }
        return head;
    }
}
