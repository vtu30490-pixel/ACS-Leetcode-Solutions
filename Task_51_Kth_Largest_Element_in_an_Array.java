// Week 6 | Task 51: Kth Largest Element in an Array
// LeetCode: https://leetcode.com/problems/kth-largest-element-in-an-array/

import java.util.*;
class Solution {public int findKthLargest(int[] a,int k){PriorityQueue<Integer>q=new PriorityQueue<>();for(int x:a){q.offer(x);if(q.size()>k)q.poll();}return q.peek();} }
