// Week 6 | Task 50: Kth Smallest Element in a BST
// LeetCode: https://leetcode.com/problems/kth-smallest-element-in-a-bst/

class Solution {int count=0,ans;public int kthSmallest(TreeNode r,int k){in(r,k);return ans;}void in(TreeNode n,int k){if(n==null)return;in(n.left,k);if(++count==k){ans=n.val;return;}if(count<k)in(n.right,k);} }
