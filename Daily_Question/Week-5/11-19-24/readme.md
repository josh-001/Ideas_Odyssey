Detect the Start of a Cycle in a Linked List 🔄 🐾

Problem Statement:
Given the head of a linked list, determine if there is a cycle in the list. If there is a cycle, return the node where the cycle begins. If there is no cycle, return null.

A cycle exists in a linked list if a node can be reached again by continuously following the next pointer.
The position pos indicates the index of the node where the tail connects, but it is not passed as a parameter.

Topic : Linked List
Difficulty : Medium

Note :
Do not modify the linked list.

Examples:
Example 1:
Input: head = [3, 2, 0, -4], pos = 1
Output: tail connects to node index 1
Explanation: The cycle starts at the second node.

Example 2:
Input: head = [1, 2], pos = 0
Output: tail connects to node index 0
Explanation: The cycle starts at the first node.

Example 3:  
Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the list.

Constraints :
The number of nodes in the list is in the range  [0,10^4]
−10^5≤Node.val≤0^5

Follow-Up:
Solve the problem using  O(1) memory.

Hint:
Use Floyd's Cycle Detection Algorithm (two-pointer technique) to detect the cycle efficiently. Once a cycle is detected, find the start of the cycle using a simple pointer traversal.

Link To the problem: https://leetcode.com/problems/linked-list-cycle-ii/description/