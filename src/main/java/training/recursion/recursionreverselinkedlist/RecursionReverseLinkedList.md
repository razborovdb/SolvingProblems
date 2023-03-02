## Description
Recursively reverse a linked list. You'll be passed a list pointed to by head, and you'll return the reversed version of it.

You must use recursion to solve this.

The reverse of an empty list (i.e. head is null) is an empty list (i.e. return null).

You need to define this problem in terms of itself, e.g.: "Reversing a linked list is like doing something to a single node and then reversing the remainder of the list."

Thinking about it more, maybe, "Reversing a linked list is like reversing the first two nodes and then reversing the remainder of the list."

It might be useful to make your own recursive function that the solution() function calls. This way you can pass in more arguments if you need to.