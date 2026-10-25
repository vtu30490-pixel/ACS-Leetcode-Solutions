// Week 10 | Task 82: Minimum Number of Arrows to Burst Balloons
// LeetCode: https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/

import java.util.*;
class Solution { public int findMinArrowShots(int[][]p){if(p.length==0)return 0;Arrays.sort(p,(a,b)->Integer.compare(a[1],b[1]));int n=1;long pos=p[0][1];for(int i=1;i<p.length;i++)if(p[i][0]>pos){n++;pos=p[i][1];}return n;} }
