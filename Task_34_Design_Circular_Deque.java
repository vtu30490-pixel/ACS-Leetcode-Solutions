// Week 4 | Task 34: Design Circular Deque
// LeetCode: https://leetcode.com/problems/design-circular-deque/

class MyCircularDeque {
    int[] q; int front=0,rear=-1,size=0,capacity;
    public MyCircularDeque(int k){q=new int[k];capacity=k;}
    public boolean insertFront(int value){if(isFull())return false;front=(front-1+capacity)%capacity;q[front]=value;if(size==0)rear=front;size++;return true;}
    public boolean insertLast(int value){if(isFull())return false;rear=(rear+1)%capacity;q[rear]=value;if(size==0)front=rear;size++;return true;}
    public boolean deleteFront(){if(isEmpty())return false;front=(front+1)%capacity;size--;return true;}
    public boolean deleteLast(){if(isEmpty())return false;rear=(rear-1+capacity)%capacity;size--;return true;}
    public int getFront(){return isEmpty()?-1:q[front];}
    public int getRear(){return isEmpty()?-1:q[rear];}
    public boolean isEmpty(){return size==0;}
    public boolean isFull(){return size==capacity;}
}
