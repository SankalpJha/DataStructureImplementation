package com.fourhorsemen;

public class Stack {

	int[] stack;
	int pointer = -1;
	
	public void push(int val) {
		if(this.pointer==this.stack.length-1) {
			System.out.println("Stack is FULL!!");
		}else {
			this.stack[this.pointer]=val;
			this.pointer=this.pointer+1;
		}
	}
	
	
	public void pop() {
		if(this.pointer==0) {
			this.stack=null;
		}
		this.stack[this.pointer]=0;
	}
	
	public void show() {
		for(int i=0; i<this.stack.length; i++) {
			System.out.println(i);
		}
	}
	
}
