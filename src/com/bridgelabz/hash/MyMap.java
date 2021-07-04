package com.bridgelabz.hash;

import java.util.Objects;

public class MyMap<K,V> 
{
	LinkedListExample myLinkedList;

	public MyMap(LinkedListExample myLinkedList) {
		super();
		this.myLinkedList = myLinkedList;
	}
	
	public V get(K key)
	{
		MyMapNode<K,V> myMapNode = (MyMapNode<K,V>) this.myLinkedList.findElement(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
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
	public String toString() {
		return "MyMap [myLinkedList=" + myLinkedList + "]";
	}
	
	public static void main(String args[])
	{
		String sentence ="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedListHashMap<String, Integer> myLinkedHashMap = new MyLinkedListHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words)
		{
			Integer value = MyLinkedListHashMap.get(word);
			if(value = null)value = 1;
			else value = + 1;
			myLinkedHashMap.add(word, value);
		}
		System.out.println(myLinkedHashMap);
		int frequency = myLinkedHashMap("paranoid");
	}
}
