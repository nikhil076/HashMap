package com.bridgelabz.binary;

public class MyBinary<T extends Comparable<T>> {

	BinaryNode<T> root;
	
	
	public MyBinary(BinaryNode<T> root) {
		super();
		this.root = root;
	}

	public void insertData(T data)
	{
		root = insert(root, data);
	}
	
	public BinaryNode<T> insert(BinaryNode<T> root, T data)
	{
		BinaryNode<T> newNode = new BinaryNode<>();
		newNode.data = data;
		newNode.left= null;
		newNode.right=null;
		
		if(root == null)
		{
			root = newNode;
			return root;
		}
			if(root.data.compareTo(newNode.data)>0)
			{
				root.left = insert(root.left,data);
			}
			else if(root.data.compareTo(newNode.data)<0)
			{
				root.right = insert(root.right,data);
			}
			else
			{
				return root;
			}
//			System.out.println("---"+root);
		return root;
	}
	
	@Override
	public String toString() {
		return "MyBinary [root=" + root + "]";
	}

	public MyBinary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		MyBinary<Integer> binaryTree = new MyBinary<>();
		binaryTree.insertData(60);
		binaryTree.insertData(100);
		binaryTree.insertData(30);
		binaryTree.insertData(70);
//		int[] arr ={10,20,30,40};
//		for(int i=0;i<arr.length;i++)
//		{
//			binaryTree.insertData(arr[i]);
//		}
		System.out.println(binaryTree);
	}

}
