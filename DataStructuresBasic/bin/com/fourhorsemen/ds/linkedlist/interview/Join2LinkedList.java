package com.fourhorsemen.ds.linkedlist.interview;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Join2LinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();

		LinkedList<Integer> list2 = new LinkedList<>();

		LinkedList<Integer> res = new LinkedList<>();

		//Adding elements in List1
		list1.add(1);
		list1.add(5);
		list1.add(10);
		list1.add(15);
		list1.add(20);

		//Adding elements in List2
		list2.add(5);
		list2.add(11);
		list2.add(12);
		list2.add(13);
		list2.add(14);

		/*Join such that 1st element from List1 then Last element from List2,
		  then 2nd element from List1 then last 2nd element from List2 an so on...	
		 */

		Stack<Integer> linkedListStack = new Stack<>();
		Iterator<Integer> i = list2.iterator();
		while(i.hasNext()) {
			linkedListStack.push(i.next());
		}

		Iterator<Integer> j = list1.iterator();
		while(j.hasNext()) {
			res.add(j.next());
			res.add(linkedListStack.pop());
		}
		
		Iterator<Integer> r = res.iterator();
		while(r.hasNext()) {
			System.out.println(r.next());
		}
		
	}

}
