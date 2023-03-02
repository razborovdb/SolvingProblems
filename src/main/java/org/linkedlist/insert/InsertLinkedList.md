## Description
Given the head of a linked list, a new value, and an index to insert before, make a new node with the given value and insert it in the list before the given index.

If the index is less than or equal to zero, the new node will be inserted at the head of the list.

If the index is greater than or equal to the length of the existing list, the new node should be appended on the end of the list.

Otherwise, the new node will be inserted into the list before the given index.

The index is zero-based.

You'll have to construct a new ListNode to hold the value.

Your solution should be O(n). And you should be able to do it with a single pass through the list.