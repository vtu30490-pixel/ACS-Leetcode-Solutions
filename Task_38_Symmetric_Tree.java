// Week 5 | Task 38: Symmetric Tree
// LeetCode: https://leetcode.com/problems/symmetric-tree/

class Solution { public boolean isSymmetric(TreeNode r){return r==null||mirror(r.left,r.right);}boolean mirror(TreeNode a,TreeNode b){if(a==null||b==null)return a==b;return a.val==b.val&&mirror(a.left,b.right)&&mirror(a.right,b.left);} }
