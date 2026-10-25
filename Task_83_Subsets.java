// Week 10 | Task 83: Subsets
// LeetCode: https://leetcode.com/problems/subsets/

import java.util.*;
class Solution { public List<List<Integer>> subsets(int[]nums){List<List<Integer>>r=new ArrayList<>();go(nums,0,new ArrayList<>(),r);return r;}void go(int[]a,int s,List<Integer>c,List<List<Integer>>r){r.add(new ArrayList<>(c));for(int i=s;i<a.length;i++){c.add(a[i]);go(a,i+1,c,r);c.remove(c.size()-1);}} }
