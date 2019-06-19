package com.fourhorsemen.ds.biDLL;

public class LinkedList<T> {

	Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public void add(Object value) {
		Node newNode = new Node(value, null, null);
		if(head==null) {
			head=newNode;
		}
		else {
			newNode.next=head;
			head.previous=newNode;
			head=newNode;
		}
	}
	
	public void delete() {
		head=head.next;
		head.previous=null;
	}
	
	public void display() {
		Node n = head;
		while(n!=null) {
			System.out.println((T)n.value);
			n=n.next;
		}
	}
}
