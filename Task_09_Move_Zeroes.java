// Week 1 | Task 9: Move Zeroes
// LeetCode: https://leetcode.com/problems/move-zeroes/

class Solution { public void moveZeroes(int[] nums){int j=0;for(int x:nums)if(x!=0)nums[j++]=x;while(j<nums.length)nums[j++]=0;} }
