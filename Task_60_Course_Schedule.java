// Week 7 | Task 60: Course Schedule
// LeetCode: https://leetcode.com/problems/course-schedule/

import java.util.*;
class Solution {public boolean canFinish(int n,int[][]p){List<List<Integer>>g=new ArrayList<>();int[]in=new int[n];for(int i=0;i<n;i++)g.add(new ArrayList<>());for(int[]x:p){g.get(x[1]).add(x[0]);in[x[0]]++;}Queue<Integer>q=new LinkedList<>();for(int i=0;i<n;i++)if(in[i]==0)q.offer(i);int c=0;while(!q.isEmpty()){int u=q.poll();c++;for(int v:g.get(u))if(--in[v]==0)q.offer(v);}return c==n;} }
