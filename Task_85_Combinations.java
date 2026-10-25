// Week 10 | Task 85: Combinations
// LeetCode: https://leetcode.com/problems/combinations/

import java.util.*;
class Solution { public List<List<Integer>> combine(int n,int k){List<List<Integer>>r=new ArrayList<>();go(1,n,k,new ArrayList<>(),r);return r;}void go(int s,int n,int k,List<Integer>c,List<List<Integer>>r){if(c.size()==k){r.add(new ArrayList<>(c));return;}for(int i=s;i<=n-(k-c.size())+1;i++){c.add(i);go(i+1,n,k,c,r);c.remove(c.size()-1);}} }
