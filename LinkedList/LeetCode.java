package LinkedList;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class LeetCode {
    public ListNode head;

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){

            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }

        }
        return false;
    }


//    public ListNode detectCycle(ListNode head) {
//
//        // if(head == null || head.next == null){
//        //     return null;
//        // }
//
//        ListNode slow = head;
//        ListNode fast = head;
//
//        // find cycle
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if(fast == slow){
//                break;
//            }
//        }
//        if (fast == null || fast.next == null) return null;
//
//        while(head != slow){
//            head = head.next;
//            slow = slow.next;
//        }
//        return head;
//    }

    public ListNode sortList(ListNode head) {
        ListNode i = head;
        ListNode j = head;

        if(i == null){
            return null;
        }

        while(i != null){
            while(j != null){
                if(j.val < i.val){
                    int temp = j.val;
                    j.val = i.val;
                    i.val = temp;
                }
                j = j.next;
            }
            j = i.next;
            i = i.next;
        }
        display();
        return head;

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
    public int cycleLength(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){

            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode temp = slow;
                int length =0;
                do{
                    temp = temp.next;
                    length++;
                }while (temp != slow);
                return length;
            }

        }
        return 0;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;

        while(fast != null && fast.next != null){

            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                length = cycleLength(slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }
        ListNode f = head;
        ListNode s = head;
        while (length > 0){
            s = s.next;
            length--;
        }
        while(f != s){
            f = f.next;
            s = s.next;
        }
        return s;

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node1 = list1;
        ListNode node2 = list2;
        LeetCode merge = new LeetCode();

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


////    public boolean isPalindrome(ListNode head) {
////        int size = 0;
////        ListNode temp = head;
////        while(temp != null){
////            size++;
////            temp = temp.next;
////        }
////        int mid = size/2;
////
////        reverseBetween(head,mid+1,size);
////        ListNode newMid = head;
////        for (int i = 1; i < mid; i++) {
////            newMid = newMid.next;
////        }
////        ListNode start = head;
////        while (start != newMid){
////            if(start.val == newMid.val){
////                start = start.next;
////                newMid = newMid.next;
////                System.out.println(start);
////                continue;
////            }else{
////                return false;
////            }
////        }
//        return true;
//    }


    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp!= null){
            temp = temp.next;
            size++;
        }
        System.out.println(size);
        int mid = size/2;
        System.out.println(mid);
        ListNode midNode = head;
        for(int i = 0;i<mid;i++){
            midNode = midNode.next;
        }
        System.out.println(midNode.val);
        reverseBetween(head,mid+1,size);
        ListNode RightPaliFixed = head;
        for(int i = 0;i<mid;i++){
            RightPaliFixed = RightPaliFixed.next;
        }
        System.out.println("RightPaliFixed -> "+RightPaliFixed.val);
        ListNode movingRightPali = RightPaliFixed;
        ListNode movingLeftPali = head;
        while(movingLeftPali != RightPaliFixed){
            System.out.println("left -> "+movingLeftPali.val+"right - >"+movingRightPali.val);
            if(movingLeftPali.val != movingRightPali.val){

                return false;
            }
            movingLeftPali = movingLeftPali.next;
            movingRightPali = movingRightPali.next;

        }
        return true;
    }

    public void reorderList(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp!= null){
            temp = temp.next;
            size++;
        }
        System.out.println(size);
        int mid = size/2;
        System.out.println(mid);
        if(size%2 == 0){
            reverseBetween(head,mid+1,size);
        }else{
            reverseBetween(head,mid+2,size);
        }
        ListNode midNode = head;
        for (int i = 0; i < mid; i++) {
            midNode = midNode.next;
        }
        System.out.println("midnode val-> "+midNode.val);
        ListNode hf = head;
        ListNode hs;
        if(size%2 == 0){
            hs = midNode;
        }else{
            hs = midNode.next;
        }

        ListNode tempo = head;
        while(hf != midNode && hs != null){
            System.out.println("hf -> "+hf.val+" temp-> "+tempo.val+" hs-> "+hs.val);
            tempo = hf.next;
            hf.next = hs;
            hf = tempo;
            tempo = hs.next;
if(size%2 == 0){
    if(tempo != null){
        hs.next = hf;
    }
}else{
    hs.next = hf;
}





                hs = tempo;



        }
        System.out.println(hf.val);

//        System.out.println("hf -> "+hf.val+" hs-> "+hs.val);

