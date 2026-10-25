// Week 4 | Task 32: Binary Tree Right Side View
// LeetCode: https://leetcode.com/problems/binary-tree-right-side-view/

import java.util.*;
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>(); if(root==null)return ans;
        Queue<TreeNode> q=new LinkedList<>();q.offer(root);
        while(!q.isEmpty()){int size=q.size();
            for(int i=0;i<size;i++){TreeNode x=q.poll();if(i==size-1)ans.add(x.val);
                if(x.left!=null)q.offer(x.left);if(x.right!=null)q.offer(x.right);}
        } return ans;
    }
}
