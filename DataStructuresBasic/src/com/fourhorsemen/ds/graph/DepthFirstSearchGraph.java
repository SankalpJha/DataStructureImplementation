package com.fourhorsemen.ds.graph;

import java.util.Stack;

public class DepthFirstSearchGraph {

	int size;
	AdjencyList[] array;
	
	public DepthFirstSearchGraph(int size) {
		this.size=size;
		array=new AdjencyList[this.size];
		for(int i=0; i<size; i++) {
			array[i] = new AdjencyList();
			array[i].head=null;
		}
	}
	
	public void add(int source, int destination) {
		Node newNode = new Node(destination, null);
		newNode.next=array[source].head;
		array[source].head=newNode;
	}
	
	public void dfsExplore(int startVertex) {
		Boolean[] visitedArr = new Boolean[size];
		for(int i=0; i<size; i++)
			visitedArr[i] = false;
		
		Stack<Integer> stack = new Stack<>();
		stack.push(startVertex);
		
		while(!stack.isEmpty()) {
			int n = stack.pop();
			stack.push(n);
			visitedArr[n] = true;
			Node head = array[n].head;
			Boolean isDone = true;
			while(head!=null) {
				if(visitedArr[head.value]==false) {
					stack.push(head.value);
					visitedArr[head.value]=true;
					isDone=false;
					break;
				}else {
					head=head.next;
				}
			}
			if(isDone==true) {
				int out = stack.pop();
				System.out.println("Visited Node : " + out);
			}
		}
	}
}
