package com.fourhorsemen.ds.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirsrSearchGraph {


	int size;
	AdjencyList[] array;
	
	public BreadthFirsrSearchGraph(int size) {
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
	
	public void bfsExplore(int startVertex) {
		Boolean[] visitedArr = new Boolean[size];
		for(int i=0; i<size; i++)
			visitedArr[i] = false;
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(startVertex);
		
		while(!queue.isEmpty()) {
			int n = queue.poll();
			System.out.println("Visited Node : " + n);
			visitedArr[n] = true;
			Node head = array[n].head;
			while(head!=null) {
				if(visitedArr[head.value]==false) {
					queue.add(head.value);
					visitedArr[head.value]=true;

				}else {
					head=head.next;
				}
			}
			
		}
	}


}
