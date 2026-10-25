// Week 1 | Task 8: First Unique Character in a String
// LeetCode: https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution { public int firstUniqChar(String s){int[] f=new int[26];for(char c:s.toCharArray())f[c-'a']++;for(int i=0;i<s.length();i++)if(f[s.charAt(i)-'a']==1)return i;return -1;} }
