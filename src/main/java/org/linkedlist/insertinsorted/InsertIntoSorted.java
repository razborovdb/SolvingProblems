package org.linkedlist.insertinsorted;

public class InsertIntoSorted {
    ListNode<Integer> solution(ListNode<Integer> l, int value) {
        ListNode<Integer> newL = new ListNode<Integer>(value);
        if (l == null) return newL;
        if (value <= l.value) {
            newL.next = l;
            return newL;
        }
        ListNode<Integer> curNode = l;
        ListNode<Integer> prevNode = l;
        while (curNode != null) {
            if (prevNode.value <= value && curNode.value > value) {
                newL.next = prevNode.next;
                prevNode.next = newL;
                return l;
            }
            prevNode = curNode;
            curNode = curNode.next;
        }
        newL.next = prevNode.next;
        prevNode.next = newL;
        return l;
    }
    public static void main(String[] args) {
        InsertIntoSorted insertLinkedList = new InsertIntoSorted();
        ListNode<Integer> head = new ListNode<>(1);
        ListNode<Integer> next1 = new ListNode<>(3);
        ListNode<Integer> next2 = new ListNode<>(4);
        ListNode<Integer> tail = new ListNode<>(6);

        head.next = next1;
        next1.next = next2;
        next2.next = tail;

        ListNode<Integer> sol = insertLinkedList.solution(head, 5);
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
