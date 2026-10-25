// Week 9 | Task 73: Longest Nice Substring
// LeetCode: https://leetcode.com/problems/longest-nice-substring/

class Solution { public String longestNiceSubstring(String s){if(s.length()<2)return "";for(int i=0;i<s.length();i++){char c=s.charAt(i);if(s.indexOf(Character.toLowerCase(c))<0||s.indexOf(Character.toUpperCase(c))<0){String a=longestNiceSubstring(s.substring(0,i)),b=longestNiceSubstring(s.substring(i+1));return a.length()>=b.length()?a:b;}}return s;} }
