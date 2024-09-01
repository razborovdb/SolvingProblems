package org.stackqueue.queuedlinkedlist;

public class QueuedLinkedList {
    ListNode<Integer> solution(String[] ops) {
        if (ops == null) return null;
        if (ops.length == 0) return null;
        ListNode<Integer> head = null;
        ListNode<Integer> curNode = null;
        for (String s: ops) {
            if (s == null) continue;
            if(s.length() == 0) continue;
            if (s.length() == 1) {
                if (head == null) continue;

                head = head.next;
                if (head == null) {
                    curNode = null;
                    continue;
                }
                if (head.next == null) curNode = head;
            } else {
                int i = Integer.parseInt(s.substring(2));
                ListNode<Integer> l = new ListNode<>(i);
                if (head == null) {
                    head = l;
                    curNode = head;
                } else {
                    curNode.next = l;
                    curNode = curNode.next;
                }
            }

        }
        return head;

    }

    public static void main(String[] args) {
        QueuedLinkedList queuedLinkedList = new QueuedLinkedList();
        ListNode<Integer> sol = queuedLinkedList.solution(new String[] {"e 12",
                "e 16",
                "d",
                "e 10"});
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
