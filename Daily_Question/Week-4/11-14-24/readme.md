### Delete Node in a Linked List 🗑️

Problem Statement:

Given a node in a singly linked list, delete that node from the list. You are not given access to the head of the list—only the node to be deleted.

TOPIC : Linked List

Difficulty  : Medium

Note :

    By "delete" the node, it means that the value of the node should 
    no longer exist in the list, and the number of nodes in the list
    should decrease by one.
    The order of the remaining nodes must be preserved.
    All node values in the list are unique, and it is guaranteed that 
    the node to delete is not the last node in the list.


Example 1:

Input: head = [4, 5, 1, 9], node = 5

Output: [4, 1, 9]

Explanation: You are given the second node with value 5. After deletion, the linked list becomes [4, 1, 9].

Example 2:

Input: head = [4, 5, 1, 9], node = 1

Output: [4, 5, 9]

Explanation: You are given the third node with value 1. After deletion, the linked list becomes [4, 5, 9].

Constraints :

The number of nodes in the list is in the range [2, 1000].
Each node’s value is unique and ranges between -1000 and 1000.
The node to be deleted is guaranteed to exist in the list and is not the tail node.

Hint : 

    Since you don't have access to the head of the
     list, think about copying the value of the next
      node to the current node and adjusting pointers accordingly.

Link of the Problem : https://leetcode.com/problems/delete-node-in-a-linked-list/description/