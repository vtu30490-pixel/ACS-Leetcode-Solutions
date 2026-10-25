// Week 8 | Task 63: Shortest Path with Alternating Colors
// LeetCode: https://leetcode.com/problems/shortest-path-with-alternating-colors/

import java.util.*;
class Solution {
 public int[] shortestAlternatingPaths(int n,int[][] redEdges,int[][] blueEdges){
  List<Integer>[][] g=new ArrayList[2][n];for(int c=0;c<2;c++)for(int i=0;i<n;i++)g[c][i]=new ArrayList<>();
  for(int[]e:redEdges)g[0][e[0]].add(e[1]);for(int[]e:blueEdges)g[1][e[0]].add(e[1]);
  int[][]d=new int[n][2];for(int[]r:d)Arrays.fill(r,-1);Queue<int[]>q=new LinkedList<>();q.offer(new int[]{0,0});q.offer(new int[]{0,1});d[0][0]=d[0][1]=0;
  while(!q.isEmpty()){int[]x=q.poll();int u=x[0],c=1-x[1];for(int v:g[c][u])if(d[v][c]==-1){d[v][c]=d[u][x[1]]+1;q.offer(new int[]{v,c});}}
  int[]a=new int[n];for(int i=0;i<n;i++)a[i]=d[i][0]<0?d[i][1]:d[i][1]<0?d[i][0]:Math.min(d[i][0],d[i][1]);return a;
 }
}
