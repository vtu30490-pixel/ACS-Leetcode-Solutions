// Week 3 | Task 24: Minimum Remove to Make Valid Parentheses
// LeetCode: https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/

class Solution { public String minRemoveToMakeValid(String s){StringBuilder b=new StringBuilder();int open=0;for(char c:s.toCharArray()){if(c=='('){open++;b.append(c);}else if(c==')'){if(open>0){open--;b.append(c);}}else b.append(c);}StringBuilder a=new StringBuilder();for(int i=b.length()-1;i>=0;i--){char c=b.charAt(i);if(c=='('&&open>0)open--;else a.append(c);}return a.reverse().toString();} }
