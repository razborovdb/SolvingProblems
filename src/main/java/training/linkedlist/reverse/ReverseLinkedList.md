## Description
Given a list, return a list with all the values reversed.

This is a classic interview problem.

One way is to convert the list to an array, reverse the array, and then convert the array back to a list.

But this is considered suboptimal.

It's better to reverse the list simply by rearranging the pointers in the .next fields and then returning the old tail as the new head.

If the input list is empty, return an empty list (null or None).

You do not need to uncomment the ListNode code in the header. That's just there for your reference.

Note the the tests will show the linked lists as if they are arrays. This is just the visual representation; under the hood, it's a linked list with those values.