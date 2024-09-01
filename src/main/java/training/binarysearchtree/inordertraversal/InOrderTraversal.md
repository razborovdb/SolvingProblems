## Description
Perform an in-order traversal of the given binary tree.

The output should be an integer array consisting of all the node values in level-first traversal order.

Since this is going to be a recursive solution, it might help to add another function to recurse, either nested, or with additional parameters, or both.

Java hint: since you can't resize arrays, you should either use something like an ArrayList to build the array, 
or else you can make an array with 100 elements (there will never be more than 100 nodes in these trees), 
load it up with values as you traverse, then copy them to a correctly-sized array with System.arraycopy after the traversal is complete.