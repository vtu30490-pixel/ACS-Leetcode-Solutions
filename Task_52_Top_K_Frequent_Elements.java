// Week 6 | Task 52: Top K Frequent Elements
// LeetCode: https://leetcode.com/problems/top-k-frequent-elements/

import java.util.*;
class Solution {public int[] topKFrequent(int[] a,int k){Map<Integer,Integer>f=new HashMap<>();for(int x:a)f.put(x,f.getOrDefault(x,0)+1);PriorityQueue<Integer>q=new PriorityQueue<>((x,y)->f.get(x)-f.get(y));for(int x:f.keySet()){q.offer(x);if(q.size()>k)q.poll();}int[]r=new int[k];for(int i=0;i<k;i++)r[i]=q.poll();return r;} }
