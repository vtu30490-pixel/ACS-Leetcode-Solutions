// Week 10 | Task 81: Coin Change
// LeetCode: https://leetcode.com/problems/coin-change/

import java.util.*;
class Solution { public int coinChange(int[]coins,int amount){int[]d=new int[amount+1];Arrays.fill(d,amount+1);d[0]=0;for(int c:coins)for(int i=c;i<=amount;i++)d[i]=Math.min(d[i],d[i-c]+1);return d[amount]>amount?-1:d[amount];} }
