package org.linkedlist.reverse;

public class ReverseLinkedList {
    ListNode<Integer> solution(ListNode<Integer> head) {
        if (head == null) return head;
        if (head.next == null) return head;
        ListNode<Integer> nextNode = head.next;
        ListNode<Integer> curNode = head;
        ListNode<Integer> prevNode = null;

        while (nextNode != null) {
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
            nextNode = curNode.next;

        }
        curNode.next = prevNode;
        return curNode;


    }

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode<Integer> head = new ListNode<>(1);
        ListNode<Integer> next1 = new ListNode<>(3);
        ListNode<Integer> next2 = new ListNode<>(4);
        ListNode<Integer> tail = new ListNode<>(6);

        head.next = next1;
        next1.next = next2;
        next2.next = tail;

        ListNode<Integer> sol = reverseLinkedList.solution(head);
        printNodes(sol);

    }
    public static void printNodes(ListNode<Integer> head) {
        ListNode<Integer> curNode = head;
        if (curNode == null) {
            System.out.println("null");
        }
        while (curNode != null) {
            System.out.print(curNode.value + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }
}
