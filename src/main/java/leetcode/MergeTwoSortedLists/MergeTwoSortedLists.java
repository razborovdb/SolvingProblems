package leetcode.MergeTwoSortedLists;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        // answer 1,1,2,3,4,4

        ListNode n3 =  new ListNode(4);
        ListNode n2 =  new ListNode(2, n3);
        ListNode n1 =  new ListNode(1, n2);

        ListNode l3 =  new ListNode(4);
        ListNode l2 =  new ListNode(3, l3);
        ListNode l1 =  new ListNode(1, l2);

        ListNode result = solution(n1, l1);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }
    public static ListNode solution(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode list = null;
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null ) {
            return list2;
        }
        if (list2 == null ) {
            return list1;
        }

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                if (list == null) {
                    list = list1;
                    head = list1;
                } else {
                    list.next = list1;
                    list = list.next;
                }
                list1 = list1.next;
            } else {
                if (list == null) {
                    list = list2;
                    head = list2;
                } else {
                    list.next = list2;
                    list = list.next;
                }
                list2 = list2.next;
            }
        }

        if (list1 != null) {
            list.next = list1;
        }
        if (list2 != null) {
            list.next = list2;
        }

        return head;
    }
}
