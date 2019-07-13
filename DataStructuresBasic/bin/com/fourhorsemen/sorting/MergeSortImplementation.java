package com.fourhorsemen.sorting;

public class MergeSortImplementation {

	
	static int[]  mergeSort(int[] arr) {
		
		int length = arr.length;
		int x=0;
		
		if(length<1)
			return arr;
		
		int mid = length/2;
		
		int[] leftArr = new int[mid];
		int[] rightArr = new int[(length-1)-mid];
		
		for(int i=0; i<mid-1; i++) 
			leftArr[i] = arr[i];
		
		for(int i=mid; i<length-1; i++) {
			rightArr[x] = arr[i];
			x++;
		}
		mergeSort(leftArr);
		mergeSort(rightArr);
		merge(arr,leftArr,rightArr);
		
		return arr;
	}
	
	static void merge(int[] arr, int[] leftArr, int[] rightArr) {
		
		int i=0,j=0,k=0;
		
		int arrLen=arr.length;
		int leftArrLen=leftArr.length;
		int rightArrLen=rightArr.length;
		
		while(i<leftArrLen && j<rightArrLen) {
			if(leftArr[i]<=rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
				k++;
			}else {
				arr[k] = rightArr[j];
				j++;
				k++;
			}
			
			while(i<leftArrLen) {
				arr[k] = leftArr[i];
				i++;
				k++;
			}
			while(j<rightArrLen) {
				arr[k] = rightArr[j];
				j++;
				k++;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int[] array = {15,26,12,9,4,48,62}; 
		
		System.out.println("Before Merge Sorting...");
		for(int x : array) {
			System.out.print(x + "\t");
		}
		System.out.println("");
		
		mergeSort(array);
		
		System.out.println("After Merge Sorting...");
		for(int x : array) {
			System.out.print(x + "\t");
		}
	}
}
