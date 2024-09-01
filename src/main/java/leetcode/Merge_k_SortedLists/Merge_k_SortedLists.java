package leetcode.Merge_k_SortedLists;

import java.util.ArrayList;
import java.util.List;

public class Merge_k_SortedLists {
    public static void main(String[] args) {
        // answer 1,1,2,3,4,4

        ListNode n3 =  new ListNode(4);
        ListNode n2 =  new ListNode(2, n3);
        ListNode n1 =  new ListNode(1, n2);

        ListNode l3 =  new ListNode(4);
        ListNode l2 =  new ListNode(3, l3);
        ListNode l1 =  new ListNode(1, l2);

        ListNode result = mergeKLists(new ListNode[]{n1, l1});

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> result = new ArrayList<>();
        ListNode head = null;
        ListNode cur = null;
        for (ListNode next: lists) {
            if (next != null) {
                result.add(next);
            }
        }

        if (result.size() == 0) {
            return null;
        }

        while (result.size() > 0) {
            int index = 0;
            int minVal = result.get(index).val;
            for (int i = 1; i < result.size(); i++) {
                if (result.get(i).val < minVal) {
                    minVal = result.get(i).val;
                    index = i;
                }
            }

            if (head == null) {
                head = result.get(index);
                cur = result.get(index);
                result.set(index, result.get(index).next);
                if (result.get(index) == null) {
                    result.remove(index);
                }
            } else {
                cur.next = result.get(index);
                cur = cur.next;
                result.set(index, result.get(index).next);
                if (result.get(index) == null) {
                    result.remove(index);
                }
            }
        }


        return head;


    }
}
