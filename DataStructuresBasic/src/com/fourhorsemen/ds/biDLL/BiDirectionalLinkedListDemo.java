package com.fourhorsemen.ds.biDLL;

public class BiDirectionalLinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("Sankalp");
		list.add("Anand");
		list.add("Anurag");
		list.add("Avnish");
		System.out.println("Before Delete...");
		list.display();
		list.delete();
		System.out.println("After Delete...");
		list.display();
	}

}
