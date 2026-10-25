// Week 6 | Task 46: Diameter of Binary Tree
// LeetCode: https://leetcode.com/problems/diameter-of-binary-tree/

class Solution {int d=0;public int diameterOfBinaryTree(TreeNode r){depth(r);return d;}int depth(TreeNode n){if(n==null)return 0;int l=depth(n.left),rr=depth(n.right);d=Math.max(d,l+rr);return 1+Math.max(l,rr);} }
