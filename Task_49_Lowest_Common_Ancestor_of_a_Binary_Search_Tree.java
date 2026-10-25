// Week 6 | Task 49: Lowest Common Ancestor of a Binary Search Tree
// LeetCode: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

class Solution {public TreeNode lowestCommonAncestor(TreeNode r,TreeNode p,TreeNode q){while(r!=null){if(p.val<r.val&&q.val<r.val)r=r.left;else if(p.val>r.val&&q.val>r.val)r=r.right;else return r;}return null;} }
