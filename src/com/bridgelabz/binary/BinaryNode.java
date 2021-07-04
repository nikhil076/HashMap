package com.bridgelabz.binary;

public class BinaryNode<T extends Comparable<T>> {
	
	T data;
	BinaryNode<T> left;
	BinaryNode<T> right;
	
	public BinaryNode(T key)
	{
		super();
		this.data = key;
		this.left = null;
		this.right = null;
	}

	public BinaryNode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryNode<T> getLeft() {
		return left;
	}

	public void setLeft(BinaryNode<T> left) {
		this.left = left;
	}

	public BinaryNode<T> getRight() {
		return right;
	}

	public void setRight(BinaryNode<T> right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "BinaryNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}


}
