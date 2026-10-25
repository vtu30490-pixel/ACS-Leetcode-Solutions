// Week 9 | Task 75: K Closest Points to Origin
// LeetCode: https://leetcode.com/problems/k-closest-points-to-origin/

import java.util.*;
class Solution { public int[][] kClosest(int[][]points,int k){PriorityQueue<int[]>q=new PriorityQueue<>((a,b)->Integer.compare(d(b),d(a)));for(int[]p:points){q.offer(p);if(q.size()>k)q.poll();}int[][]r=new int[k][2];for(int i=0;i<k;i++)r[i]=q.poll();return r;}int d(int[]p){return p[0]*p[0]+p[1]*p[1];} }
