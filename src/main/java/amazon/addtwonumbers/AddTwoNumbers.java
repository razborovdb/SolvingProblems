package amazon.addtwonumbers;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultTail = null;
        ListNode result = null;
        int left = 0;
        while (l1 != null && l2 != null) {
            ListNode nextNode = new ListNode((l1.val + l2.val + left) % 10);
            left = (l1.val + l2.val + left) / 10;
            if (resultTail == null) {
                resultTail = nextNode;
                result = resultTail;
            } else {
                resultTail.next = nextNode;
                resultTail = resultTail.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            ListNode nextNode = new ListNode((l1.val + left) % 10);
            left = (l1.val + left) / 10;
            resultTail.next = nextNode;
            resultTail = resultTail.next;
            l1 = l1.next;

        }

        while (l2 != null) {
            ListNode nextNode = new ListNode((l2.val + left) % 10);
            left = (l2.val + left) / 10;
            resultTail.next = nextNode;
            resultTail = resultTail.next;

            l2 = l2.next;
        }

        if (left != 0) {
            ListNode nextNode = new ListNode(left % 10);
            resultTail.next = nextNode;
        }

        return result;


    }
}
