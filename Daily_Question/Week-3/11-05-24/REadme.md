Search a 2D Matrix 🔍

Problem Statement:

You are given an m x n integer matrix matrix with the following

properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.

Given an integer target, write a program to return true if target exists in the matrix, or false otherwise.

Topic : 2D Arrays, Search

Difficulty :  Medium

Requirements :

You must implement the solution with a time complexity of O(log(m * n)).

Link of the Problem. :
 https://leetcode.com/problems/search-a-2d-matrix/description/

Approach :

    Since the matrix is sorted as 
    described, you can visualize it as a flattened sorted list. 
    This allows us to apply binary 
    search by calculating row and column indices on the fly, 
    ensuring an O(log(m * n)) time complexity.