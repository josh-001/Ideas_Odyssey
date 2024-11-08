 ### Frequency Sort a String 🔠

Problem Statement:

Given a string s, sort it in decreasing order based on the frequency of its characters. The frequency of a character is the number of times it appears in the string.


Return the sorted string. If there are multiple valid answers, return any one of them.

Topic : Strings

Diffiulty : Medium


Example 1:

Input: s = "tree"

Output: "eert"

Explanation: 

'e' appears twice, while 'r' and 't' appear once each. So "eert" or "eetr" are valid answers.

Example 2:

Input: s = "cccaaa"

Output: "aaaccc"

Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers. However, "cacaca" is incorrect because the same characters must appear together.

Example 3:

Input : s = "Aabb"

Output : "bbAa"

Explanation :

 "bbAa" or "bbaA" are valid answers, but "Aabb" is not, as uppercase and lowercase characters are treated as distinct.

Constraints : 

1≤s.length≤5×10^5
 s consists of uppercase and lowercase English letters and digits.

Hint :

    Try using a frequency map to count character 
    occurrences, then sort based on frequency.


Link of the Problem :

https://leetcode.com/problems/sort-characters-by-frequency/description/