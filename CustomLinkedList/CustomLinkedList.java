package com.monocept.model;

import java.util.LinkedList;

public class CustomLinkedList {

	private LinkedList<Integer> linkedList;

	public CustomLinkedList() {
		super();
		this.linkedList = new LinkedList<Integer>();
	}

	public void add(int num) {
		linkedList.add(num);
	}

	public void remove(Integer num) {
		linkedList.remove(num);
	}

	public LinkedList<Integer> display() {
		return linkedList;
	}

}
