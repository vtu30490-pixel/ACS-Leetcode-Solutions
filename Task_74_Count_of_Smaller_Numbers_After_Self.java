// Week 9 | Task 74: Count of Smaller Numbers After Self
// LeetCode: https://leetcode.com/problems/count-of-smaller-numbers-after-self/

import java.util.*;
class Solution {
 int[]a,idx,tmp,c;
 public List<Integer> countSmaller(int[]nums){a=nums;int n=a.length;idx=new int[n];tmp=new int[n];c=new int[n];for(int i=0;i<n;i++)idx[i]=i;sort(0,n-1);List<Integer>r=new ArrayList<>();for(int x:c)r.add(x);return r;}
 void sort(int l,int r){if(l>=r)return;int m=(l+r)/2;sort(l,m);sort(m+1,r);int i=l,j=m+1,k=l,s=0;while(i<=m&&j<=r){if(a[idx[j]]<a[idx[i]]){tmp[k++]=idx[j++];s++;}else{c[idx[i]]+=s;tmp[k++]=idx[i++];}}while(i<=m){c[idx[i]]+=s;tmp[k++]=idx[i++];}while(j<=r)tmp[k++]=idx[j++];for(int p=l;p<=r;p++)idx[p]=tmp[p];}
}
