// Week 7 | Task 54: Find if Path Exists in Graph
// LeetCode: https://leetcode.com/problems/find-if-path-exists-in-graph/

import java.util.*;
class Solution {public boolean validPath(int n,int[][]e,int s,int d){List<List<Integer>>g=new ArrayList<>();for(int i=0;i<n;i++)g.add(new ArrayList<>());for(int[]x:e){g.get(x[0]).add(x[1]);g.get(x[1]).add(x[0]);}boolean[]v=new boolean[n];Queue<Integer>q=new LinkedList<>();q.offer(s);v[s]=true;while(!q.isEmpty()){int u=q.poll();if(u==d)return true;for(int x:g.get(u))if(!v[x]){v[x]=true;q.offer(x);}}return false;} }
