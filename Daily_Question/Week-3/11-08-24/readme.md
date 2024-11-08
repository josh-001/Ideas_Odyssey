### Longest Substring Without Repeating Characters 🌐

Problem Statement:

Given a string s, find the length of the longest substring without repeating characters.


Example 1:

Input: s = "abcabcbb"

Output: 3

Explanation: The answer is "abc", with a length of 3.

Example 2:

Input: s = "bbbbb"

Output: 1

Explanation: The answer is "b", with a length of 1.

Example 3:

Input: s = "pwwkew"

Output: 3

Explanation: The answer is "wke", with a length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

Constraints:

0≤len(s)≤5×10 
 
Hint:

    Try using a sliding window approach with two 
    pointers to track the current substring without 
    repeating characters.