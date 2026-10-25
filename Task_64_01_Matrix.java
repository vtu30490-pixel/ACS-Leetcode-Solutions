// Week 8 | Task 64: 01 Matrix
// LeetCode: https://leetcode.com/problems/01-matrix/

import java.util.*;
class Solution {
 public int[][] updateMatrix(int[][] mat){
  int m=mat.length,n=mat[0].length;Queue<int[]>q=new LinkedList<>();
  for(int r=0;r<m;r++)for(int c=0;c<n;c++)if(mat[r][c]==0)q.offer(new int[]{r,c});else mat[r][c]=Integer.MAX_VALUE;
  int[][]d={{1,0},{-1,0},{0,1},{0,-1}};
  while(!q.isEmpty()){int[]p=q.poll();for(int[]x:d){int r=p[0]+x[0],c=p[1]+x[1];if(r>=0&&r<m&&c>=0&&c<n&&mat[r][c]>mat[p[0]][p[1]]+1){mat[r][c]=mat[p[0]][p[1]]+1;q.offer(new int[]{r,c});}}}return mat;
 }
}
