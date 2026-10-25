// Week 4 | Task 30: Longest Continuous Subarray
// LeetCode: https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/

import java.util.*;
class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> max=new ArrayDeque<>(), min=new ArrayDeque<>();
        int left=0, ans=0;
        for(int r=0;r<nums.length;r++){
            while(!max.isEmpty()&&nums[max.peekLast()]<nums[r])max.pollLast(); max.offerLast(r);
            while(!min.isEmpty()&&nums[min.peekLast()]>nums[r])min.pollLast(); min.offerLast(r);
            while((long)nums[max.peekFirst()]-nums[min.peekFirst()]>limit){
                left++;
                if(max.peekFirst()<left)max.pollFirst();
                if(min.peekFirst()<left)min.pollFirst();
            }
            ans=Math.max(ans,r-left+1);
        }
        return ans;
    }
}
