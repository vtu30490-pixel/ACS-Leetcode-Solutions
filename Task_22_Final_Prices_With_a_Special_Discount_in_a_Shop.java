// Week 3 | Task 22: Final Prices With a Special Discount in a Shop
// LeetCode: https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/

import java.util.*;
class Solution { public int[] finalPrices(int[] p){int[]a=p.clone();Deque<Integer>s=new ArrayDeque<>();for(int i=0;i<p.length;i++){while(!s.isEmpty()&&p[s.peek()]>=p[i])a[s.pop()]-=p[i];s.push(i);}return a;} }
