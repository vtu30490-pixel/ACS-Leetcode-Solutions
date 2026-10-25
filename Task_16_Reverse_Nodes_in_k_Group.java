// Week 2 | Task 16: Reverse Nodes in k-Group
// LeetCode: https://leetcode.com/problems/reverse-nodes-in-k-group/

class Solution { public ListNode reverseKGroup(ListNode head,int k){ListNode x=head;for(int i=0;i<k;i++){if(x==null)return head;x=x.next;}ListNode p=null,c=head;for(int i=0;i<k;i++){ListNode n=c.next;c.next=p;p=c;c=n;}head.next=reverseKGroup(c,k);return p;} }
