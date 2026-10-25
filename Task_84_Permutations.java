// Week 10 | Task 84: Permutations
// LeetCode: https://leetcode.com/problems/permutations/

import java.util.*;
class Solution { public List<List<Integer>> permute(int[]nums){List<List<Integer>>r=new ArrayList<>();go(nums,new boolean[nums.length],new ArrayList<>(),r);return r;}void go(int[]a,boolean[]u,List<Integer>c,List<List<Integer>>r){if(c.size()==a.length){r.add(new ArrayList<>(c));return;}for(int i=0;i<a.length;i++)if(!u[i]){u[i]=true;c.add(a[i]);go(a,u,c,r);c.remove(c.size()-1);u[i]=false;}} }
