package org.linkedlist.insert;

public class InsertLinkedList {
    // Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
    ListNode<Integer> solution(ListNode<Integer> head, int value, int index) {
        ListNode<Integer> newLn = new ListNode<Integer>(value);
        if (head == null) return newLn;
        if (index <= 0) {
            newLn.next = head;
            return newLn;
        }
        ListNode<Integer> curNode = head;
        ListNode<Integer> prevNode = head;

        int curIndex = 0;
        while(curIndex < index && curNode != null) {
            prevNode = curNode;
            curNode = curNode.next;
            curIndex++;
        }
        newLn.next = prevNode.next;
        prevNode.next = newLn;


        return head;

    }

    public static void main(String[] args) {
        InsertLinkedList insertLinkedList = new InsertLinkedList();
        ListNode<Integer> head = new ListNode<Integer>(1);
        ListNode<Integer> next1 = new ListNode<Integer>(2);
        ListNode<Integer> tail = new ListNode<Integer>(3);

        head.next = next1;
        next1.next = tail;

        //ListNode<Integer> sol = insertLinkedList.solution(head, 99, 0);
        //ListNode<Integer> sol = insertLinkedList.solution(head, 99, 3);
        //ListNode<Integer> sol = insertLinkedList.solution(head, 99, 1);
        ListNode<Integer> sol = insertLinkedList.solution(head, 99, 2);
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
