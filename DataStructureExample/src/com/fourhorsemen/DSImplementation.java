package com.fourhorsemen;

public class DSImplementation {

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
		
		Stack s = new Stack(10);
		s.push(1);
		s.push(2);
		s.push(3);
		
		s.show();
		
		s.pop();
		System.out.println("");
		s.show();
		
		s.push(3);
		System.out.println("");
		s.show();
		
	}
	
}
