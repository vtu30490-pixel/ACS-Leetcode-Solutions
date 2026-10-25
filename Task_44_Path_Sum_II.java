// Week 5 | Task 44: Path Sum II
// LeetCode: https://leetcode.com/problems/path-sum-ii/

import java.util.*;
class Solution {public List<List<Integer>> pathSum(TreeNode r,int t){List<List<Integer>>a=new ArrayList<>();dfs(r,t,new ArrayList<>(),a);return a;}void dfs(TreeNode n,int s,List<Integer>p,List<List<Integer>>a){if(n==null)return;p.add(n.val);if(n.left==null&&n.right==null&&s==n.val)a.add(new ArrayList<>(p));else{dfs(n.left,s-n.val,p,a);dfs(n.right,s-n.val,p,a);}p.remove(p.size()-1);} }
