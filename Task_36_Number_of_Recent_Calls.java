// Week 4 | Task 36: Number of Recent Calls
// LeetCode: https://leetcode.com/problems/number-of-recent-calls/

import java.util.*;
class RecentCounter {
    Queue<Integer> q=new LinkedList<>();
    public RecentCounter(){}
    public int ping(int t){q.offer(t);while(q.peek()<t-3000)q.poll();return q.size();}
}
