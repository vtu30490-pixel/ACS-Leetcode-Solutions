// Week 1 | Task 4: Sum of Absolute Differences in a Sorted Array
// LeetCode: https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/

class Solution {
 public int[] getSumAbsoluteDifferences(int[] nums) {
  int n=nums.length,total=0; for(int x:nums)total+=x;
  int[] ans=new int[n]; int left=0;
  for(int i=0;i<n;i++){ans[i]=nums[i]*i-left+total-left-nums[i]*(n-i);left+=nums[i];total-=nums[i];}
  return ans;
 }
}
