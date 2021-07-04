package com.bridgelabz.hash;

import demo.MyNode;

public class LinkedListExample<K,V> {
public static MyNode head;
	
	public void append(MyMapNode<K, V> myMapNode ) 
	{
		MyNode newNode = new MyNode();
		newNode.data = myMapNode;
		newNode.next = null;
		
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			MyNode tempNode = head;
			while(tempNode.next!=null)
			{
				tempNode= tempNode.next;
			}
			tempNode.next= newNode;
		}
	}
	public void findElement(K check)
	{
		MyNode current = head;    //Initialize current 
	    while (current != null) 
	    { 
	         if (current.data == check) 
	         {
	              System.out.println(check+" is present");
	         }
	         current = current.next; 
	    }  
	}
}
