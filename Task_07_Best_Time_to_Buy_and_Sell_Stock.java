// Week 1 | Task 7: Best Time to Buy and Sell Stock
// LeetCode: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution { public int maxProfit(int[] prices){int min=Integer.MAX_VALUE,profit=0;for(int p:prices){min=Math.min(min,p);profit=Math.max(profit,p-min);}return profit;} }
