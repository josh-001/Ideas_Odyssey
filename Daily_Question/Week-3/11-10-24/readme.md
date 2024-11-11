### Odd Even Linked List 🔀

Problem Statement:

Given the head of a singly linked list, reorder the list to group all nodes with odd indices together followed by nodes with even indices. Return the reordered list.


The first node is considered odd, the second node even, and so on.

Note :

 Maintain the relative order inside both the odd and even groups as in the input.

Goal :

 Solve in  O(1) extra space and  O(n) time complexity.

Topic : Linked List

Difficult : Medium

Explanation :

Two-Pointer Approach: Use two pointers, odd and even, to separate nodes into odd and even lists while traversing.
Linking Odd and Even Groups: Once separated, link the last node in the odd list to the head of the even list.

Example :

Input: head = [1, 2, 3, 4, 5]

Output: [1, 3, 5, 2, 4]

Explanation : 

Nodes at odd positions are [1, 3, 5] and even positions [2, 4]. Linking these in sequence gives [1, 3, 5, 2, 4].

Constraints :

Number of nodes is in the range [0, 10^4]:
−10^6≤Node.val≤10^6

Link to the Problem: 

https://leetcode.com/problems/odd-even-linked-list/description/?envType=problem-list-v2&envId=linked-list