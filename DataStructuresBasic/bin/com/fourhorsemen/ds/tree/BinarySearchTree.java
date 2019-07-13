package com.fourhorsemen.ds.tree;

public class BinarySearchTree {

	Node root;
	int size;

	public BinarySearchTree() {
		root=null;
	}

	public Node createNode(int value) {
		return new Node(value, null, null);
	}

	public void addNode(Node start, Node newNode) {
		if(root==null) {
			root=newNode;
			//System.out.println("New node added in root, with value " + newNode.value);
			return;
		}
		if(newNode.value > start.value) {
			if(start.right==null) {
				size++;
				start.right=newNode;
			}
			addNode(start.right, newNode);
			//System.out.println("New node added, with value " + newNode.value);
		}
		if(newNode.value < start.value) {
			if(start.left==null) {
				size++;
				start.left=newNode;
			}
			addNode(start.left, newNode);
			//System.out.println("New node added, with value " + newNode.value);
		}

	}

	public void find(int value, Node root) {

		if(root==null) {
			System.out.println("Value " + value + " not found in the tree");
			return;
		}

		if(value==root.value) {
			System.out.println("Value " + value + " found in the tree");
			return;
		}

		if(value > root.value)
			find(value, root.right);

		if(value < root.value)
			find(value, root.left);
	}

}
