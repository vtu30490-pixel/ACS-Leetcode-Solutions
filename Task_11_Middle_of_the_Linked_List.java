// Week 2 | Task 11: Middle of the Linked List
// LeetCode: https://leetcode.com/problems/middle-of-the-linked-list/

class Solution { public ListNode middleNode(ListNode head){ListNode s=head,f=head;while(f!=null&&f.next!=null){s=s.next;f=f.next.next;}return s;} }
