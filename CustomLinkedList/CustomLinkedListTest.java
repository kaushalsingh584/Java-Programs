package com.monocept.test;

import java.util.ArrayList;

import com.monocept.model.CustomLinkedList;
import com.monocept.model.Node;

public class CustomLinkedListTest {

	public static void main(String[] args) {
		
		CustomLinkedList list = new CustomLinkedList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(10);
		System.out.println("Elements of the CustomLinkedList after adding are: ");
		list.display();
		
		list.remove(30);
		list.remove(10);
		System.out.println("Elements of the CustomLinkedList after removing 30 and 10 are: ");
		list.display();
		
		System.out.println("Elements of the CustomLinkedList after interating through arraylist: ");
		ArrayList<Integer>items = list.iterate();
		for(Integer item : items)
			System.out.println(item);
		
		
		
	}

}
