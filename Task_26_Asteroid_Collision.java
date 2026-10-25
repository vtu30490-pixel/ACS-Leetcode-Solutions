// Week 3 | Task 26: Asteroid Collision
// LeetCode: https://leetcode.com/problems/asteroid-collision/

import java.util.*;
class Solution { public int[] asteroidCollision(int[] a){Deque<Integer>s=new ArrayDeque<>();for(int x:a){boolean alive=true;while(alive&&x<0&&!s.isEmpty()&&s.peek()>0){if(s.peek()<-x)s.pop();else if(s.peek()==-x){s.pop();alive=false;}else alive=false;}if(alive)s.push(x);}int[]r=new int[s.size()];for(int i=r.length-1;i>=0;i--)r[i]=s.pop();return r;} }
