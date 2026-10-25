// Week 4 | Task 35: Task Scheduler
// LeetCode: https://leetcode.com/problems/task-scheduler/

import java.util.*;
class Solution {
    public int leastInterval(char[] tasks,int n){
        int[] f=new int[26];for(char c:tasks)f[c-'A']++;Arrays.sort(f);
        int max=f[25],count=0;for(int x:f)if(x==max)count++;
        return Math.max(tasks.length,(max-1)*(n+1)+count);
    }
}
