// Week 7 | Task 59: Keys and Rooms
// LeetCode: https://leetcode.com/problems/keys-and-rooms/

import java.util.*;
class Solution {public boolean canVisitAllRooms(List<List<Integer>>r){boolean[]v=new boolean[r.size()];Queue<Integer>q=new LinkedList<>();q.offer(0);v[0]=true;int n=0;while(!q.isEmpty()){int x=q.poll();n++;for(int k:r.get(x))if(!v[k]){v[k]=true;q.offer(k);}}return n==r.size();} }
