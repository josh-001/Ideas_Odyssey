### Sort an Array of -1, 0, and 1 🔢

Problem Statement:

Given an array consisting of only -1, 0, and 1, write a program to sort the array in-place without using any inbuilt sort functions. The expected solution should run in O(N) time complexity with constant space.

Topic : Arrays

Difficulty :  Tough


Input :

    An array of integers arr where each element is -1, 0, or 1.
Output :

Sort the array in place so that all -1s come first, followed by all 0s, and then all 1s.

Example :

Input:
arr = [0, -1, 1, 0, -1, 1, 1, -1, 0]

Output:
[-1, -1, -1, 0, 0, 0, 1, 1, 1]

Hint :

This problem can be solved using the Dutch National Flag Algorithm. Here’s a helpful video that explains the algorithm step-by-step.
https://youtu.be/BOt1DAvR0zI?si=5ZP1Az6k7OoM1CUF

Approach :

    1. Use three pointers:
    * low for tracking the end of the -1 section.
    * mid for iterating through the array.
    * high for tracking the start of the 1 section.
    2. Traverse the array using the mid pointer:
    * If the current element is -1, swap it with the element at low, then increment both low and mid.
    * If the current element is 0, just move the mid pointer.
    * If the current element is 1, swap it with the element at high, then decrement high.