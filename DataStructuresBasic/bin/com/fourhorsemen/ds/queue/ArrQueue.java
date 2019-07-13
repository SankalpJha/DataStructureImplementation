package com.fourhorsemen.ds.queue;

public class ArrQueue<T> {

	Object[] queue;
	int rear;
	int front;
	int size;
	
	public ArrQueue(int size) {
		this.size = size;
		queue = new Object[this.size];
		front = -1;
		rear = -1;
	}
	
	public boolean isFull() {
		return (rear == size-1);
	}
	
	public boolean isEmpty() {
		return (front == -1 || front > rear);
	}
	
	public void add(Object newItem) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		rear = rear + 1;
		queue[rear] = newItem;
		if(front==-1)
			front=0;
	}
	
	public T dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		}
		T obj = (T) queue[front];
		front = front + 1;
		return obj;
	}
}
