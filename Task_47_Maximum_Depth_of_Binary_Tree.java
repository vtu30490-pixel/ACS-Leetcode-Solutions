// Week 6 | Task 47: Maximum Depth of Binary Tree
// LeetCode: https://leetcode.com/problems/maximum-depth-of-binary-tree/

class Solution {public int maxDepth(TreeNode r){return r==null?0:1+Math.max(maxDepth(r.left),maxDepth(r.right));} }
