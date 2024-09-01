package training3.linkedlist.insert;

public class InsertLinkedList {

    public static ListNode<Integer> solution(ListNode<Integer> head, int num, int index) {
        ListNode<Integer> ins = new ListNode<>(num);
        if (index <= 0) {
            ListNode<Integer> temp = head;
            head = ins;
            head.next = temp;
            return head;
        }

        int i = 1;
        ListNode<Integer> prev = head;
        ListNode<Integer> cur = head.next;
        while(i <= index && cur != null) {
            if (i == index) {
                prev.next = ins;
                ins.next = cur;
                return head;
            }
            prev = cur;
            cur = cur.next;

            i++;
        }

        prev.next = ins;
        return head;
    }
    public static void main(String[] args) {

        ListNode<Integer> head = new ListNode<Integer>(1);
        ListNode<Integer> next1 = new ListNode<Integer>(2);
        ListNode<Integer> tail = new ListNode<Integer>(3);

        head.next = next1;
        next1.next = tail;

        ListNode<Integer> sol = solution(head, 99, 5);
        printNodes(sol);

    }
    public static void printNodes(ListNode<Integer> head) {
        ListNode<Integer> curNode = head;
        while (curNode != null) {
            System.out.print(curNode.value + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }
}
