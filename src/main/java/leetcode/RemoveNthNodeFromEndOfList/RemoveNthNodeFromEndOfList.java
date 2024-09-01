package leetcode.RemoveNthNodeFromEndOfList;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        // answer 1,2,3,5
        ListNode n5 =  new ListNode(5);
        ListNode n4 =  new ListNode(4, n5);
        ListNode n3 =  new ListNode(3, n4);
        ListNode n2 =  new ListNode(2, n3);
        ListNode n1 =  new ListNode(1, n2);

        ListNode result = removeNthFromEnd(n1, 2);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list =  new ArrayList<>();
        ListNode cur = head;

        while (cur != null) {
            list.add(cur);
            cur = cur.next;
        }

        int lSize = list.size();
        if (lSize == n) {
            return head.next;
        }

        list.get(lSize-n-1).next = list.get(lSize-n).next;

        return head;
    }
}
