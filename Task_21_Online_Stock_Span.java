// Week 3 | Task 21: Online Stock Span
// LeetCode: https://leetcode.com/problems/online-stock-span/

import java.util.*;
class StockSpanner { Deque<int[]>s=new ArrayDeque<>();public StockSpanner(){} public int next(int price){int span=1;while(!s.isEmpty()&&s.peek()[0]<=price)span+=s.pop()[1];s.push(new int[]{price,span});return span;} }
