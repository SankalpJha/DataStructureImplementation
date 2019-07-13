package com.fourhoursemen.serach;

public class InterpolationSearchDemo {

	public static void main(String[] args) {
		DataSet data = new DataSet(10000);
		int searchElement=5001;
		boolean isFound=false;
		
		//attributes used in interpolation search
		int low=0;
		int high=data.getSize()-1;
		int mid=0;
		
		while(!isFound) {
			
			if(low>high) {
				System.out.println("Element Not Found!!");
				break;
			}
			data.numOfTry++;
			mid=low+((high-low)/(data.arr[high]-
					data.arr[low]))*(searchElement-data.arr[low]);
			if(data.arr[mid]==searchElement) {
				System.out.println("It took " + data.numOfTry + " number of tries to find the element");
				isFound=true;
				break;
			}
			if(data.arr[mid]<searchElement)
				low=mid+1;
			if(data.arr[mid]>searchElement)
				high=mid-1;
		}

	}

}
