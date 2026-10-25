// Week 7 | Task 57: Number of Provinces
// LeetCode: https://leetcode.com/problems/number-of-provinces/

class Solution {public int findCircleNum(int[][]g){int n=g.length,c=0;boolean[]v=new boolean[n];for(int i=0;i<n;i++)if(!v[i]){c++;dfs(g,i,v);}return c;}void dfs(int[][]g,int u,boolean[]v){v[u]=true;for(int i=0;i<g.length;i++)if(g[u][i]==1&&!v[i])dfs(g,i,v);} }
