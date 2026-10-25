// Week 8 | Task 62: Sort Items by Groups Respecting Dependencies
// LeetCode: https://leetcode.com/problems/sort-items-by-groups-respecting-dependencies/

import java.util.*;
class Solution {
 public int[] sortItems(int n,int m,int[] group,List<List<Integer>> beforeItems){
  for(int i=0;i<n;i++)if(group[i]==-1)group[i]=m++;
  List<List<Integer>> ig=new ArrayList<>(),gg=new ArrayList<>();
  for(int i=0;i<n;i++)ig.add(new ArrayList<>());for(int i=0;i<m;i++)gg.add(new ArrayList<>());
  int[] ii=new int[n],gi=new int[m];
  for(int i=0;i<n;i++)for(int p:beforeItems.get(i)){ig.get(p).add(i);ii[i]++;if(group[p]!=group[i]){gg.get(group[p]).add(group[i]);gi[group[i]]++;}}
  List<Integer> io=topo(ig,ii),go=topo(gg,gi);if(io.size()!=n||go.size()!=m)return new int[0];
  List<List<Integer>> grouped=new ArrayList<>();for(int i=0;i<m;i++)grouped.add(new ArrayList<>());
  for(int x:io)grouped.get(group[x]).add(x);int[] ans=new int[n];int k=0;
  for(int g:go)for(int x:grouped.get(g))ans[k++]=x;return ans;
 }
 private List<Integer> topo(List<List<Integer>> g,int[] in){Queue<Integer>q=new LinkedList<>();List<Integer>o=new ArrayList<>();for(int i=0;i<in.length;i++)if(in[i]==0)q.offer(i);while(!q.isEmpty()){int u=q.poll();o.add(u);for(int v:g.get(u))if(--in[v]==0)q.offer(v);}return o;}
}
