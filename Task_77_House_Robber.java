// Week 9 | Task 77: House Robber
// LeetCode: https://leetcode.com/problems/house-robber/

class Solution { public int rob(int[]nums){int a=0,b=0;for(int x:nums){int c=Math.max(b,a+x);a=b;b=c;}return b;} }
