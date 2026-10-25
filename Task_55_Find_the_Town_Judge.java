// Week 7 | Task 55: Find the Town Judge
// LeetCode: https://leetcode.com/problems/find-the-town-judge/

class Solution {public int findJudge(int n,int[][]t){int[]s=new int[n+1];for(int[]x:t){s[x[0]]--;s[x[1]]++;}for(int i=1;i<=n;i++)if(s[i]==n-1)return i;return -1;} }
