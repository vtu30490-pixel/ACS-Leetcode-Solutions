// Week 3 | Task 20: Daily Temperatures
// LeetCode: https://leetcode.com/problems/daily-temperatures/

import java.util.*;
class Solution { public int[] dailyTemperatures(int[] t){int[]r=new int[t.length];Deque<Integer>s=new ArrayDeque<>();for(int i=0;i<t.length;i++){while(!s.isEmpty()&&t[i]>t[s.peek()]){int j=s.pop();r[j]=i-j;}s.push(i);}return r;} }
