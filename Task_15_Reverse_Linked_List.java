// Week 2 | Task 15: Reverse Linked List
// LeetCode: https://leetcode.com/problems/reverse-linked-list/

class Solution { public ListNode reverseList(ListNode head){ListNode p=null,c=head;while(c!=null){ListNode n=c.next;c.next=p;p=c;c=n;}return p;} }
