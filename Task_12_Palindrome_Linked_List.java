// Week 2 | Task 12: Palindrome Linked List
// LeetCode: https://leetcode.com/problems/palindrome-linked-list/

import java.util.*;
class Solution { public boolean isPalindrome(ListNode head){List<Integer>a=new ArrayList<>();while(head!=null){a.add(head.val);head=head.next;}int l=0,r=a.size()-1;while(l<r)if(!a.get(l++).equals(a.get(r--)))return false;return true;} }
