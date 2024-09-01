package training6.linkedlist.insert;

public class InsertLinkedList {
    public static ListNode<Integer> solution(ListNode<Integer> head, int insertNumber, int position) {
        ListNode<Integer> prev = null;
        ListNode<Integer> cur = head;
        ListNode<Integer> insertNode = new ListNode<>(insertNumber);
        int i = 0;
        while(cur != null) {
            if (i == position) {
                if(prev == null) {
                    insertNode.next = head;
                    return insertNode;
                }

                prev.next = insertNode;
                insertNode.next = cur;
                return head;
            }
            prev = cur;
            cur = prev.next;
            i++;
        }
        prev.next = insertNode;
        return head;

    }
    public static void main(String[] args) {

        ListNode<Integer> head = new ListNode<Integer>(1);
        ListNode<Integer> next1 = new ListNode<Integer>(2);
        ListNode<Integer> tail = new ListNode<Integer>(3);

        head.next = next1;
        next1.next = tail;

        ListNode<Integer> sol = solution(head, 99, 2);
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
