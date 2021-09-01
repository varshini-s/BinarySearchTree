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
		
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(70);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		
		 size=myBinaryTree.getSize();
		System.out.println("size of the tree is :"+size);
		Integer keyToCheck=63;
		System.out.println("checking if given key is present in tree :");
		System.out.println("key present: "+myBinaryTree.search(keyToCheck));

	}

}
