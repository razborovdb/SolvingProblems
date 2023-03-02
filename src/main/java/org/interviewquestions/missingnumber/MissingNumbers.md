## Description
Given an array of non-duplicating numbers from 1 to n where one number is missing, write an efficient java program to find that missing number.
Idea is to find the sum of n natural numbers using the formula and then finding the sum of numbers in the given array. Subtracting these two sums
results in the number that is the actual missing number. This results in O(n) time complexity and O(1) space complexity.