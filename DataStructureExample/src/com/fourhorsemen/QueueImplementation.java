package com.fourhorsemen;

public class QueueImplementation {

	public static void main(String[] args) {
		Queue q = new Queue(10);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.show();
		
		q.remove();
		System.out.println("");
		q.show();
		
		q.remove();
		System.out.println("");
		q.show();
	}
	
}
