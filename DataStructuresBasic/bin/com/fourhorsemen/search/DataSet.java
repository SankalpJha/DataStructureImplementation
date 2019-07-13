package com.fourhoursemen.serach;

public class DataSet {

	int[] arr;
	int numOfTry;
	int size;
	
	public DataSet(int size) {
		arr = new int[size];
		for(int i=1;i<=size;i++) {
			arr[i-1] = i;
		}
		numOfTry=0;
	}
	
	public int getSize() {
		return arr.length;
	}
}
