// Week 5 | Task 40: Binary Tree Preorder Traversal
// LeetCode: https://leetcode.com/problems/binary-tree-preorder-traversal/

import java.util.*;
class Solution { public List<Integer> preorderTraversal(TreeNode r){List<Integer>a=new ArrayList<>();go(r,a);return a;}void go(TreeNode n,List<Integer>a){if(n==null)return;a.add(n.val);go(n.left,a);go(n.right,a);} }
