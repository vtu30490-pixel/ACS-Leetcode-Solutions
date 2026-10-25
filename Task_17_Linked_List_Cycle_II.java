// Week 2 | Task 17: Linked List Cycle II
// LeetCode: https://leetcode.com/problems/linked-list-cycle-ii/

public class Solution { public ListNode detectCycle(ListNode head){ListNode s=head,f=head;while(f!=null&&f.next!=null){s=s.next;f=f.next.next;if(s==f){ListNode x=head;while(x!=s){x=x.next;s=s.next;}return x;}}return null;} }
