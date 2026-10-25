// Week 5 | Task 43: Path Sum
// LeetCode: https://leetcode.com/problems/path-sum/

class Solution { public boolean hasPathSum(TreeNode r,int t){if(r==null)return false;if(r.left==null&&r.right==null)return t==r.val;return hasPathSum(r.left,t-r.val)||hasPathSum(r.right,t-r.val);} }
