// Week 9 | Task 71: Majority Element
// LeetCode: https://leetcode.com/problems/majority-element/

class Solution { public int majorityElement(int[] nums){int c=nums[0],n=0;for(int x:nums){if(n==0)c=x;n+=x==c?1:-1;}return c;} }
