Allocate Minimum Pages 📚

Problem Statement:
You are given an array arr of integers where arr[i] represents the number of pages in the i-th book. There are m students, and the task is to allocate all the books to the students while meeting the following conditions:

Each student gets at least one book.
Each book can be allocated to only one student.
Book allocation must be done in a contiguous manner.
Allocate the books in such a way that the maximum number of pages assigned to a student is minimized. If it’s not possible to allocate books to all students, return -1.

Topic : Binary  Search
Difficulty :  Hard

Link of the Problem. : https://www.naukri.com/code360/problems/allocate-books_1090540?utm_source=youtube&utm_medium=affiliate&utm_campaign=codestudio_Striver_BinarySeries

Approach :
This problem can be efficiently solved using binary search with partitioning logic. The expected time complexity is O(n×log(s)), where n is the number of books and s is the sum of all pages in arr.

Hint : Use binary search on the possible maximum pages a student can get. For each mid-point in this range, check if it’s feasible to allocate books so that no student has more than mid pages. Adjust the range based on feasibility to find the smallest possible maximum pages allocation.