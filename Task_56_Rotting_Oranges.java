// Week 7 | Task 56: Rotting Oranges
// LeetCode: https://leetcode.com/problems/rotting-oranges/

import java.util.*;
class Solution {public int orangesRotting(int[][]g){int m=g.length,n=g[0].length,f=0,t=0;Queue<int[]>q=new LinkedList<>();for(int i=0;i<m;i++)for(int j=0;j<n;j++)if(g[i][j]==2)q.offer(new int[]{i,j});else if(g[i][j]==1)f++;int[][]d={{1,0},{-1,0},{0,1},{0,-1}};while(!q.isEmpty()&&f>0){int z=q.size();t++;for(int i=0;i<z;i++){int[]p=q.poll();for(int[]x:d){int r=p[0]+x[0],c=p[1]+x[1];if(r>=0&&r<m&&c>=0&&c<n&&g[r][c]==1){g[r][c]=2;f--;q.offer(new int[]{r,c});}}}}return f==0?t:-1;} }
