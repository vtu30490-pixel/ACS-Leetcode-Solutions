// Week 1 | Task 2: Contains Duplicate II
// LeetCode: https://leetcode.com/problems/contains-duplicate-ii/

import java.util.*;
class Solution {
 public boolean containsNearbyDuplicate(int[] nums,int k) {
  Map<Integer,Integer> last=new HashMap<>();
  for(int i=0;i<nums.length;i++){if(last.containsKey(nums[i])&&i-last.get(nums[i])<=k)return true;last.put(nums[i],i);}
  return false;
 }
}
