package com.fourhorsemen.ds.hash;

public class HashTableArray<T> {

	Entity [] hashArray;
	int size;

	public HashTableArray(int size) {
		this.size = size;
		hashArray = new Entity[size];
		for(int i=0;i<size;i++)
			hashArray[i] = new Entity();
	}

	public int getHash(int key) {
		return key%size;
	}

	public void put(int key, Object value) {
		int hashIndex = getHash(key);
		Entity currentValue = hashArray[hashIndex];
		Entity newItem = new Entity(key, value);
		newItem.next=currentValue.next;
		currentValue.next=newItem;
	}

	public T get(int key) {
		T value = null;
		int hashIndex = getHash(key);
		Entity currentValue = hashArray[hashIndex];
		while(currentValue != null) {
			if(currentValue.getKey() == key) {
				value = (T) currentValue.getValue();
				break;
			}
			currentValue=currentValue.next;
		}
		return value;
	}
}
