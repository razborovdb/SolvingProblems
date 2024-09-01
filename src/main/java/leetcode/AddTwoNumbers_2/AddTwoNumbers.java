package leetcode.AddTwoNumbers_2;


import java.util.LinkedList;
import java.util.Queue;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode nextNode = new ListNode(4);
        l1.next = nextNode;
        ListNode nextNode2 = new ListNode(3);
        nextNode.next = nextNode2;
        print(l1);

        ListNode l2 = new ListNode(5);
        nextNode = new ListNode(6);
        l2.next = nextNode;
        nextNode2 = new ListNode(4);
        nextNode.next = nextNode2;
        print(l2);
        // 708
        print(addTwoNumbers(l1,l2));
    }


    public static void print(ListNode l) {
        ListNode cur = l;
        while (cur != null) {
            System.out.print(cur.val);
            cur = cur.next;
        }
        System.out.println();
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Queue<Integer> queue = new LinkedList<>();
        int addToNext = 0;
        while(l1 != null && l2 != null) {
            int sum2 = l1.val + l2.val + addToNext;
            addToNext = sum2 / 10;
            queue.add(sum2 % 10);
            l1 = l1.next;
            l2 = l2.next;
            //System.out.println(addToNext);
        }

        //System.out.println(addToNext);

        while(l1 != null) {
            int sum2 = l1.val + addToNext;
            addToNext = sum2 / 10;
            queue.add(sum2 % 10);
            l1 = l1.next;
        }
        while(l2 != null) {
            int sum2 = l2.val + addToNext;
            addToNext = sum2 / 10;
            queue.add(sum2 % 10);
            l2 = l2.next;
        }
        //System.out.println(addToNext);
        if (addToNext != 0) {
            queue.add(addToNext);
        }

        ListNode result2 = new ListNode();
        ListNode curNode2 = null;
        while (!queue.isEmpty()) {
            int curVal = queue.poll();
            if (curNode2 == null) {
                curNode2 = result2;
                curNode2.val = curVal;
            } else {
                ListNode newNode = new ListNode(curVal);
                curNode2.next = newNode;
                curNode2 = curNode2.next;
            }
        }



        return result2;
    }

}
