// Week 7 | Task 58: Max Area of Island
// LeetCode: https://leetcode.com/problems/max-area-of-island/

class Solution {public int maxAreaOfIsland(int[][]g){int m=0;for(int i=0;i<g.length;i++)for(int j=0;j<g[0].length;j++)if(g[i][j]==1)m=Math.max(m,dfs(g,i,j));return m;}int dfs(int[][]g,int r,int c){if(r<0||r>=g.length||c<0||c>=g[0].length||g[r][c]==0)return 0;g[r][c]=0;return 1+dfs(g,r+1,c)+dfs(g,r-1,c)+dfs(g,r,c+1)+dfs(g,r,c-1);} }
