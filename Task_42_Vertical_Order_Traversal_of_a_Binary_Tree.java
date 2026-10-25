// Week 5 | Task 42: Vertical Order Traversal of a Binary Tree
// LeetCode: https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/

import java.util.*;
class Solution {List<int[]>a=new ArrayList<>();public List<List<Integer>> verticalTraversal(TreeNode r){dfs(r,0,0);a.sort((x,y)->x[0]!=y[0]?Integer.compare(x[0],y[0]):x[1]!=y[1]?Integer.compare(x[1],y[1]):Integer.compare(x[2],y[2]));List<List<Integer>>o=new ArrayList<>();int col=Integer.MIN_VALUE;for(int[]x:a){if(x[0]!=col){o.add(new ArrayList<>());col=x[0];}o.get(o.size()-1).add(x[2]);}return o;}void dfs(TreeNode n,int r,int c){if(n==null)return;a.add(new int[]{c,r,n.val});dfs(n.left,r+1,c-1);dfs(n.right,r+1,c+1);} }
