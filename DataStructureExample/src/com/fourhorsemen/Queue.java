package com.fourhorsemen;

public class Queue {

	private int[] queue = null;
	private int first = 0;
	private int last = 0;

	public Queue(int n) {
		queue = new int[n];
	}

	public void add(int val) {
		if(this.first==0 && this.last==0) {
			queue[this.first] = val;
			this.last = this.last+1;
		}else {
			if(this.last == this.queue.length) {
				System.out.println("Queue is FULL!!");
			}
			queue[this.last] = val;
			this.last = this.last+1;
		}
	}

	public void show() {
		for(int i = 0; i < this.queue.length; i++)
			System.out.print(this.queue[i] + " ");
	}
	
	public int remove() {
		int removedVal = -9999;
		if(this.first==0 && this.last==0) {
			this.queue[this.first] = 0;
			removedVal = this.queue[this.first];
		}else {
			this.queue[this.first] = 0;
			removedVal = this.queue[this.first];
			this.first = this.first+1;
		}
		return removedVal;
	}
}

