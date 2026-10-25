// Week 3 | Task 25: Min Stack
// LeetCode: https://leetcode.com/problems/min-stack/

import java.util.*;
class MinStack { Deque<Integer>v=new ArrayDeque<>(),m=new ArrayDeque<>();public MinStack(){}public void push(int x){v.push(x);if(m.isEmpty()||x<=m.peek())m.push(x);}public void pop(){int x=v.pop();if(x==m.peek())m.pop();}public int top(){return v.peek();}public int getMin(){return m.peek();} }
