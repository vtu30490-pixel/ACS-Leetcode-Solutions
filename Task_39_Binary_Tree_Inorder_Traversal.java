// Week 5 | Task 39: Binary Tree Inorder Traversal
// LeetCode: https://leetcode.com/problems/binary-tree-inorder-traversal/

import java.util.*;
class Solution { public List<Integer> inorderTraversal(TreeNode r){List<Integer>a=new ArrayList<>();go(r,a);return a;}void go(TreeNode n,List<Integer>a){if(n==null)return;go(n.left,a);a.add(n.val);go(n.right,a);} }
