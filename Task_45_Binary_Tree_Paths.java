// Week 5 | Task 45: Binary Tree Paths
// LeetCode: https://leetcode.com/problems/binary-tree-paths/

import java.util.*;
class Solution {public List<String> binaryTreePaths(TreeNode r){List<String>a=new ArrayList<>();dfs(r,"",a);return a;}void dfs(TreeNode n,String p,List<String>a){if(n==null)return;p=p.isEmpty()?"":p+"->";p+=n.val;if(n.left==null&&n.right==null)a.add(p);else{dfs(n.left,p,a);dfs(n.right,p,a);}} }
