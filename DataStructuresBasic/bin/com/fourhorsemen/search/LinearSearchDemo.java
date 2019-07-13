package com.fourhoursemen.serach;

public class LinearSearchDemo {

	public static void main(String[] args) {
		
		DataSet data = new DataSet(10000);
		int searchElement=11111;
		boolean isFound=false;
		
		for(int j=0; j < data.getSize(); j++) {
			data.numOfTry++;
			if(data.arr[j] == searchElement) {
				System.out.println("It took " + data.numOfTry + " number of tries to find the element");
				isFound=true;
				break;
			}
		}
		
		if(!isFound) {
			System.out.println("Element not found");
		}
	}
}
