package org.linkedlist.merge;

public class MergeLinkedList {
    ListNode<Integer> solution(ListNode<Integer> l1, ListNode<Integer> l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode<Integer> curL1 = l1;
        ListNode<Integer> curL2 = l2;
        ListNode<Integer> head = null;
        if (curL1.value < curL2.value) {
            head = curL1;
            curL1 = curL1.next;
        } else {
            head = curL2;
            curL2 = curL2.next;
        }
        ListNode<Integer> curNew = head;
        while(curL1 != null && curL2 != null) {
            if (curL1.value < curL2.value) {
                curNew.next = curL1;
                curNew = curNew.next;
                curL1 = curL1.next;
            } else {
                curNew.next = curL2;
                curNew = curNew.next;
                curL2 = curL2.next;
            }
        }
        while(curL1 != null) {
            curNew.next = curL1;
            curNew = curNew.next;
            curL1 = curL1.next;
        }
        while(curL2 != null) {
            curNew.next = curL2;
            curNew = curNew.next;
            curL2 = curL2.next;
        }

        return head;
    }
    public static void main(String[] args) {
        MergeLinkedList mergeLinkedList = new MergeLinkedList();
        ListNode<Integer> head = new ListNode<>(1);
        ListNode<Integer> next1 = new ListNode<>(19);
        ListNode<Integer> next2 = new ListNode<>(145);
        ListNode<Integer> tail = new ListNode<>(543);

        head.next = next1;
        next1.next = next2;
        next2.next = tail;

        ListNode<Integer> head2 = new ListNode<>(14);
        ListNode<Integer> next21 = new ListNode<>(16);
        ListNode<Integer> next22 = new ListNode<>(123);
        ListNode<Integer> tail2 = new ListNode<>(432);

        head2.next = next21;
        next21.next = next22;
        next22.next = tail2;

        ListNode<Integer> sol = mergeLinkedList.solution(head, head2);
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
