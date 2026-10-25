// Week 2 | Task 13: Merge Two Sorted Lists
// LeetCode: https://leetcode.com/problems/merge-two-sorted-lists/

class Solution { public ListNode mergeTwoLists(ListNode a,ListNode b){ListNode d=new ListNode(0),t=d;while(a!=null&&b!=null){if(a.val<=b.val){t.next=a;a=a.next;}else{t.next=b;b=b.next;}t=t.next;}t.next=a!=null?a:b;return d.next;} }
