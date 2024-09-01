package org.recursion.recursionreverselinkedlist;

public class RecursionReverseLinkedList {
    ListNode<Integer> solution(ListNode<Integer> head) {
        if (head == null) return head;
        if (head.next == null) return head;
        ListNode<Integer> nextNode = head.next;
        ListNode<Integer> curNode = head;
        ListNode<Integer> prevNode = null;
        return recursion(prevNode, curNode, nextNode);
    }

    ListNode<Integer> recursion(ListNode<Integer> prevNode, ListNode<Integer> curNode, ListNode<Integer> nextNode) {
        if (nextNode == null) {
            curNode.next = prevNode;
            return curNode;

        }

        curNode.next = prevNode;
        prevNode = curNode;
        curNode = nextNode;
        nextNode = curNode.next;
        return recursion(prevNode, curNode, nextNode);


    }

    public static void main(String[] args) {
        RecursionReverseLinkedList recursionReverseLinkedList = new RecursionReverseLinkedList();
        ListNode<Integer> head = new ListNode<>(1);
        ListNode<Integer> next1 = new ListNode<>(3);
        ListNode<Integer> next2 = new ListNode<>(4);
        ListNode<Integer> tail = new ListNode<>(6);

        head.next = next1;
        next1.next = next2;
        next2.next = tail;

        ListNode<Integer> sol = recursionReverseLinkedList.solution(head);
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
