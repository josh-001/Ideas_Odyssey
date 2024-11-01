### Find the First Non-Repeating Element 🔍

Problem Statement:

Given an array of integers, find the first non-repeating element in the array. If there’s no non-repeating element, return -1.

Input:

An array of integers arr.
Output:

The first non-repeating integer in the array, or -1 if every element repeats.

Example:

Input: 
  arr = [4, 5, 1, 2, 0, 4]

Output:

5

Explanation:

The number 5 is the first element in the array that doesn’t repeat.

Constraints:

1≤len(arr)≤10^5

The elements of arr can be any integer within the typical range of integers.


#### Approach and Hints:

    * Use a hash map to count the frequency of each element in the array.

    * Traverse the array to find the first element with a frequency of 1.

    * This approach is efficient with a time complexity of  O(n), as both the counting and lookup operations are O(1) on average with hash maps.