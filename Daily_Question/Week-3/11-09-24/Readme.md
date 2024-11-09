### Array to Linkedlist

Given an array of integers arr, your task is to construct a linked list from the array and return the head of the linked list.

Topic :Linked List

Difficulty :Easy 

Input:

An integer array arr where 1 ≤ arr.size() ≤ 10^6 and 1 ≤ arr[i] ≤ 10^6.
Output:
Return the head of the constructed linked list.

Examples :
1️⃣

 Input: arr = [1, 2, 3, 4, 5]

Output: LinkedList: 1->2->3->4->5

2️⃣ 

Input: arr = [2, 4, 6, 7, 5, 1, 0]

Output: LinkedList: 2->4->6->7->5->1->0

Expected Complexity:

Construct the linked list in 
O(n) time, where n is the length of arr.
O(n) space to store the linked list nodes.


Link of the Problem : 

https://www.geeksforgeeks.org/problems/introduction-to-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=introduction-to-linked-list

💡 Hint:

    Start by creating a node for the first element in 
    arr, then iterate through the rest of the array to 
    create and link each new node.