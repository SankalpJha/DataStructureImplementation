package com.fourhorsemen.sorting;

public class QuickSortImplementation {

	static void quickSort(int arr[], int low, int high) {
		
		if(low>high)
			return;
		int mid = low+(high-low)/2;
		int pivot = arr[mid];
		int i=low;
		int j=high;
		
		while(i<=j) {
			while(arr[i]<pivot)
				i++;
			while(arr[j]>pivot)
				j--;
			
			if(i<=j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		if(low<j)
			quickSort(arr, low, j);
		if(high>i)
			quickSort(arr, i, high);
	}

	public static void main(String[] args) {
		
		int[] array = {15,26,12,9,4,48,62}; 
				
				System.out.println("Before Quick Sorting...");
				for(int x : array) {
					System.out.print(x + "\t");
				}
				System.out.println("");
				
				quickSort(array, 0, array.length-1);
				
				System.out.println("After Quick Sorting...");
				for(int x : array) {
					System.out.print(x + "\t");
				}
			}
}
