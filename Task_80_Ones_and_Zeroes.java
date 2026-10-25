// Week 10 | Task 80: Ones and Zeroes
// LeetCode: https://leetcode.com/problems/ones-and-zeroes/

class Solution { public int findMaxForm(String[]strs,int m,int n){int[][]d=new int[m+1][n+1];for(String s:strs){int z=0,o=0;for(char c:s.toCharArray())if(c=='0')z++;else o++;for(int i=m;i>=z;i--)for(int j=n;j>=o;j--)d[i][j]=Math.max(d[i][j],d[i-z][j-o]+1);}return d[m][n];} }
