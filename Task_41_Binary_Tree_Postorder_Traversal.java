// Week 5 | Task 41: Binary Tree Postorder Traversal
// LeetCode: https://leetcode.com/problems/binary-tree-postorder-traversal/

import java.util.*;
class Solution { public List<Integer> postorderTraversal(TreeNode r){List<Integer>a=new ArrayList<>();go(r,a);return a;}void go(TreeNode n,List<Integer>a){if(n==null)return;go(n.left,a);go(n.right,a);a.add(n.val);} }
