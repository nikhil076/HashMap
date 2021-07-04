package com.bridgelabz.hash;

import java.util.ArrayList;

public class MyLinkedListHashMap<K, V> {
	int numBuckets;
	ArrayList<LinkedListExample> myBucketArray;
	
	public MyLinkedListHashMap()
	{
		this.numBuckets = 10;
		this.myBucketArray = new ArrayList<>(numBuckets);
		
		for(int i=0;i<numBuckets;i++)
		{
			this.myBucketArray.add(null);
		}
	}
	private int getBucketIndex(K key)
	{
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBuckets;
		return index;
	}
	public V get(K key)
	{
		int index = this.getBucketIndex(key);
		LinkedListExample myLinkedList = this.myBucketArray.get(index);
		if(myLinkedList == null) return null;
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.findElement(key);
		return (myMapNode == null) ? null : myMapNode.getValue;
	}
	public void add(K key,V value)
	{
		int index = this.getBucketIndex(key);
		LinkedListExample myLinkedList = this.myBucketArray.get(index);
		if(myLinkedList == null)
		{
			myLinkedList = new LinkedListExample<>();
			this.myBucketArray.set(index,myLinkedList);
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.findElement(key);
		if(myMapNode == null)
		{
			myMapNode = new MyMapNode<K, V>(key, value);
			myLinkedList.append(myMapNode);
		}
		else
		{
			myMapNode.setValue(value);
		}
	}
	@Override
	public String toString() {
		return "MyLinkedListMap [numBuckets=" + numBuckets + "]";
	}
}


