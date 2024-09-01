## Description
Build and return a linked-list queue based on the given queue operations.

ops is an array of strings, each string starting with either e or d depending on if this if an enqueue or dequeue operation.

If the string starts with e, it will be followed by a space, followed by a non-negative integer. This integer is the value to enqueue.
(Note: be sure to convert the string to integer!)

You're building a linked list, so the value needs to be wrapped in a ListNode object.

If the operation is enqueue, the new node should be added to the tail of the list.

If the operation is dequeue, the new node should be removed from the head of the list. This value is discarded. Dequeue on an empty queue should be ignored.

You'll need a head pointer and a tail pointer to keep track of the head and tail of the list.