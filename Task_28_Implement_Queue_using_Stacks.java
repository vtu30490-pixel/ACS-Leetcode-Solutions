// Week 4 | Task 28: Implement Queue using Stacks
// LeetCode: https://leetcode.com/problems/implement-queue-using-stacks/

import java.util.Stack;
class MyQueue {
    Stack<Integer> inStack = new Stack<>(), outStack = new Stack<>();
    public MyQueue() {}
    public void push(int x) { inStack.push(x); }
    public int pop() { peek(); return outStack.pop(); }
    public int peek() {
        if (outStack.isEmpty()) while (!inStack.isEmpty()) outStack.push(inStack.pop());
        return outStack.peek();
    }
    public boolean empty() { return inStack.isEmpty() && outStack.isEmpty(); }
}
