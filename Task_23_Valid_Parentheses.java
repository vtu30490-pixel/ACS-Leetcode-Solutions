// Week 3 | Task 23: Valid Parentheses
// LeetCode: https://leetcode.com/problems/valid-parentheses/

import java.util.*;
class Solution { public boolean isValid(String s){Deque<Character>q=new ArrayDeque<>();for(char c:s.toCharArray()){if(c=='('||c=='['||c=='{')q.push(c);else{if(q.isEmpty())return false;char x=q.pop();if((c==')'&&x!='(')||(c==']'&&x!='[')||(c=='}'&&x!='{'))return false;}}return q.isEmpty();} }
