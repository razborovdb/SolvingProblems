package amazon.sortlist;

public class SortList {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode tail = head;
        while (fast != null && fast.next != null) {
            tail = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        tail.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        return merge(left, right);

    }
    public ListNode merge(ListNode left, ListNode right) {
        ListNode head = null;
        if (left.val > right.val) {
            head = right;
            right = right.next;
        } else {
            head = left;
            left = left.next;
        }
        ListNode tail = head;
        while(left != null && right != null) {
            if (left.val > right.val) {
                tail.next = right;
                right = right.next;
            } else {
                tail.next = left;
                left = left.next;
            }
            tail = tail.next;
        }
        if(left != null) {
            tail.next = left;
        }
        if(right != null) {
            tail.next = right;

        }
        return head;
    }
}
