Given an array a, your task is to apply the following mutation to it:

Array a mutates into a new array b of the same length
For each i from 0 to a.length - 1 inclusive, b[i] = a[i - 1] + a[i] + a[i + 1]
If some element in the sum a[i - 1] + a[i] + a[i + 1] does not exist, it is considered to be 0
For example, b[0] equals 0 + a[0] + a[1]
Example

For a = [4, 0, 1, -2, 3], the output should be solution(a) = [4, 5, -1, 2, 1].

Explanation:

b[0] = 0 + a[0] + a[1] = 0 + 4 + 0 = 4
b[1] = a[0] + a[1] + a[2] = 4 + 0 + 1 = 5
b[2] = a[1] + a[2] + a[3] = 0 + 1 + (-2) = -1
b[3] = a[2] + a[3] + a[4] = 1 + (-2) + 3 = 2
b[4] = a[3] + a[4] + 0 = (-2) + 3 + 0 = 1
So, the mutated answer array is [4, 5, -1, 2, 1].