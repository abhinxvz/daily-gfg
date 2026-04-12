/*
Problem: Remove Vowels From String1446
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/remove-vowels-from-string1446/1
*/

// User function Template for Java

class Solution {
    String removeVowels(String s) {
       return s.replaceAll("[aeiouAEIOU]","");
    }
}