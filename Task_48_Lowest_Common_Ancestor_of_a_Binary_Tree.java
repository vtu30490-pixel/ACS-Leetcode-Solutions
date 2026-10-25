// Week 6 | Task 48: Lowest Common Ancestor of a Binary Tree
// LeetCode: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

class Solution {public TreeNode lowestCommonAncestor(TreeNode r,TreeNode p,TreeNode q){if(r==null||r==p||r==q)return r;TreeNode l=lowestCommonAncestor(r.left,p,q),x=lowestCommonAncestor(r.right,p,q);if(l!=null&&x!=null)return r;return l!=null?l:x;} }
