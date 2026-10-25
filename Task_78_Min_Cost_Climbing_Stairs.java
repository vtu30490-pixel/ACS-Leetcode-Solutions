// Week 9 | Task 78: Min Cost Climbing Stairs
// LeetCode: https://leetcode.com/problems/min-cost-climbing-stairs/

class Solution { public int minCostClimbingStairs(int[]cost){int a=0,b=0;for(int i=2;i<=cost.length;i++){int c=Math.min(b+cost[i-1],a+cost[i-2]);a=b;b=c;}return b;} }
