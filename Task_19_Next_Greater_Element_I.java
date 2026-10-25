// Week 3 | Task 19: Next Greater Element I
// LeetCode: https://leetcode.com/problems/next-greater-element-i/

import java.util.*;
class Solution { public int[] nextGreaterElement(int[] a,int[] b){Map<Integer,Integer>m=new HashMap<>();Deque<Integer>s=new ArrayDeque<>();for(int x:b){while(!s.isEmpty()&&s.peek()<x)m.put(s.pop(),x);s.push(x);}int[]r=new int[a.length];for(int i=0;i<a.length;i++)r[i]=m.getOrDefault(a[i],-1);return r;} }
