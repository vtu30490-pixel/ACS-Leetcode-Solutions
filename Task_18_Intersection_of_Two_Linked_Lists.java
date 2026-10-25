// Week 2 | Task 18: Intersection of Two Linked Lists
// LeetCode: https://leetcode.com/problems/intersection-of-two-linked-lists/

public class Solution { public ListNode getIntersectionNode(ListNode a,ListNode b){ListNode x=a,y=b;while(x!=y){x=x==null?b:x.next;y=y==null?a:y.next;}return x;} }