//        hf.next = null;
        if(size%2 !=0){
            hf.next = null;
        }


        display();




    }



    public ListNode reverseKGroup(ListNode head, int k) {


        head = reverseKBetween(head,1,k,k);
        return head;


    }

    public ListNode reverseKBetween(ListNode head, int left, int right,int k) {
        if(left == right){
            return head;
        }

        ListNode node = head;
        int size =0;
        while(node != null){
            size++;
            node = node.next;
        }
        if(right >= size){
            return head;
        }

        System.out.println(size);

        ListNode leftPrev = head;
        ListNode rightNode = head;
        ListNode leftNode ;

        if(left != 1){
            for (int i = 1; i < left-1; i++) {
                leftPrev = leftPrev.next;
            }
            leftNode = leftPrev.next;
        }else{
            leftNode = head;
            leftPrev = null;
        }

        for (int i = 1;i < right; i++) {
            rightNode = rightNode.next;
        }


        ListNode rightAfter;
        if(rightNode == null){
            rightAfter = null;
        }else {
            rightAfter = rightNode.next;
        }


        ListNode prev = leftNode;
        ListNode present = leftNode.next;

        ListNode next = present.next;
        if(present == null){
            present.next = prev;
            prev = present;
        }else {
            while(present != rightAfter){
                present.next = prev;
                prev = present;
                present = next;
                if(next != null){
                    next = next.next;
                }
            }
        }

        if(leftPrev != null){
            leftPrev.next = prev;
        }
        if(rightAfter != null){
            leftNode.next = rightAfter;
        }else{
            leftNode.next = null;
        }
        if(leftPrev == null){
            head = prev;
        }
        if(size == 2){
            head = prev;
        }
        ListNode temp = head;
        System.out.print("HEAD -> ");
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print(" END");
        System.out.println();
        reverseKBetween(head, left+(2*k), right+(2*k), k);



//        display();
        return head;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode node = head;
        int size =0;
        while(node != null){
            size++;
            node = node.next;
        }
        int parse = k % size;
        for (int i = 0; i < parse; i++) {
            head = deleteEnd(head);
        }
        return head;
    }
    public ListNode deleteEnd(ListNode head){
        ListNode node = head;
        while (node.next.next != null){
            node = node.next;
        }
        ListNode Last = node.next;
        Last.next = head;
        head = Last;
        node.next = null;
        ListNode temp = head;
        System.out.print("HEAD -> ");
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print(" END");
        System.out.println();
        return head;
    }









    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        ListNode node = head;
        int size =0;
        while(node != null){
            size++;
            node = node.next;
        }

        System.out.println(size);

        ListNode leftPrev = head;
        ListNode rightNode = head;
        ListNode leftNode ;

        if(left != 1){
            for (int i = 1; i < left-1; i++) {
                leftPrev = leftPrev.next;
            }
            leftNode = leftPrev.next;
        }else{
            leftNode = head;
            leftPrev = null;
        }

        for (int i = 1;i < right; i++) {
            rightNode = rightNode.next;
        }


        ListNode rightAfter;
        if(rightNode == null){
            rightAfter = null;
        }else {
            rightAfter = rightNode.next;
        }


        ListNode prev = leftNode;
        ListNode present = leftNode.next;

        ListNode next = present.next;
        if(present == null){
            present.next = prev;
            prev = present;
        }else {
            while(present != rightAfter){
                present.next = prev;
                prev = present;
                present = next;
                if(next != null){
                    next = next.next;
                }
            }
        }

if(leftPrev != null){
    leftPrev.next = prev;
}
        if(rightAfter != null){
    leftNode.next = rightAfter;
}else{
    leftNode.next = null;
}
        if(leftPrev == null){
            head = prev;
        }
        if(size == 2){
            head = prev;
        }
        ListNode temp = head;
        System.out.print("HEAD -> ");
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print(" END");
        System.out.println();



//        display();
        return head;
    }
    public ListNode deleteDuplicates(ListNode head) {

        HashMap<Integer, Integer> map = new HashMap<>();

        ListNode temp = head;
        while(temp != null){

            

            temp = temp.next;
        }


        return head;

    }

    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return head;
        }
        if(head.next == null){
            return head;
        }

        ListNode left = head;
        ListNode present = head;
        ListNode next = present.next;

        present.next = next.next;
        next.next = present;
        head = next;
        System.out.println(head.val);
        System.out.println("left -> "+left.val);
        System.out.println("present -> "+present.val);
        System.out.println("next -> "+next.val);

        while( present.next != null && next.next != null){
            left = present;
            present = present.next;
            if(present.next == null){
                break;
            }
            next = present.next;
            System.out.println("left -> "+left.val);
            System.out.println("present -> "+present.val);
            System.out.println("next -> "+next.val);
            present.next = next.next;
            next.next = present;
            left.next = next;
        }




        ListNode temp = head;
        System.out.print("HEAD -> ");
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print(" END");
        System.out.println();
        System.out.println("left -> "+left.val);
        System.out.println("present -> "+present.val);
        System.out.println("next -> "+next.val);
        return head;
    }

    public ListNode doubleIt(ListNode head) {

        head = reverseList(head);
        ListNode temp = head;
        int carry = 0;
        LeetCode newList = new LeetCode();
        while(temp != null){
            int multiply = temp.val * 2;
            int toAdd = (multiply % 10)+ carry;
            carry = multiply / 10;
            newList.insertFirst(toAdd);

            temp = temp.next;
        }
        if(carry != 0){
            newList.insertFirst(carry);
        }
        newList.display();





        return head;
    }
    public ListNode reverseList(ListNode head) {
        ListNode front = head;
        LeetCode reverse = new LeetCode();
        while(front != null){
            reverse.insertFirst(front.val);
            front = front.next;
        }

        reverse.display();

        return reverse.head;
    }

    public ListNode removeNodes(ListNode head) {

        ListNode temp = head;

        ListNode check = head;
        LeetCode newList = new LeetCode();

        while( temp != null ){
            if( temp.next != null ){
                check = temp.next;
            }else{
                break;
            }
            while( check != null){
                if(check.val > temp.val){
                    temp.val = -100;
                    break;
                }
                check = check.next;
            }
            temp = temp.next;
        }
        display();

        ListNode var = head;
        while(var != null){
            if(var.val != -100){
                newList.insertLast(var.val);
            }
            var = var.next;
        }
        newList.display();

        return newList.head;

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
    public void insertFirst(int val){
        ListNode node = new ListNode(val);
        node.next = head;

        head = node;

    }





      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

}
