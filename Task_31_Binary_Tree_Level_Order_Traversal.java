// Week 4 | Task 31: Binary Tree Level Order Traversal
// LeetCode: https://leetcode.com/problems/binary-tree-level-order-traversal/

import java.util.*;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>(); if(root==null)return ans;
        Queue<TreeNode> q=new LinkedList<>(); q.offer(root);
        while(!q.isEmpty()){
            int size=q.size(); List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++){TreeNode x=q.poll();level.add(x.val);
                if(x.left!=null)q.offer(x.left);if(x.right!=null)q.offer(x.right);}
            ans.add(level);
        }
        return ans;
    }
}
