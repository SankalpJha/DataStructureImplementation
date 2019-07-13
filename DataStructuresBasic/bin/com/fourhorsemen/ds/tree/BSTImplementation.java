package com.fourhorsemen.ds.tree;

public class BSTImplementation {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.addNode(bst.root, bst.createNode(10));
		bst.addNode(bst.root, bst.createNode(11));
		bst.addNode(bst.root, bst.createNode(12));
		bst.addNode(bst.root, bst.createNode(13));
		bst.addNode(bst.root, bst.createNode(6));
		bst.addNode(bst.root, bst.createNode(8));
		
		bst.find(11, bst.root);
		
	}
}
