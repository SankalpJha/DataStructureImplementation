package com.fourhorsemen.ds.hash;

public class HashMapImpl {

	public static void main(String[] args) {
		HashTableArray<String> hashMap = new HashTableArray<>(10);
		
		hashMap.put(15, "Sankalp");
		hashMap.put(18, "Anand");
		hashMap.put(13, "Anurag");
		hashMap.put(19, "Avnish");
		
		System.out.println(hashMap.get(19));
	}
}
