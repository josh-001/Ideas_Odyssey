### Find All Pairs with a Given Sum 🔢

Problem Statement:

Given an array of integers and a target sum, find all unique pairs of elements in the array that add up to the target sum.

Topic : Arrays

Difficulty :  Medium

Input:

An array of integers arr.
An integer target, representing the target sum.

Output:

Print each unique pair that adds up to the target sum.

Example:

Input:

arr = [1, 5, 7, -1, 5]

target = 6

Output:

(1, 5)

(7, -1)

Explanation:

The pair (1, 5) adds up to 6.

The pair (7, -1) also adds up to 6.

Duplicate pairs, such as (5, 1), should not be counted as unique, and duplicate elements should be used only once.

Constraints:

1 ≤ len(arr) ≤ 10^5

−10^5 ≤ arr[i],
target ≤ 10^5


Hints:

Use a data structure like a set to check for complements efficiently.
Avoid using nested loops to keep the time complexity low.