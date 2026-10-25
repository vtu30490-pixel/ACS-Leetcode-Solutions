// Week 3 | Task 27: Validate Stack Sequences
// LeetCode: https://leetcode.com/problems/validate-stack-sequences/

import java.util.*;
class Solution { public boolean validateStackSequences(int[] p,int[] o){Deque<Integer>s=new ArrayDeque<>();int j=0;for(int x:p){s.push(x);while(!s.isEmpty()&&j<o.length&&s.peek()==o[j]){s.pop();j++;}}return j==o.length;} }
