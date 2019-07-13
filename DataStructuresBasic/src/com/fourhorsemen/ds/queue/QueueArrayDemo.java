package com.fourhorsemen.ds.queue;

public class QueueArrayDemo {

	public static void main(String[] args) {
		ArrQueue<Integer> q = new ArrQueue<>(5);
		
		q.add(6);
		q.add(2);
		q.add(5);
		q.add(8);
		q.add(1);
		q.add(89);
		System.out.println("Dequeue : " + q.dequeue());
		System.out.println("Dequeue : " + q.dequeue());
		
	}

}
