package com.monocept.test;

import java.util.ArrayList;

public class CRUDArrayList {
	public static void main(String[] args) {
		
		// create
		System.out.println("----------------Create operation----------------");
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		System.out.println("----------------Create operation----------------");
		
		//read
		System.out.println("----------------Read operation---------------");
		System.out.println("Element at 0th index: " + arrayList.get(0));
		System.out.println("Element at 1st index: " + arrayList.get(1));
		
		//update
		System.out.println("----------------Update operation----------------");
		arrayList.set(0, 30);
		System.out.println("Element at 0th index after updating: " + arrayList.get(0));
		
		//delete
		System.out.println("----------------Delete operation----------------");
		arrayList.remove(1);
		System.out.println("ArrayList after removing element at 1st index: " + arrayList);
		
		
	}

}
