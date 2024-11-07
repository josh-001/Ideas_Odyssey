 Rotate a Matrix by 90 Degrees 🔄

Problem Statement:

You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees clockwise in-place. This means you need to modify the input 2D matrix directly without using additional storage for another matrix.

Topic : 2D Arrays

Difficulty :  Medium

Input :

An integer n representing the size of the matrix (i.e., n x n).
A 2D matrix matrix of size n x n.

Output :
The modified n x n matrix rotated 90 degrees clockwise.

Link of the Problem. : 
https://leetcode.com/problems/rotate-image/description/

Explanation :

After rotating the matrix 90 degrees clockwise:
Row 1 becomes Column 3.
Row 2 becomes Column 2.
Row 3 becomes Column 1.

Constraints :
1≤n≤1000
All elements in matrix are integers.

Hint :

    Try using a two-step approach:
    1. Transpose the matrix.
    2. Reverse each row.
