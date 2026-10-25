// Week 8 | Task 67: Accounts Merge
// LeetCode: https://leetcode.com/problems/accounts-merge/

import java.util.*;
class Solution {
 public List<List<String>> accountsMerge(List<List<String>> accounts){
  Map<String,String>p=new HashMap<>(),name=new HashMap<>();
  for(List<String>a:accounts){String first=a.get(1);for(int i=1;i<a.size();i++){String e=a.get(i);p.putIfAbsent(e,e);name.put(e,a.get(0));union(p,first,e);}}
  Map<String,TreeSet<String>>g=new HashMap<>();for(String e:p.keySet())g.computeIfAbsent(find(p,e),k->new TreeSet<>()).add(e);
  List<List<String>>ans=new ArrayList<>();for(TreeSet<String>s:g.values()){List<String>row=new ArrayList<>();row.add(name.get(s.first()));row.addAll(s);ans.add(row);}return ans;
 }
 private String find(Map<String,String>p,String x){if(!p.get(x).equals(x))p.put(x,find(p,p.get(x)));return p.get(x);}
 private void union(Map<String,String>p,String a,String b){String x=find(p,a),y=find(p,b);if(!x.equals(y))p.put(x,y);}
}
