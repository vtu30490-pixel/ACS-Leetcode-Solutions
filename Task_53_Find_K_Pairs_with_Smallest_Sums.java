// Week 6 | Task 53: Find K Pairs with Smallest Sums
// LeetCode: https://leetcode.com/problems/find-k-pairs-with-smallest-sums/

import java.util.*;
class Solution {public List<List<Integer>> kSmallestPairs(int[] a,int[] b,int k){List<List<Integer>>r=new ArrayList<>();if(a.length==0||b.length==0||k==0)return r;PriorityQueue<int[]>q=new PriorityQueue<>((x,y)->Integer.compare(a[x[0]]+b[x[1]],a[y[0]]+b[y[1]]));for(int i=0;i<Math.min(a.length,k);i++)q.offer(new int[]{i,0});while(k-->0&&!q.isEmpty()){int[]p=q.poll();r.add(Arrays.asList(a[p[0]],b[p[1]]));if(p[1]+1<b.length)q.offer(new int[]{p[0],p[1]+1});}return r;} }
