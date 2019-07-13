package com.fourhoursemen.serach;

public class HeapSortImplementation {

	static int total;

	static void swap(Comparable[] arr, int a, int b) {
		Comparable temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	static void heapify(Comparable[] arr, int i) {

		int left=i*2;
		int right=i*2+1;
		int parent=i;

		if(left<=total && arr[left].compareTo(arr[parent])>=0)
			parent=left;
		if(right<=total && arr[right].compareTo(arr[parent])==-1)
			parent=right;

		if(parent!=i) {
			swap(arr, i, parent);
			heapify(arr, parent);
		}

	}

	static void heapSort(Comparable[] arr) {
		total = arr.length-1;

		for(int i=total/2;i>0;i--)
			heapify(arr, i);
		for(int i=total; i>0; i--) {
			swap(arr, 0, i);
			total--;
			heapify(arr, 0);
		}

	}

	public static void main(String[] args) {

		Integer[] array = {15,26,12,9,4,48,62}; 

		System.out.println("Before Heap Sorting...");
		for(int x : array) {
			System.out.print(x + "\t");
		}
		System.out.println("");

		heapSort(array);

		System.out.println("After Heap Sorting...");
		for(int x : array) {
			System.out.print(x + "\t");
		}
	}

}
