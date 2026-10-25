// Week 1 | Task 10: Reverse String
// LeetCode: https://leetcode.com/problems/reverse-string/

class Solution { public void reverseString(char[] s){int l=0,r=s.length-1;while(l<r){char t=s[l];s[l++]=s[r];s[r--]=t;}} }
