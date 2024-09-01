package training6.recursion.findvalueinlinkedlist;

public class FindValueInLinkedList {
    public static boolean solution(ListNode<Integer> head, int target) {
        if(head == null) return false;
        if(head.value == target) return true;
        return solution(head.next, target);

    }

    public static void main(String[] args) {

        ListNode<Integer> head = new ListNode<Integer>(1);
        ListNode<Integer> next1 = new ListNode<Integer>(2);
        ListNode<Integer> tail = new ListNode<Integer>(3);

        head.next = next1;
        next1.next = tail;
        boolean sol = solution(head, 2);
        System.out.println(sol);
    }
}
