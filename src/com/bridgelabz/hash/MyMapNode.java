package com.bridgelabz.hash;

public class MyMapNode<K,V> {
	K key;
	V value;
	MyMapNode<K, V> next;
	
	public MyMapNode(K key,V value)
	{
		
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public MyMapNode<K, V> getNext() {
		return next;
	}

	public void setNext(MyMapNode<K, V> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append("MyMapNode{" + "K=").append(key).append("V=").append(value).append("}");
		if(next!=null)
			myMapNodeString.append("--").append(next);
		return myMapNodeString.toString();
	}
	
	
}
