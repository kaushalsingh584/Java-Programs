package com.monocept.test;

import java.util.LinkedList;

public class CRUDLinkedList {

	public static void main(String[] args) {
		
		System.out.println("----------------Create operation----------------");
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(2, 30);
		linkedList.addLast(40);
		System.out.println("LinkedList created: "+ linkedList);

		
		//read
		System.out.println("----------------Read operation---------------");
		System.out.println("Element at first position: " + linkedList.get(0));
		System.out.println("Element at second position: " + linkedList.get(1));
		System.out.println("Element at third position: " + linkedList.get(2));
		System.out.println("Element at fourth position: " + linkedList.get(3));
		
		
		//update
		System.out.println("----------------Update operation----------------");
		linkedList.set(0, 30);
		System.out.println("Element at first position after updating: " + linkedList.get(0));
		
		//delete
		System.out.println("----------------Delete operation----------------");
		linkedList.pollFirst();
		System.out.println("ArrayList after removing element from the first position: " + linkedList);
		

	}

}
