### Valid Palindrome II 🔍

 Problem Statement :

Given a string s, return true if it can be a palindrome after deleting at most one character from it.


A palindrome is a string that reads the same forward and backward.


 Topic : String Manipulation, Two pointer method

 Difficulty : Medium


 Example 1: 

Input: s = "abca"

Output: true

Explanation: 

You can delete the character 'c' to get "aba", which is a palindrome.

 Example 2: 

Input: s = "hello"

Output: false


Explanation:
 Deleting one character cannot make the string a palindrome.


 Hint :
 
     Use a two-pointer approach to compare characters from both ends
     If characters don’t match, try removing one character and check
      if it forms a palindrome.