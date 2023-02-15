package com.monocept.test;

import java.util.HashSet;
import java.util.LinkedList;

public class CRUDHashSet {

	public static void main(String[] args) {
		
		System.out.println("----------------Create operation----------------");
		HashSet<Integer> hashset = new HashSet<Integer>();
		hashset.add(10);
		hashset.add(20);
		hashset.add(10);
		hashset.add(30);
		System.out.println("Hashset created: "+ hashset);
		
		//read
		System.out.println("----------------Read operation---------------");
		System.out.println("Element 10 is present in Hashset: " + hashset.contains(10));
		
		//update
		System.out.println("----------------Update operation----------------");
		hashset.remove(30);
		hashset.add(40);
		System.out.println("Element of hashset after updating: " + hashset);
		
		//delete
		System.out.println("----------------Delete operation----------------");
		hashset.remove(10);
		System.out.println("hashset after removing element 10: " + hashset);
		
	}

}
