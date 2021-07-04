package com.bridgelabz.hash;

public class MyNode<K> 
{
	K data ;
	MyNode next;
	
	public MyNode(K data, MyNode next) 
	{
		super();
		this.data = data;
		this.next = null;
	}
	public MyNode(K data) 
	{
		super();
		this.data = data;
		this.next = null;
	}
	public MyNode()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public K getData()
	{
		return data;
	}
	public void setData(K data) 
	{
		this.data = data;
	}
	public MyNode getNext()
	{
		return next;
	}
	public void setNext(MyNode next)
	{
		this.next = next;
	}
	@Override
	public String toString() 
	{
		return "MyNode [data=" + data + ", next=" + next + "]";
	}

}
