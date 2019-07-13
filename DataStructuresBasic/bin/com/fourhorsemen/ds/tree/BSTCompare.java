package com.fourhorsemen.ds.tree;

import java.util.HashSet;

public class BSTCompare {

	public static void main(String[] args) {

		new BSTCompare().run();
	}

	void run() {
		
		BinarySearchTree bst1 = new BinarySearchTree();

		bst1.addNode(bst1.root, bst1.createNode(10));
		bst1.addNode(bst1.root, bst1.createNode(11));
		bst1.addNode(bst1.root, bst1.createNode(12));
		//bst1.addNode(bst1.root, bst1.createNode(14));
		scanTree(bst1.root, true);
		
		BinarySearchTree bst2 = new BinarySearchTree();

		bst2.addNode(bst2.root, bst2.createNode(11));
		bst2.addNode(bst2.root, bst2.createNode(10));
		bst2.addNode(bst2.root, bst2.createNode(12));
		scanTree(bst2.root, false);
		
		if(bst1.size!=bst2.size || isEqual==false) {
			System.out.println("Trees are not equal");
		}else {
			System.out.println("Trees are equal");
		}
		
	}
	
	HashSet<Integer> set = new HashSet<>();
	boolean isEqual=true;
	void scanTree(Node node, boolean isSave) {
	
		if(node==null)
			return;
		
		//called by tree1
		if(isSave) {
			set.add(node.value);
		}else {
			if(!set.contains(node.value))
				isEqual=false;
		}
		
		scanTree(node.left, isSave);
		scanTree(node.right, isSave);
	}


}
