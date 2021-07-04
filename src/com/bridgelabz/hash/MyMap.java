package com.bridgelabz.hash;

import java.util.Objects;

public class MyMap<K,V> 
{
	LinkedListExample myLinkedList;

	public MyMap(LinkedListExample myLinkedList)
	{
		super();
		this.myLinkedList = myLinkedList;
	}

	public void add(K key, V value)
	{
		MyMapNode<K, V> myMapNode = (MyMapNode<K,V>) this.myLinkedList.findElement(key);
		
		if(myMapNode == null)
		{
			myMapNode = new MyMapNode<K,V>(key, value);
			this.myLinkedList.append(myMapNode);
		}
		else 
		{
			myMapNode.setValue(value);
		}
	}

	@Override
	public String toString() 
	{
		return "MyMap [myLinkedList=" + myLinkedList + "]";
	}
	
	
	public static void main(String args[])
	{
		String sentence = "To be or not to be";
		MyMap<String, Integer> myMap = new MyMap<>();
		String word = sentence.toLowerCase().split(" ");
		for(String word : words)
		{
			Integer value = myMap.get(Word);
			if(value == null)
			{
				value = 1;
			}
			else
			{
				value = value + 1;
			}
			myMap.add(word, value);
		}
		int frequency = myMap.get("to");
		System.out.println(myMap);
	}
}
