### Reverse a Doubly Linked List 🔄

Problem Statement:

You are given a doubly linked list of size N, consisting of positive integers. Your task is to reverse the doubly linked list and return the head of the modified list.

Topic : Doubly Linked LIist

Difficulty : Medium


Example 1:

Input:
N = 4
List = 4 <-> 3 <-> 2 <-> 1

Output: 1 2 3 4

Explanation: After reversing, the list becomes 1 <-> 2 <-> 3 <-> 4.

Example 2:

Input:
N = 8

List = 1 <-> 2 <-> 3 <-> 4 <-> 5 <-> 6 <-> 7 <-> 8

Output: 8 7 6 5 4 3 2 1

Constraints :

1≤N≤10^3
0≤data≤10^3
 
Note:

A doubly linked list is a type of linked list that can be traversed both forward and backward.
Reverse the list in place without using extra memory.

Hint/Approach:

To reverse the doubly linked list, traverse through each node and swap the next and prev pointers. Keep track of the last node visited, which will become the new head of the reversed list. Ensure you update the head pointer at the end!

Link of the problem:

 https://www.naukri.com/code360/problems/reverse-a-doubly-linked-list_1116098?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf