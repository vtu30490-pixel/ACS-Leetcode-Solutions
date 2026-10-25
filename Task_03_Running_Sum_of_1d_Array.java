// Week 1 | Task 3: Running Sum of 1d Array
// LeetCode: https://leetcode.com/problems/running-sum-of-1d-array/

class Solution { public int[] runningSum(int[] nums){for(int i=1;i<nums.length;i++)nums[i]+=nums[i-1];return nums;} }
