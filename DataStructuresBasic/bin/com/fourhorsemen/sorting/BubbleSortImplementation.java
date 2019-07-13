package com.fourhorsemen.sorting;

public class BubbleSortImplementation {

	static void bubbleSort(int arr[]) {
	
		int length = arr.length;
		int temp=0;
		
		for(int i=0; i<length; i++) {
			for(int j=1; j<length-i; j++) {
				
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}			
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int[] array = {15,26,12,9,4,48,62}; 
		
		System.out.println("Before Bubble Sorting...");
		for(int x : array) {
			System.out.print(x + "\t");
		}
		System.out.println("");
		
		bubbleSort(array);
		
		System.out.println("After Bubble Sorting...");
		for(int x : array) {
			System.out.print(x + "\t");
		}
	}
}
