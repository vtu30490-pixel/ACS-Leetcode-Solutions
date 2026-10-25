// Week 2 | Task 14: Merge k Sorted Lists
// LeetCode: https://leetcode.com/problems/merge-k-sorted-lists/

import java.util.*;
class Solution { public ListNode mergeKLists(ListNode[] lists){PriorityQueue<ListNode>q=new PriorityQueue<>((a,b)->Integer.compare(a.val,b.val));for(ListNode x:lists)if(x!=null)q.offer(x);ListNode d=new ListNode(0),t=d;while(!q.isEmpty()){ListNode x=q.poll();t.next=x;t=x;if(x.next!=null)q.offer(x.next);}t.next=null;return d.next;} }
