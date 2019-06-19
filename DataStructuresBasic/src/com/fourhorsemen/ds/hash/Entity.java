package com.fourhorsemen.ds.hash;

public class Entity {

	private int key;
	private Object value;
	Entity next;
	
	public Entity(int key, Object value) {
		this.key = key;
		this.value = value;
		next = null;
	}
	//Initialize for first element
	public Entity() {
		next = null;
	}
	
	public int getKey() {
		return key;
	}
	
	public Object getValue() {
		return value;
	}
	
	
}
