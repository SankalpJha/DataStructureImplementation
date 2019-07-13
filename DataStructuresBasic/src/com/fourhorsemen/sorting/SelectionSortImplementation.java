package com.fourhorsemen.sorting;

public class SelectionSortImplementation {

	static void selectionSort(int arr[]) {
		int length = arr.length;
		
		for(int i=0; i<length-1; i++) {
			int index=i;
			for(int j=i+1; j<length; j++) {
				if(arr[j]<arr[index])
					index=j;
			}
			if(index!=i) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		
int[] array = {15,26,12,9,4,48,62}; 
		
		System.out.println("Before Selection Sorting...");
		for(int x : array) {
			System.out.print(x + "\t");
		}
		System.out.println("");
		
		selectionSort(array);
		
		System.out.println("After Selection Sorting...");
		for(int x : array) {
			System.out.print(x + "\t");
		}
	}
}
