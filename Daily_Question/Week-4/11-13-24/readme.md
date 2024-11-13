### Reverse Nodes in k-Group 🔄

 Problem Statement: 

Given a linked list, reverse the nodes of the list k at a time and return its modified list. k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k, leave the remaining nodes as they are.


 Topic : Linked List

 Difficulty : Medium


Example 1:

Input: head = [1, 2, 3, 4, 5], k = 2

Output: [2, 1, 4, 3, 5]

Example 2:

Input: head = [1, 2, 3, 4, 5], k = 3

Output: [3, 2, 1, 4, 5]

Constraints :

The number of nodes in the list is in the range [1, 5000].

 Approach :

    1. Count Nodes: Traverse the list to determine the total length.

    2. Reverse in Groups: Reverse every group of k nodes until there 
       are fewer than k nodes left.

    3. Reconnect Groups: Maintain pointers to connect each 
       reversed segment with the previous and next segments.