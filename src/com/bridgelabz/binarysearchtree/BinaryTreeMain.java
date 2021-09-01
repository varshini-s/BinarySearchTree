package com.bridgelabz.binarysearchtree;

public class BinaryTreeMain {

	public static void main(String[] args) 
	
	{
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size=myBinaryTree.getSize();
		System.out.println("size of the tree is :"+size);
		

	}

}
